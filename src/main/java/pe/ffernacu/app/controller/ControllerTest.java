package pe.ffernacu.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ffernacu.app.dto.EventPublisherDTO;
import pe.ffernacu.app.service.PublishService;

import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/event")
public class ControllerTest {

    private final PublishService publishService;

   @PostMapping
   public CompletableFuture<ResponseEntity<?>> create(@RequestBody EventPublisherDTO eventPublisherDTO){
       publishService.sendMessage(eventPublisherDTO);
       return CompletableFuture.supplyAsync(() -> ResponseEntity.accepted().build());
   }

}
