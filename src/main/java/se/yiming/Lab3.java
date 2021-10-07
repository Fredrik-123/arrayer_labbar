package se.yiming;
import java.util.ArrayList;
import java.util.Arrays;
/* Summa
Skapa en ArrayList  kod med 5 stycken INTS. 12 ,55, 32, 9, 34.   
Det ska vara en oneliner!
Loopa igenom listan och räkna fram SUMMAN av alla tal
 */
public class Lab3 {
    public void run(){
        ArrayList<Integer>talArrayList1 = new ArrayList<>(Arrays.asList(12,55,32,9,34));

        int sum = 0;
        for(int i:talArrayList1){
            sum +=i;
        }
        System.out.printf("Summan blir %d. \n", sum);
    }    
}
