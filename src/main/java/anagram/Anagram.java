package anagram;

public class Anagram {

    public String anagram(String w) {
        String anagram = "";
        while (w.length() != 0)
        {
            int index = (int) Math.floor(Math.random() * w.length());
            char c = w.charAt(index);
            w = w.substring(0,index)+w.substring(index+1);
            anagram += c;
        }
        return anagram;
    }
}
