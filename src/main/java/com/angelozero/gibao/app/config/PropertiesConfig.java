package com.angelozero.gibao.app.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Configuration
public class PropertiesConfig {

    @Value("${thread.time.sleep.minutes}")
    private Long minutes;

}
