package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {

        List<String> names = List.of("Dani", "Setiawan", "Azhilla");

        Stream<String> streamNames = names.stream();
        // map itu digunakan untuk mengkonfrensi dari suatu data aslinya menjadi data baru
        Stream<String> streamUpper = streamNames.map(String::toUpperCase);

        names.forEach(System.out::println);
        streamUpper.forEach(System.out::println);

    }
}
