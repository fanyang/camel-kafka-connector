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
package org.apache.camel.kafkaconnector.googlecalendarsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGooglecalendarsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_INDEX_CONF = "camel.kamelet.google-calendar-source.index";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_INDEX_DOC = "An index for the google calendar endpoint";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_INDEX_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CALENDAR_ID_CONF = "camel.kamelet.google-calendar-source.calendarId";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CALENDAR_ID_DOC = "The calendar ID to be used as events source";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CALENDAR_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_ID_CONF = "camel.kamelet.google-calendar-source.clientId";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_ID_DOC = "Client ID of the calendar application";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_SECRET_CONF = "camel.kamelet.google-calendar-source.clientSecret";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_SECRET_DOC = "Client Secret of the calendar application";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_ACCESS_TOKEN_CONF = "camel.kamelet.google-calendar-source.accessToken";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_ACCESS_TOKEN_DOC = "OAuth 2 access token for google calendar application. This typically expires after an hour so refreshToken is recommended for long term usage.";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_REFRESH_TOKEN_CONF = "camel.kamelet.google-calendar-source.refreshToken";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_REFRESH_TOKEN_DOC = "OAuth 2 refresh token for google calendar application. Using this, the Google Calendar component can obtain a new accessToken whenever the current one expires - a necessity if the application is long-lived.";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_REFRESH_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_DELAY_CONF = "camel.kamelet.google-calendar-source.delay";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_DELAY_DOC = "Milliseconds before the next poll";
    public static final Integer CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_DELAY_DEFAULT = 500;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_APPLICATION_NAME_CONF = "camel.kamelet.google-calendar-source.applicationName";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_APPLICATION_NAME_DOC = "Google Calendar application name";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_APPLICATION_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_SYNC_FLOW_CONF = "camel.kamelet.google-calendar-source.syncFlow";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_SYNC_FLOW_DOC = "Sync events for incremental synchronization";
    public static final Boolean CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_SYNC_FLOW_DEFAULT = false;
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CONSUME_FROM_NOW_CONF = "camel.kamelet.google-calendar-source.consumeFromNow";
    public static final String CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CONSUME_FROM_NOW_DOC = "Consume events in the selected calendar from now on";
    public static final Boolean CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CONSUME_FROM_NOW_DEFAULT = true;

    public CamelGooglecalendarsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGooglecalendarsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_INDEX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_INDEX_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_INDEX_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CALENDAR_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CALENDAR_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CALENDAR_ID_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_ID_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_ID_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_REFRESH_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_REFRESH_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_REFRESH_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_DELAY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_APPLICATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_APPLICATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_APPLICATION_NAME_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_SYNC_FLOW_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_SYNC_FLOW_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_SYNC_FLOW_DOC);
        conf.define(CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CONSUME_FROM_NOW_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CONSUME_FROM_NOW_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLECALENDARSOURCE_KAMELET_CONSUME_FROM_NOW_DOC);
        return conf;
    }
}