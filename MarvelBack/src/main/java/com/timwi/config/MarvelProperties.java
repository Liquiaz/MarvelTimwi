package com.timwi.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "marvel")
@Getter
@Setter
public class MarvelProperties {

    private String domainName;
    private String publicKey;
    private String privateKey;
}
