package lk.quadrate.samplequadqueueproducer;

import lk.quadrate.quadqueueclient.annotation.EnableQuadClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "lk.quadrate")
@EnableQuadClient
public class SampleQuadQueueProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleQuadQueueProducerApplication.class, args);
    }

}
