package pe.ffernacu.app.mapper;

import org.mapstruct.Mapper;
import pe.ffernacu.app.dto.EventPublisherDTO;
import pe.ffernacu.domain.avro.EventPublisherExecution;

@Mapper(componentModel = "spring")
public interface PublisherMapper {
    EventPublisherExecution map(EventPublisherDTO eventPublisherDTO);
}
