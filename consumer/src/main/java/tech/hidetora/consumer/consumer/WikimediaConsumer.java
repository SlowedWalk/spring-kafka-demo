package tech.hidetora.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "wikiGroup")
    public void consumeMessage(String message) {
        log.info("Consuming message from hidetora topic :: {}", message);
    }

}