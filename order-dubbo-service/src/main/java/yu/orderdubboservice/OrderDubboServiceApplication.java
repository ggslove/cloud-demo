package yu.orderdubboservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
class OrderDubboServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderDubboServiceApplication.class, args);
    }


}
