package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamTest {

    @Test
    void testCreatePrimitiveStream() {

        IntStream intStream = IntStream.of(1,2,3,4,5,6);
        intStream.forEach(System.out::println);

        IntStream range = IntStream.range(1,12);
        range.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
        doubleStream.forEach(System.out::println);

    }

    @Test
    void testPrimitiveStreamOperations() {

        IntStream intStream = IntStream.range(1, 2_000_000);

        OptionalDouble optionalDouble = intStream.average();
        optionalDouble.ifPresent(System.out::println);

        IntStream.range(1, 150)
                .mapToObj(number -> "Numbers : " + number)
                .forEach(System.out::println);

    }
}
