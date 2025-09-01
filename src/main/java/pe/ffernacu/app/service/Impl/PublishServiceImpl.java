package pe.ffernacu.app.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.ffernacu.app.dto.EventPublisherDTO;
import pe.ffernacu.app.mapper.PublisherMapper;
import pe.ffernacu.app.service.PublishService;
import pe.ffernacu.domain.PublishProvider;

@Service
@RequiredArgsConstructor
public class PublishServiceImpl implements PublishService {

    private final PublisherMapper publisherMapper;
    private final PublishProvider publishProvider;
    @Override
    public void sendMessage(EventPublisherDTO eventPublisherDTO) {
        var eventPublisherExecution = publisherMapper.map(eventPublisherDTO);
        publishProvider.send(eventPublisherExecution);
    }
}
