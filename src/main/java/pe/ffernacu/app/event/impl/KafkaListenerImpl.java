package pe.ffernacu.app.event.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import pe.ffernacu.app.event.KafkaListener;

import java.util.function.Consumer;

@Slf4j
@Component
public class KafkaListenerImpl implements KafkaListener {

    @Bean
    @Override
    public Consumer<Message<byte[]>> consumer() {
        return (Message<byte[]> msg) ->{
            try{
                log.info("{}",msg);
            }
            catch (Exception ex){
                throw new RuntimeException();
            }
        };
    }
}
