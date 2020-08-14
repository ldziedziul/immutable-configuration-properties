package pl.dziedziul.immutableconfigurationproperties;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Value
@ConfigurationProperties("my-custom-properties")
@ConstructorBinding
class MyCustomProperties {
    String name;
    Integer value;
}
