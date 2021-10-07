package se.yiming;
/* Min och max
Skapa en ARRAY i kod med INTS 12 ,55, 32, 9, 34.   
Ta fram vilket som är det STÖRSTA och MINSTA talet i arrayen*/

public class Lab1 {
    public void run(){
        int[]ints = {12 ,55, 32, 9, 34};
        int max = ints[0];
        for(int i=0;i<ints.length;i++){
            if(ints[i]>max){
                max = ints[i];
                System.out.println("Det största talet i arrayen är: "+max);
            }
        }

        int min = ints[0];
        for(int i=0;i<ints.length;i++){
            if(ints[i]<min){
                min = ints[i];
                System.out.println("Det minsta talet i arrayen är: "+min);
            }
        }



    }
    
}
