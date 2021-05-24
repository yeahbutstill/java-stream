package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {

        List.of("Dani", "Setiawan", "Azhilla", "Damn so good").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {

        List.of("Jeruk", "Apple", "Pisang", "Semangka", "Melon").stream()
                .skip(2)
                .forEach(System.out::println);

    }

    @Test
    void testTakeWhile() {

        List.of("Jeruk", "Apple", "Pisang", "Semangka", "Melon").stream()
                .takeWhile(name -> name.length() <= 5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {

        List.of("Jeruk", "Apple", "Pisang", "Semangka", "Melon").stream()
                .dropWhile(name -> name.length() <= 5)
                .forEach(System.out::println);

    }

    @Test
    void testFindAny() {

        Optional<String> optional = List.of("Jeruk", "Apple", "Pisang", "Semamgka", "Melon").stream()
                .findAny();

        optional.ifPresent(System.out::println);

    }

    @Test
    void testFindFirst() {

        Optional<String> optional = List.of("Jeruk", "Apple", "Pisang", "Semangka", "Melon").stream()
                .findFirst();

        optional.ifPresent(System.out::println);

    }
}
