package se.yiming;
import java.util.ArrayList;
import java.util.Arrays;

/* Skapa en ArrayList i kod med INTS 12 ,55, 32, 9, 34.    Tips 
    ArrayList<Integer> tal1 = new ArrayList<>(Arrays.asList( 12,55,32,9,34));
Skapa en ArrayList till i kod med INTS 72 ,55, 32, 4, 88.   
Skapa en ArrayList - som heter commonArrayList. Denna ska nu fyllas med tal som återfinns i BÅDA arraylistorna. 
Loopa igenom den första och för varje: kolla om den finns i den andra. 
Isåfall stoppar du in den i common ArrayListen.
Loopa igenom common  ArrayListen och skriv ut alla tal
ÖVERKURS: Gör samma lab. Fast de två första ska vara ARRAYS och resultatet en ArrayList*/

import java.util.ArrayList;

public class Lab2 {
    public void run(){
        ArrayList<Integer>talArrayList1 = new ArrayList<>(Arrays.asList(12,55,32,9,34));
        var talArrayList2 = new ArrayList<Integer>(Arrays.asList(72,55,32,4,88));
        var commonArrayList = new ArrayList<Integer>();

        for(int i:talArrayList1){
            if(talArrayList2.contains(i)){
                commonArrayList.add(i);
            }
        }

        for(int i:commonArrayList){
            System.out.println(i);
        }
    }  
}
