//This Program is prepared by 21CE118 Shruti Sangani
//Part-7 Practical2
/*Aim ::  Write a program that counts the occurrences of words in a text and displays the words and
their occurrences in alphabetical order of the words. Using Map and Set Classes.
 */
import java.util.HashMap;
import java.util.Map;
public class Practical2 {
    public static void main(String[] args)
    {
        String str = "Hello World! My Name is Shruti.";
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words)
        {
            Integer integer = hashMap.get(word);
            if (integer==null) {
                hashMap.put(word, 1);
            }
            else
            {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
