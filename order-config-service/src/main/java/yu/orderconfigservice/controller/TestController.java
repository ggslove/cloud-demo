package yu.orderconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private CustomConfig customConfig;
//    @Value("${custom.flag}")
//    private String flag;
//    @Value("${custom.database}")
//    private String database;

    @GetMapping("/test")
    public String test() {
        return "flag:" + customConfig.getFlag() + "<br/> database:" + customConfig.getDatabase();
    }
}
