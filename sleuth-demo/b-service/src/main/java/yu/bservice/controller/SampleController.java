package yu.bservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yu.bservice.service.CServiceFeignClient;

import javax.annotation.Resource;

@RestController
public class SampleController {
    @Resource
    private CServiceFeignClient cService;

    @GetMapping("/b")
    @ResponseBody
    public String methodB() {
        String result = cService.methodC();
        result = " -> Service B" + result;
        return result;
    }
}
