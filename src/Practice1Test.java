import org.junit.Assert;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Practice1Test {

    @org.junit.jupiter.api.Test
    void countMe1() {
        Practice1 p = new Practice1();
        Map<Character, Integer> output = p.countMe("abcda");
        int count_a = output.get('a');
        assertEquals(2, count_a);
    }

    @org.junit.jupiter.api.Test
    void countMe2() {
        Practice1 p = new Practice1();
        Map<Character, Integer> output = p.countMe("abcd");
        int count_a = output.get('a');
        assertEquals(1, count_a);
    }

    @org.junit.jupiter.api.Test
    void countMe3() {
        Practice1 p = new Practice1();
        Map<Character, Long> output = p.countMe1("abcda");
        long count_a = output.get('a');
        assertEquals(2, count_a);
    }

    @org.junit.jupiter.api.Test
    void countMe4() {
        Practice1 p = new Practice1();
        Map<Character, Long> output = p.countMe1("abcd");
        long count_a = output.get('a');
        assertEquals(1, count_a);
    }
}