package com.pi4j.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = Pi4jProperties.PREFIX, value = "enabled", havingValue = "true")
@EnableConfigurationProperties({ Pi4jProperties.class })
/**
 * <p>Spring Boot auto-configuration for Pi4j.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class Pi4jAutoConfiguration {
 
    
	@Bean
	public Pi4jTemplate openCVFaceRecognitionTemplate(Pi4jProperties properties) {
		return new Pi4jTemplate(properties);
	}
	
}
