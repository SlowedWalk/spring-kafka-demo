package tech.hidetora.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WikimediaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        log.info("sending message = '{}' to topic wikimedia-stream", message);
        kafkaTemplate.send("wikimedia-stream", message);
    }
}
