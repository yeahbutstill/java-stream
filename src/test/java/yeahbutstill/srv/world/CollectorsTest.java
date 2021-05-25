package yeahbutstill.srv.world;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsTest {

    @Test
    void testCollectorsCollection() {

        List<String> names = List.of("Aryo", "Jaya", "Satrio", "Azhilla", "Yulisma");

        // menjadi set allowed to change, create, update and deleted
        Set<String> set = names.stream().collect(Collectors.toSet());
        System.out.println(set);

        // tetap menjadi set but not to change, create, update and deleted
        Set<String> immutableSet = names.stream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        // konferensi menjadi list
        List<String> list = names.stream().collect(Collectors.toList());
        System.out.println(list);

        List<String> immutableList = names.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);

    }

    @Test
    void testCollectorsMap() {

        List<String> names = List.of("Aryo", "Jaya", "Satrio", "Azhilla", "Yulisma");

        Map<String, Integer> map = names.stream().collect(Collectors.toMap(
                name -> name,
                name -> name.length()
        ));
        System.out.println(map);

    }
}
