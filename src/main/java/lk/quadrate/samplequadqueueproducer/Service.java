package lk.quadrate.samplequadqueueproducer;

import lk.quadrate.quadqueueclient.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Service  {

    @Autowired
    private Producer producer;

    @GetMapping("/send")
    public void sentPayload(){
        System.out.println("sending");
        producer.sendPayload("Testing");
    }


}
