package lk.quadrate.samplequadqueueproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "lk.quadrate")
@EnableFeignClients(basePackages = {"lk.quadrate.quadqueueclient"})
public class SampleQuadQueueProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleQuadQueueProducerApplication.class, args);
    }

}
