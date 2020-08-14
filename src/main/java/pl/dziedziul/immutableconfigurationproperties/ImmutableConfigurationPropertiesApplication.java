package pl.dziedziul.immutableconfigurationproperties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@Slf4j
@EnableConfigurationProperties(MyCustomProperties.class)
public class ImmutableConfigurationPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmutableConfigurationPropertiesApplication.class, args);
    }

}
