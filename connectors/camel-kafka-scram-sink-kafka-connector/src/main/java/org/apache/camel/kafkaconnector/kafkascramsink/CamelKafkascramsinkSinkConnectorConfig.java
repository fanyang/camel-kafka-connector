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
package org.apache.camel.kafkaconnector.kafkascramsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelKafkascramsinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_TOPIC_CONF = "camel.kamelet.kafka-scram-sink.topic";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_TOPIC_DOC = "Comma separated list of Kafka topic names";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_TOPIC_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_BOOTSTRAP_SERVERS_CONF = "camel.kamelet.kafka-scram-sink.bootstrapServers";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_BOOTSTRAP_SERVERS_DOC = "Comma separated list of Kafka Broker URLs";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_BOOTSTRAP_SERVERS_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SECURITY_PROTOCOL_CONF = "camel.kamelet.kafka-scram-sink.securityProtocol";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SECURITY_PROTOCOL_DOC = "Protocol used to communicate with brokers. SASL_PLAINTEXT, PLAINTEXT, SASL_SSL and SSL are supported";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SECURITY_PROTOCOL_DEFAULT = "SASL_SSL";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SASL_MECHANISM_CONF = "camel.kamelet.kafka-scram-sink.saslMechanism";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SASL_MECHANISM_DOC = "The Simple Authentication and Security Layer (SASL) Mechanism used.";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SASL_MECHANISM_DEFAULT = "SCRAM-SHA-512";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_USER_CONF = "camel.kamelet.kafka-scram-sink.user";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_USER_DOC = "Username to authenticate to Kafka";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_USER_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_PASSWORD_CONF = "camel.kamelet.kafka-scram-sink.password";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_PASSWORD_DOC = "Password to authenticate to kafka";
    public static final String CAMEL_SINK_KAFKASCRAMSINK_KAMELET_PASSWORD_DEFAULT = null;

    public CamelKafkascramsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelKafkascramsinkSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_KAFKASCRAMSINK_KAMELET_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_TOPIC_DOC);
        conf.define(CAMEL_SINK_KAFKASCRAMSINK_KAMELET_BOOTSTRAP_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_BOOTSTRAP_SERVERS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_BOOTSTRAP_SERVERS_DOC);
        conf.define(CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SECURITY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SECURITY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SECURITY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SASL_MECHANISM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SASL_MECHANISM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_SASL_MECHANISM_DOC);
        conf.define(CAMEL_SINK_KAFKASCRAMSINK_KAMELET_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_USER_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_USER_DOC);
        conf.define(CAMEL_SINK_KAFKASCRAMSINK_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASCRAMSINK_KAMELET_PASSWORD_DOC);
        return conf;
    }
}