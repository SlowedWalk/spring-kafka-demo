package tech.hidetora.kafkatutorial.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author hidetora
 * @version 1.0.0
 * @since 2022/04/18
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Sending message to hidetora topic :: '{}'", message);
        kafkaTemplate.send("hidetora", message);
    }
}
