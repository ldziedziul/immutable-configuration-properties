package pl.dziedziul.immutableconfigurationproperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ImmutableConfigurationPropertiesApplicationTests {

	@Autowired
	private MyCustomProperties myCustomProperties;

	@Test
	void contextLoads() {
		assertThat(myCustomProperties.getName()).isEqualTo("Lukasz");
		assertThat(myCustomProperties.getValue()).isEqualTo(15000);
	}

}
