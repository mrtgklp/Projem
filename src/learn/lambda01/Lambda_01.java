package learn.lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda_01 {
    public static void main(String[] args) {
        List<Integer> sayı = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        cıftPztf(sayı);
    }//main
    //1-List elemanlarının cift ve pozitif olanlarını Lambda expression kullanarak aralarında bosluk olacak sekilde yazdırın.
    public static void cıftPztf( List<Integer> sayı){
        sayı.stream().sorted().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t + " "));
    }

}
