import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int i = 0;

        // for(i = 0; i < 10; i++){
        //     int j = 100;
        //     System.out.println(i);
        // }

        System.out.println("i in the main is : " + i);
        localVar(i);
        System.out.println("i in the main is now: " + i);
        //System.out.println(k);
        //System.out.println(j);
    }

    static void localVar(int i){
        int k = 1;
        i = 1000;
        System.out.println("i in localVar is " + i);
        System.out.println("k is " + k);
    }

}

