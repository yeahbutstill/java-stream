package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Dani");
        builder.add("Setiawan").add("Azhila");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamBuilderSimplify() {

        Stream<Object> stream = Stream.builder()
                .add("Dani").add("Setiawan").add("Azhilla").build();

        stream.forEach(System.out::println);

    }
}
