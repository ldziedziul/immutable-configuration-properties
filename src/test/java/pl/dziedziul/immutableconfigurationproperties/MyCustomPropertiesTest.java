package pl.dziedziul.immutableconfigurationproperties;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MyCustomPropertiesTest {
    @SneakyThrows
    @Test
    void shouldBeDeserialized() {
        //given
        String json = "{\n" +
                "  \"name\": \"Ania\",\n" +
                "  \"value\": 25000\n" +
                "}";
        //when
        MyCustomProperties myCustomProperties = new ObjectMapper().readValue(json, MyCustomProperties.class);
        //then
        assertThat(myCustomProperties.getName()).isEqualTo("Ania");
        assertThat(myCustomProperties.getValue()).isEqualTo(25000);
    }
}