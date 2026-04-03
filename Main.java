import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] highs ={42, 38, 48, 37};

        // for(int i = 0; i < highs.length; i++){
        //     System.out.println(highs[i]);
        // }

        for(int temp : highs){
            System.out.println(temp);
        }

        String[] pokemon = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wortortle", "Blastoise"};


        boolean exists = false;
        String target = "Mew";

        for(String mon : pokemon){
            if(mon.equals(target)){
                exists = true;
                break;
            }
        }

        if(exists){
            System.out.println("You've caught a " + target);
        }else{
            System.out.println(target + " not found!");
        }

        // boolean[] bools = new boolean[3];
        // System.out.println(bools[0]);
        // double[] doubles = new double[3];
        // System.out.println(doubles[1]);
        // int[] scores = new int[3];
        // System.out.println(scores[0]);

        // String[] colors = new String[3];
        // colors[0] = "red";
        // colors[1] = "blue";
        // colors[2] = "green";

       // System.out.println(colors);

        // for(int i = 0; i < colors.length; i++){
        //     System.out.println(colors[i]);
        // }
        
        // String name1 = "Trevor";
        // String name2 = "John";
        // String name3 = "Cody";
        // String name4 = "Steve";
        // String name5 = "Mary";

        // String[] firstNames = {"Trevor", "John", "Cody", "Steve", "Mary"};
        // String[] lastNames = {"Tomesh", "Smith", "Wilson", "Schmeeve", "Dairy"};
        // int[] ages = {37, 54, 23, 42, 34};

        // for(int i = 0; i <= firstNames.length; i++){
        //     System.out.println("My name is " + firstNames[i] + " " + lastNames[i] + " i am " + ages[i] + " years old!");
        // }

        //System.out.println(firstNames);
        // int i = 0;

        // for(i = 0; i < 10; i++){
        //     int j = 100;
        //     System.out.println(i);
        // }

        // System.out.println("i in the main is : " + i);
        // localVar(i);
        // System.out.println("i in the main is now: " + i);
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

