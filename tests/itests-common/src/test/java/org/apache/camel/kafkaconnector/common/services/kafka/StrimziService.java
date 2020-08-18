/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.common.services.kafka;

import org.apache.camel.kafkaconnector.common.utils.TestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.containers.Network;

public class StrimziService implements KafkaService {
    private static final Logger LOG = LoggerFactory.getLogger(StrimziService.class);
    private static ZookeeperContainer zookeeperContainer;
    private static StrimziContainer strimziContainer;

    public StrimziService() {

        if (zookeeperContainer == null && strimziContainer == null) {

            Network network = Network.newNetwork();

            if (zookeeperContainer == null) {
                zookeeperContainer = new ZookeeperContainer(network, "zookeeper");
            }

            if (strimziContainer == null) {
                strimziContainer = new StrimziContainer(network, "strimzi");
            }
        }
    }

    private Integer getKafkaPort() {
        return strimziContainer.getKafkaPort();
    }

    @Override
    public String getBootstrapServers() {
        return strimziContainer.getContainerIpAddress() + ":" + getKafkaPort();
    }

    @Override
    public void initialize() {
        if (!zookeeperContainer.isRunning()) {
            zookeeperContainer.start();
        }

        String zookeeperConnect = "zookeeper:" + zookeeperContainer.getZookeeperPort();
        LOG.info("Apache Zookeeper running at address {}", zookeeperConnect);

        if (!strimziContainer.isRunning()) {
            strimziContainer.start();
        }

        LOG.info("Kafka bootstrap server running at address {}", getBootstrapServers());
    }

    private boolean stopped() {
        return !strimziContainer.isRunning() && !zookeeperContainer.isRunning();
    }

    @Override
    public void shutdown() {
        try {
            LOG.info("Stopping Kafka container");
            strimziContainer.stop();

            TestUtils.waitFor(this::stopped);
        } finally {
            LOG.info("Stopping Zookeeper container");
            zookeeperContainer.stop();
        }
    }
}