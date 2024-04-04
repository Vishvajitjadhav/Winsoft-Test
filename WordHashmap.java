import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordHashmap {
    public static void main(String[] args)
    {
 
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine(); 
 
        Map<String, Integer> hashMap = new HashMap<>();
 
        String[] words = str.split(" ");
 
        for (String word : words) {
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1);
 
            else
                hashMap.put(word, 1);
        }
 
        System.out.println(hashMap);
    }
}