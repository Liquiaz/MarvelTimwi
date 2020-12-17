package com.timwi.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Class which contains global properties
 */
@Configuration
@ConfigurationProperties
@Getter
@Setter
public class GlobalProperties {

    private String outputDirectory;
    private String errorsDirectory;
}
