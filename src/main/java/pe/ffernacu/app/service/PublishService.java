package pe.ffernacu.app.service;

import pe.ffernacu.app.dto.EventPublisherDTO;

public interface PublishService {
    void sendMessage(EventPublisherDTO eventPublisherDTO);

}
