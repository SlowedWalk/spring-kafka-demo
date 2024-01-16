package tech.hidetora.producer.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.hidetora.producer.stream.WikimediaStreamConsumer;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaController {
    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    @GetMapping
    public void start() {
        wikimediaStreamConsumer.consumeStreamAndPublish();
    }
}
