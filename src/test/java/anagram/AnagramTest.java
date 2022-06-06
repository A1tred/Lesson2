package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void anagram() {
        String w = "anagram";
        String a = anagram.anagram(w);
        assertEquals(w.length(), a.length());
        System.out.println(a);
    }
}