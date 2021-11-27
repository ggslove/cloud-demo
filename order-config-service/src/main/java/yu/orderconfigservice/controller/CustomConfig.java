package yu.orderconfigservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
@Setter
@Getter
public class CustomConfig {
    @Value("${custom.flag}")
    private String flag;
    @Value("${custom.database}")
    private String database;
}
