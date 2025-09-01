package pe.ffernacu.app.event;

import org.springframework.messaging.Message;

import java.util.function.Consumer;

public interface KafkaListener {
    Consumer<Message<byte[]>> consumer();
}
