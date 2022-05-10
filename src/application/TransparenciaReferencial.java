package application;

import java.util.Arrays;

public class TransparenciaReferencial {

    public static int globalValue = 3;

    public static void main(String[] args) {

    int [] vect = new int[] {3, 4, 5};
    chandeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }
    public static void chandeOddValues(int[]numbers){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] %2 !=0){
                numbers[1] =+ globalValue;
            }
        }
    }
}
