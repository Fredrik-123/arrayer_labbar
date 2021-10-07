package se.yiming;
import java.util.ArrayList;
import java.util.Arrays;

/* Count special
Skapa en ArrayList med några stängar tex
"abc", "xyz", "aba", "1221"
Loopa igenom och räkna hur många som
- är minst två tecken OCH det första och det sista tecknet är detsamma  (aba) */

public class Lab4 {
    public void run(){
        ArrayList<String>arrayStr = new ArrayList<>(Arrays.asList("abc", "xyz", "aba", "1221"));

        int count = 0;
        for(String str:arrayStr){
            if(str.length()>=2 && str.charAt(0)==str.charAt(str.length()-1)){
                count++;
            }
        }
        System.out.printf("Antal blev %d.\n", count);
    }
    
}
