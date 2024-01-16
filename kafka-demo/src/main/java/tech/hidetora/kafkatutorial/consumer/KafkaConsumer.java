package tech.hidetora.kafkatutorial.consumer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tech.hidetora.kafkatutorial.payload.Student;

import java.util.logging.Logger;

/**
 * @author hidetora
 * @version 1.0.0
 * @since 2022/04/18
 */
@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "hidetora", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info("Consuming message from hidetora topic :: {}", message);
    }

    @KafkaListener(topics = "hidetora", groupId = "demo01")
    public void consumeJsonMessage(Student student) {
        log.info("Consuming message from hidetora topic :: {}", student.toString());
    }
}
