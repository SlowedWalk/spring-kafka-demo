package tech.hidetora.kafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author hidetora
 * @version 1.0.0
 * @since 2022/04/18
 */

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic hidetoraTopic() {
        return TopicBuilder
                .name("hidetora")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
