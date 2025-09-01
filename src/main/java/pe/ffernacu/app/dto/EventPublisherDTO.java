package pe.ffernacu.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EventPublisherDTO {
    private String fileName;
    private List<AccountDTO> accounts;
}
