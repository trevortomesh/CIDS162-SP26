import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        int[] testArray = {1,4,4,2,5,-3,6,2};
        int[] orderedArray = {1, 10, 16, 25, 29, 33, 34, 62, 100, 120, 121};
        //int j = linearSearch(testArray, -3);
        int k = binarySearch(orderedArray, 120);
        int j = linearSearch(orderedArray, 120);
        System.out.println(k);
        System.out.println(j);




        // int[] pokenum = {1, 10, 16, 25, 29};
        // int target = 10;
        // boolean is_found = false; 

        // for(int i = 0; i < pokenum.length; i++){
        //     if(pokenum[i] == target){
        //         is_found = true;
        //         break;
        //     }
        // }
        // if(!is_found){
        //         System.out.println("Pokemon not found :-( ");
        // }else{
        //         System.out.println("Pokemon found!");
        // }
            
        
        //int[] mainArray = returnArray(10);
        //mainArray = reverse(mainArray);
        //int[] reverseArray = reverse(mainArray);
       // printArray(mainArray);
        //printArray(reverseArray);

        // int[] numbers = new int[4];
        // System.out.println(numbers[0]);
        // //numbers = {3,2,9,0};
        // numbers[0] = 3;
        // numbers[1] = 2;
        // numbers[2] = 9;
        // numbers[3] = 0;

        // printArray(numbers);

        // int[] newNumbers = {1,2,3,4};
        // int x = 10;

        // setIntZero(x);
        // System.out.println("x is now " + x);
        // setArrayZero(newNumbers);
        
        // for(int i = 0; i < newNumbers.length; i++){
        //     System.out.print(newNumbers[i] + " ");
        // }
        // System.out.println();

       // int[] newerNumbers = newNumbers;

        // newNumbers[2] = 10000;
        // System.out.println(newNumbers[2]);
        // System.out.println(newerNumbers[2]);
        // System.out.println("newNumbers address: " + newNumbers);
        // System.out.println("newerNumbers address: " + newerNumbers);

        // System.out.println(newNumbers);
        // System.out.println(newerNumbers);


        // for(int nums : newNumbers){
        //     System.out.println(nums);
        // }
        //System.out.println(numbers[numbers.length-1]);
        // for(int i = 0; i < numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }
        // System.out.println(numbers);
        // numbers[0] = 7;
        // System.out.println(numbers[0]);
        // System.out.println(numbers);


 //       int[] highs ={42, 38, 48, 37};

        // for(int i = 0; i < highs.length; i++){
        //     System.out.println(highs[i]);
        // }

        // for(int temp : highs){
        //     System.out.println(temp);
        // }

        // String[] pokemon = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wortortle", "Blastoise"};


        // boolean exists = false;
        // String target = "Mew";

        // for(String mon : pokemon){
        //     if(mon.equals(target)){
        //         exists = true;
        //         break;
        //     }
        // }

        // if(exists){
        //     System.out.println("You've caught a " + target);
        // }else{
        //     System.out.println(target + " not found!");
        // }

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

    public static void printNum(int num){
        System.out.println(num);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void setArrayZero(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = 0;
        }
    }

    public static void setIntZero(int x){
        x = 0;
        System.out.println(x);
    }

    static void localVar(int i){
        int k = 1;
        i = 1000;
        System.out.println("i in localVar is " + i);
        System.out.println("k is " + k);
    }

    static int[] returnArray(int x){
        int[] myArray = new int[x];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = i;
        }
        return myArray;
    }

    static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i = 0, j = list.length-1; i < list.length; i++, j--){
            result[j] = list[i];
        }
        return result;
    }

    public static int linearSearch(int[] list, int key){
        int numSteps = 0;
        for(int i = 0; i < list.length; i++){
            numSteps++;
            if(key == list[i]){
                System.out.println("Number of steps: " + numSteps);
                return i;
            }
        }
        System.out.println("Number of steps: " + numSteps);
        return -1;
    }

    public static int binarySearch(
        int[] list, int key){

            int low = 0;
            int high = list.length -1;
            int steps = 0;
            while(high >= low){
                steps++;
                int mid = (low + high)/2;
                if(key < list[mid]){
                    high = mid - 1;
                }else if (key == list[mid]){
                    System.out.println("Number of steps: " + steps);
                    return mid;
                }else{
                    low = mid+1;
                }

            }
            System.out.println("Number of steps " + steps);
            return -1;
    
        }

}

