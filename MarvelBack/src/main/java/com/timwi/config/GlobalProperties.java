package com.timwi.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@Getter
@Setter
public class GlobalProperties {

    private String outputDirectory;
    private String errorsDirectory;
}
