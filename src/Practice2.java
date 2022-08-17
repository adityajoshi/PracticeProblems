import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {

    }

    public Map<Character, Long> countMe1(String input) {
        return input.codePoints()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }
}
