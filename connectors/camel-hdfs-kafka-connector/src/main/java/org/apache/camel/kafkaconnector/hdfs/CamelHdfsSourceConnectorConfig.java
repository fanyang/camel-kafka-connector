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
 */package org.apache.camel.kafkaconnector.hdfs;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelHdfsSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_HDFS_PATH_HOST_NAME_CONF = "camel.source.path.hostName";
    public static final String CAMEL_SOURCE_HDFS_PATH_HOST_NAME_DOC = "HDFS host to use";
    public static final String CAMEL_SOURCE_HDFS_PATH_HOST_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_PATH_PORT_CONF = "camel.source.path.port";
    public static final String CAMEL_SOURCE_HDFS_PATH_PORT_DOC = "HDFS port to use";
    public static final Integer CAMEL_SOURCE_HDFS_PATH_PORT_DEFAULT = 8020;
    public static final String CAMEL_SOURCE_HDFS_PATH_PATH_CONF = "camel.source.path.path";
    public static final String CAMEL_SOURCE_HDFS_PATH_PATH_DOC = "The directory path to use";
    public static final String CAMEL_SOURCE_HDFS_PATH_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_CONNECT_ON_STARTUP_CONF = "camel.source.endpoint.connectOnStartup";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_CONNECT_ON_STARTUP_DOC = "Whether to connect to the HDFS file system on starting the producer/consumer. If false then the connection is created on-demand. Notice that HDFS may take up till 15 minutes to establish a connection, as it has hardcoded 45 x 20 sec redelivery. By setting this option to false allows your application to startup, and not block for up till 15 minutes.";
    public static final Boolean CAMEL_SOURCE_HDFS_ENDPOINT_CONNECT_ON_STARTUP_DEFAULT = true;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_CONF = "camel.source.endpoint.fileSystemType";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_DOC = "Set to LOCAL to not use HDFS but local java.io.File instead. One of: [LOCAL] [HDFS]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_DEFAULT = "HDFS";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_FILE_TYPE_CONF = "camel.source.endpoint.fileType";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_FILE_TYPE_DOC = "The file type to use. For more details see Hadoop HDFS documentation about the various files types. One of: [NORMAL_FILE] [SEQUENCE_FILE] [MAP_FILE] [BLOOMMAP_FILE] [ARRAY_FILE]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_FILE_TYPE_DEFAULT = "NORMAL_FILE";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KEY_TYPE_CONF = "camel.source.endpoint.keyType";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KEY_TYPE_DOC = "The type for the key in case of sequence or map files. One of: [NULL] [BOOLEAN] [BYTE] [SHORT] [INT] [FLOAT] [LONG] [DOUBLE] [TEXT] [BYTES]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KEY_TYPE_DEFAULT = "NULL";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_NAMED_NODES_CONF = "camel.source.endpoint.namedNodes";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_NAMED_NODES_DOC = "A comma separated list of named nodes (e.g. srv11.example.com:8020,srv12.example.com:8020)";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_NAMED_NODES_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_OWNER_CONF = "camel.source.endpoint.owner";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_OWNER_DOC = "The file owner must match this owner for the consumer to pickup the file. Otherwise the file is skipped.";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_OWNER_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_VALUE_TYPE_CONF = "camel.source.endpoint.valueType";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_VALUE_TYPE_DOC = "The type for the key in case of sequence or map files One of: [NULL] [BOOLEAN] [BYTE] [SHORT] [INT] [FLOAT] [LONG] [DOUBLE] [TEXT] [BYTES]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_VALUE_TYPE_DEFAULT = "BYTES";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_PATTERN_CONF = "camel.source.endpoint.pattern";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_PATTERN_DOC = "The pattern used for scanning the directory";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_PATTERN_DEFAULT = "*";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_HDFS_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_STREAM_DOWNLOAD_CONF = "camel.source.endpoint.streamDownload";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_STREAM_DOWNLOAD_DOC = "Sets the download method to use when not using a local working directory. If set to true, the remote files are streamed to the route as they are read. When set to false, the remote files are loaded into memory before being sent into the route.";
    public static final Boolean CAMEL_SOURCE_HDFS_ENDPOINT_STREAM_DOWNLOAD_DEFAULT = false;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions (if possible) occurred while the Camel consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. Important: This is only possible if the 3rd party component allows Camel to be alerted if an exception was thrown. Some components handle this internally only, and therefore bridgeErrorHandler is not possible. In other situations we may improve the Camel component to hook into the 3rd party component and make this possible for future releases. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_HDFS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BLOCK_SIZE_CONF = "camel.source.endpoint.blockSize";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BLOCK_SIZE_DOC = "The size of the HDFS blocks";
    public static final Long CAMEL_SOURCE_HDFS_ENDPOINT_BLOCK_SIZE_DEFAULT = 67108864L;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BUFFER_SIZE_CONF = "camel.source.endpoint.bufferSize";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BUFFER_SIZE_DOC = "The buffer size used by HDFS";
    public static final Integer CAMEL_SOURCE_HDFS_ENDPOINT_BUFFER_SIZE_DEFAULT = 4096;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_CONF = "camel.source.endpoint.checkIdleInterval";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_DOC = "How often (time in millis) in to run the idle checker background task. This option is only in use if the splitter strategy is IDLE.";
    public static final Integer CAMEL_SOURCE_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_DEFAULT = 500;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_CHUNK_SIZE_CONF = "camel.source.endpoint.chunkSize";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_CHUNK_SIZE_DOC = "When reading a normal file, this is split into chunks producing a message per chunk.";
    public static final Integer CAMEL_SOURCE_HDFS_ENDPOINT_CHUNK_SIZE_DEFAULT = 4096;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_CODEC_CONF = "camel.source.endpoint.compressionCodec";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_CODEC_DOC = "The compression codec to use One of: [DEFAULT] [GZIP] [BZIP2] [SNAPPY] [LZ4] [ZSTANDARD]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_CODEC_DEFAULT = "DEFAULT";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_TYPE_CONF = "camel.source.endpoint.compressionType";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_TYPE_DOC = "The compression type to use (is default not in use) One of: [NONE] [RECORD] [BLOCK]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_TYPE_DEFAULT = "NONE";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_OPENED_SUFFIX_CONF = "camel.source.endpoint.openedSuffix";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_OPENED_SUFFIX_DOC = "When a file is opened for reading/writing the file is renamed with this suffix to avoid to read it during the writing phase.";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_OPENED_SUFFIX_DEFAULT = "opened";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_READ_SUFFIX_CONF = "camel.source.endpoint.readSuffix";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_READ_SUFFIX_DOC = "Once the file has been read is renamed with this suffix to avoid to read it again.";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_READ_SUFFIX_DEFAULT = "read";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_REPLICATION_CONF = "camel.source.endpoint.replication";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_REPLICATION_DOC = "The HDFS replication factor";
    public static final Short CAMEL_SOURCE_HDFS_ENDPOINT_REPLICATION_DEFAULT = 3;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SPLIT_STRATEGY_CONF = "camel.source.endpoint.splitStrategy";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SPLIT_STRATEGY_DOC = "In the current version of Hadoop opening a file in append mode is disabled since it's not very reliable. So, for the moment, it's only possible to create new files. The Camel HDFS endpoint tries to solve this problem in this way: If the split strategy option has been defined, the hdfs path will be used as a directory and files will be created using the configured UuidGenerator. Every time a splitting condition is met, a new file is created. The splitStrategy option is defined as a string with the following syntax: splitStrategy=ST:value,ST:value,... where ST can be: BYTES a new file is created, and the old is closed when the number of written bytes is more than value MESSAGES a new file is created, and the old is closed when the number of written messages is more than value IDLE a new file is created, and the old is closed when no writing happened in the last value milliseconds";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SPLIT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_MAX_MESSAGES_PER_POLL_CONF = "camel.source.endpoint.maxMessagesPerPoll";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_MAX_MESSAGES_PER_POLL_DOC = "To define a maximum messages to gather per poll. By default a limit of 100 is set. Can be used to set a limit of e.g. 1000 to avoid when starting up the server that there are thousands of files. Values can only be greater than 0. Notice: If this option is in use then the limit will be applied on the valid files. For example if you have 100000 files and use maxMessagesPerPoll=500, then only the first 500 files will be picked up.";
    public static final Integer CAMEL_SOURCE_HDFS_ENDPOINT_MAX_MESSAGES_PER_POLL_DEFAULT = 100;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll.";
    public static final Long CAMEL_SOURCE_HDFS_ENDPOINT_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_HDFS_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts.";
    public static final Long CAMEL_SOURCE_HDFS_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_HDFS_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component. Use value spring or quartz for built in scheduler";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_HDFS_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_HDFS_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_CONF = "camel.source.endpoint.kerberosConfigFileLocation";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_DOC = "The location of the kerb5.conf file (https://web.mit.edu/kerberos/krb5-1.12/doc/admin/conf_files/krb5_conf.html)";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_CONF = "camel.source.endpoint.kerberosKeytabLocation";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_DOC = "The location of the keytab file used to authenticate with the kerberos nodes (contains pairs of kerberos principals and encrypted keys (which are derived from the Kerberos password))";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_USERNAME_CONF = "camel.source.endpoint.kerberosUsername";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_USERNAME_DOC = "The username used to authenticate with the kerberos nodes";
    public static final String CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.hdfs.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions (if possible) occurred while the Camel consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. Important: This is only possible if the 3rd party component allows Camel to be alerted if an exception was thrown. Some components handle this internally only, and therefore bridgeErrorHandler is not possible. In other situations we may improve the Camel component to hook into the 3rd party component and make this possible for future releases. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_HDFS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.hdfs.autowiredEnabled";
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_HDFS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_CONF = "camel.component.hdfs.healthCheckConsumerEnabled";
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DOC = "Used for enabling or disabling all consumer based health checks from this component";
    public static final Boolean CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_CONF = "camel.component.hdfs.healthCheckProducerEnabled";
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DOC = "Used for enabling or disabling all producer based health checks from this component. Notice: Camel has by default disabled all producer based health-checks. You can turn on producer checks globally by setting camel.health.producersEnabled=true.";
    public static final Boolean CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_JAASCONFIGURATION_CONF = "camel.component.hdfs.jAASConfiguration";
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_JAASCONFIGURATION_DOC = "To use the given configuration for security with JAAS.";
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_JAASCONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_CONF = "camel.component.hdfs.kerberosConfigFile";
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_DOC = "To use kerberos authentication, set the value of the 'java.security.krb5.conf' environment variable to an existing file. If the environment variable is already set, warn if different than the specified parameter";
    public static final String CAMEL_SOURCE_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_DEFAULT = null;

    public CamelHdfsSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelHdfsSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_HDFS_PATH_HOST_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_PATH_HOST_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_HDFS_PATH_HOST_NAME_DOC);
        conf.define(CAMEL_SOURCE_HDFS_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HDFS_PATH_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_PATH_PORT_DOC);
        conf.define(CAMEL_SOURCE_HDFS_PATH_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_PATH_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_HDFS_PATH_PATH_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_CONNECT_ON_STARTUP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_ENDPOINT_CONNECT_ON_STARTUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_CONNECT_ON_STARTUP_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_FILE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_FILE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_FILE_TYPE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_KEY_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_KEY_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_KEY_TYPE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_NAMED_NODES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_NAMED_NODES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_NAMED_NODES_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_OWNER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_OWNER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_OWNER_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_VALUE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_VALUE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_VALUE_TYPE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_STREAM_DOWNLOAD_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_ENDPOINT_STREAM_DOWNLOAD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_STREAM_DOWNLOAD_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_BLOCK_SIZE_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_HDFS_ENDPOINT_BLOCK_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_BLOCK_SIZE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_BUFFER_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HDFS_ENDPOINT_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_CHUNK_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HDFS_ENDPOINT_CHUNK_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_CHUNK_SIZE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_CODEC_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_CODEC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_CODEC_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_COMPRESSION_TYPE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_OPENED_SUFFIX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_OPENED_SUFFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_OPENED_SUFFIX_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_READ_SUFFIX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_READ_SUFFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_READ_SUFFIX_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_REPLICATION_CONF, ConfigDef.Type.SHORT, CAMEL_SOURCE_HDFS_ENDPOINT_REPLICATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_REPLICATION_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_SPLIT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_SPLIT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_SPLIT_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_MAX_MESSAGES_PER_POLL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HDFS_ENDPOINT_MAX_MESSAGES_PER_POLL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_MAX_MESSAGES_PER_POLL_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_HDFS_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_HDFS_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_HDFS_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_DOC);
        conf.define(CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_ENDPOINT_KERBEROS_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_HDFS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_HDFS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_HDFS_COMPONENT_JAASCONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_COMPONENT_JAASCONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_COMPONENT_JAASCONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_DOC);
        return conf;
    }
}