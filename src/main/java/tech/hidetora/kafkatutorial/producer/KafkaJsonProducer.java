package tech.hidetora.kafkatutorial.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import tech.hidetora.kafkatutorial.payload.Student;

/**
 * @author hidetora
 * @version 1.0.0
 * @since 2022/04/18
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {
    private final KafkaTemplate<String, Student> kafkaTemplate;

    public void sendMessage(Student student) {
        Message<Student> message = MessageBuilder
                .withPayload(student)
                .setHeader(KafkaHeaders.TOPIC, "hidetora")
                .build();

        log.info("Sending message to hidetora topic :: '{}'", message);
        kafkaTemplate.send(message);
    }
}
