import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {

    }

    public Map<Character, Integer> countMe(String input) {
        char[] chars = input.toCharArray();
        Map<Character, Integer> output = new HashMap<>();
        Set<Character> uniq = new HashSet<>();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (uniq.add(chars[i]))
                count = 1;
            else
                count += 1;
            output.put(chars[i], count);
        }
        return output;
    }

    public Map<Character, Long> countMe1(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
