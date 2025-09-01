package pe.ffernacu.infrastructure.provider;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import pe.ffernacu.domain.PublishProvider;
import pe.ffernacu.domain.avro.EventPublisherExecution;

@Slf4j
@Service
@RequiredArgsConstructor
public class PublishProviderImpl implements PublishProvider {
    private final StreamBridge streamBridge;
    @Override
    public void send(EventPublisherExecution eventPublisherExecution) {
        log.info("send publisher: {}", eventPublisherExecution);
        try {
            var bytes = eventPublisherExecution.toByteBuffer().array();
            Message<byte[]> message = MessageBuilder.withPayload(bytes).build();
            streamBridge.send("producer-out-0", message);
            log.info("message sent successfully");
        }
        catch (Exception e){
            log.error("Error: ", e);
        }
    }
}
