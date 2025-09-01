package pe.ffernacu.domain;

import pe.ffernacu.domain.avro.EventPublisherExecution;

public interface PublishProvider {
    void send(EventPublisherExecution eventPublisherExecution);
}
