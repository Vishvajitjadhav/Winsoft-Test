import java.util.*;

public class DuplicateChar {  
     public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();  
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string is ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;   
                    string[j] = '0';  
                }  
            }   
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  
}