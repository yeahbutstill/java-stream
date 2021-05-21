package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Dani");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });

    }

    @Test
    void testCreateStreamFromArray() {

        Stream<String> streamString = Stream.of("Dani", "Setiawan", "Azhila");
        streamString.forEach(System.out::println);

        Stream<Integer> streamInteger = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        streamInteger.forEach(System.out::println);

        Stream<String> streamArray = Arrays.stream(new String[]{"Dani", "Setiawan", "Azhila"});
        streamArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFormCollection() {

        Collection<String> collectionString = List.of("Dani", "Setiawan", "Azhila");

        // konvrensi menjadi stream, hanya bisa satu kali digunakan
        Stream<String> streamString = collectionString.stream();
        streamString.forEach(System.out::println);

        Stream<String> streamString1 = collectionString.stream();
        streamString1.forEach(System.out::println);

    }

    @Test
    void testCreateInfiniteStream() {

        Stream<String> stream1 = Stream.generate(() -> "Dani");
        // stream1.forEach(System.out::println); // loop Dani until stack

        Stream<String> stream2 = Stream.iterate("Dani", value -> value.toUpperCase());
        // stream2.forEach(System.out::println); // loop Dani until stack

    }
}
