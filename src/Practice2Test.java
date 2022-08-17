import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Practice2Test {

    @org.junit.jupiter.api.Test
    void countMe4() {
        Practice2 p = new Practice2();
        Map<Character, Long> output = p.countMe1("abcd");
        long count_a = output.get('a');
        assertEquals(1, count_a);
    }
}