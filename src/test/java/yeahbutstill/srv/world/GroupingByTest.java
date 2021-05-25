package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTest {

    @Test
    void testCollectorsGroupingBy() {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        Map<String, List<Integer>> map1 = numbers.stream()
                .collect(Collectors.groupingBy(integer -> integer > 5 ? "Besar" : "Kecil"));
        System.out.println(map1);

        List<String> names = List.of("Eko", "Kurniawan", "Khannedy", "Budi", "Nugraha", "Joko");
        Map<String, List<String>> map2 = names.stream()
                .collect(Collectors.groupingBy(name -> name.length() > 4 ? "Besar" : "Kecil"));
        System.out.println(map2);

    }

    @Test
    void testCollectorsPartition() {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> map3 = numbers.stream()
                .collect(Collectors.partitioningBy(integer -> integer > 5));
        System.out.println(map3);

        List<String> names = List.of("Eko", "Kurniawan", "Khannedy", "Budi", "Nugraha", "Joko");
        Map<Boolean, List<String>> map4 = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println(map4);

    }
}
