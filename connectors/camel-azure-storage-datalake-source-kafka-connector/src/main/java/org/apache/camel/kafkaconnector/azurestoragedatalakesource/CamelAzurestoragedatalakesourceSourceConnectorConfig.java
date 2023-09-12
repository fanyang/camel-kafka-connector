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
 */package org.apache.camel.kafkaconnector.azurestoragedatalakesource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzurestoragedatalakesourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_ACCOUNT_NAME_CONF = "camel.kamelet.azure-storage-datalake-source.accountName";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_ACCOUNT_NAME_DOC = "The Azure Storage Blob Data lake account name.";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_ACCOUNT_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_ID_CONF = "camel.kamelet.azure-storage-datalake-source.clientId";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_ID_DOC = "The Azure Storage Blob Data lake client Id.";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_SECRET_CONF = "camel.kamelet.azure-storage-datalake-source.clientSecret";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_SECRET_DOC = "The Azure Storage Blob Data lake client secret.";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_TENANT_ID_CONF = "camel.kamelet.azure-storage-datalake-source.tenantId";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_TENANT_ID_DOC = "The Azure Storage Blob Data lake tenant id.";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_TENANT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_FILE_SYSTEM_NAME_CONF = "camel.kamelet.azure-storage-datalake-source.fileSystemName";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_FILE_SYSTEM_NAME_DOC = "The Azure Storage Blob Data lake File system name.";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_FILE_SYSTEM_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_DELAY_CONF = "camel.kamelet.azure-storage-datalake-source.delay";
    public static final String CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_DELAY_DOC = "The number of milliseconds before the next poll of the selected blob.";
    public static final Integer CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_DELAY_DEFAULT = 500;

    public CamelAzurestoragedatalakesourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzurestoragedatalakesourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_ACCOUNT_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_ID_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_ID_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_TENANT_ID_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_TENANT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_TENANT_ID_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_FILE_SYSTEM_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_FILE_SYSTEM_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_FILE_SYSTEM_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEDATALAKESOURCE_KAMELET_DELAY_DOC);
        return conf;
    }
}