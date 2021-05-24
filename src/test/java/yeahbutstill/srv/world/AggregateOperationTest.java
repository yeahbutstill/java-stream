package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax() {

        List.of("Pisang", "Jeruk", "Mangga", "Apple", "Jeruk", "Semangka").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

    }

    @Test
    void testMin() {

        List.of("Pisang", "Jeruk", "Mangga", "Apple", "Jeruk", "Semangka").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);

    }

    @Test
    void testCount() {

        long count = List.of("Pisang", "Jeruk", "Mangga", "Apple", "Jeruk", "Semangka").size();
        System.out.println(count);

    }

    @Test
    void testSum() {

        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, Integer::sum);

        // dimulai dari 0
        // iterasi ke 1, value=0 item=1 = 1
        // iterasi ke 2, value=1 item=2 = 3
        // iterasi ke 3, value=3 item=3 = 6
        // iterasi ke 4, value=6 item=4 = 10
        // iterasi ke 5, value=10 item=5 = 15

        System.out.println(result);

    }

    @Test
    void testFactorial() {

        var resultFactorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);

        // dimulai dari 1
        // iterasi ke 1, value=1 item=1 = 1
        // iterasi ke 2, value=1 item=2 = 2
        // iterasi ke 3, value=2 item=3 = 6
        // iterasi ke 4, value=6 item=4 = 24
        // iterasi ke 5, value=24 item=5 = 120

        System.out.println(resultFactorial);

    }
}
