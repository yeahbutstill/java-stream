package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted() {

        List.of("Semangka", "Apple", "Jeruk", "Melon", "Mangga", "Pisang").stream()
                .sorted()
                .forEach(System.out::println);

    }

    @Test
    void testSortedWithComparator() {

        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Samangka", "Apple", "Jeruk", "Melon", "Mangga", "Pisang").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);

    }
}
