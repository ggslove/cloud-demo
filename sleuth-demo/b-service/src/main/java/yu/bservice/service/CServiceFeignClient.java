package yu.bservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("c-service")
public interface CServiceFeignClient {
    @GetMapping("/c")
    public String methodC();
}
