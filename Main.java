import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


       // int myNum = getRandInt();
        for(int i = 0; i < 10; i++){
            System.out.println(getRandInt());
        }

        int mySum = sum(1,10);
         System.out.println("Sum from 1 to 10 is " + sum(1,10));
        // System.out.println("Sum from 20 to 37 is " + sum(20,37));
        // System.out.println("Sum from 35 to 49 is " + sum(35,49));

        printCountDown(10);
        //sum(1,10);



        // suppose you need to find the sum of integers from 1 to 10, 20 to 37, and 35 to 49

        // int sum = 0;
        
        // for(int i = 1; i <=10; i++){
        //     sum += i;
        // }
        // System.out.println("Sum from 1 to 10 is " + sum);



        // sum = 0;
        
        // for(int i = 20; i <=37; i++){
        //     sum += i;
        // }
        // System.out.println("Sum from 20 to 37 is " + sum);


        // sum = 0;
        // for(int i = 35; i <=49; i++){
        //     sum += i;
        // }
        // System.out.println("Sum from 35 to 49 is " + sum);
        // int sum = 0;
        // int number = 0;

        // while(number < 20){
        //     number++;
        //     if(number == 10 || number == 11){
        //         continue;
        //     }
        //     sum += number;
        //     // if(sum >= 100){
        //     //     break;
        //     // }

        //     System.out.println("The number is " + number);
        //     System.out.println("The sum is " + sum);
        // }

    //   Scanner input = new Scanner(System.in);

        // for(int i = 0; i < 100; i++){
        //     System.out.println(i + " * 5 = " + i*5);
        //     if(i*5 > 200){
        //         break;
        //     }
        // }

    // int i = 0;
    //     while(true){
    //         System.out.println("Hi!");
    //         i++;
    //         if(i == 30){
    //             break;
    //         }
    //     }


    // System.out.println();
    // System.out.println("                Multiplication Table    ");
    // System.out.print("   ");

    // for(int j = 1; j <=9; j++){
    //     System.out.print("   " + j);
    // }
    // System.out.println("\n------------------------------------------------");

    // for(int i = 1; i <=9; i++){
    //     System.out.print(i + " | ");
    //     for(int j = 1; j <=9; j++){
    //         System.out.printf("%4d", i*j);
    //     }
    //     System.out.println();
    // }

    // for(int year = 2026; year < 2028; year++ ){
    //     for(int month = 1; month <= 12; month++){
    //         String printMonth = " ";
    //         switch(month){
    //             case 1: printMonth = "January"; break;
    //             case 2: printMonth = "February"; break;
    //             case 3: printMonth = "March"; break;
    //             case 4: printMonth = "April"; break;
    //             case 5: printMonth = "May"; break;
    //             case 6: printMonth = "June"; break;
    //             case 7: printMonth = "July"; break;
    //             case 8: printMonth = "August"; break;
    //             case 9: printMonth = "September"; break;
    //             case 10: printMonth = "October"; break;
    //             case 11: printMonth = "November"; break;
    //             case 12: printMonth = "December"; break;
    //         }
    //         System.out.println("year: " + year + " month: " + printMonth);

    //     }
    // }
    // for(int min = 0; min < 60; min++){
    //     for(int sec = 0; sec < 60; sec++){
    //         System.out.println(min + " minutes and " + sec + " seconds");
    //     }
    // }   

    // int i = 0;
    // while(i < 100){
    //     System.out.println(i);
    //     i++;
    // }

    // int sum = 0;
    // int data = 0;

    //     do{
    //         System.out.print("Enter an integer (the input ends if it is 0): ");
    //         data = input.nextInt();
    //         sum += data;
    //     }while(data != 0);
  

    //     System.out.println("The sum is " + sum);

        // char continueLoop = 'Y';

        // while(continueLoop == 'Y'){
        //     System.out.println("Yay!");
        //     System.out.print("Enter Y to continue and N to quit: ");
        //     continueLoop = input.nextLine().charAt(0);
        // }

        // // int number = (int)(Math.random() * 101);

        // System.out.println("Guess a magic number between 0 and 100");
        // int guess = -1;
        // while(guess != number){
        //     System.out.print("\nEnter your guess: ");
        //     guess = input.nextInt();
        
        //     if(number == guess){
        //         System.out.println("You win... or something");
        //         //break;
        //     }else if(number < guess){
        //         System.out.println("Too high, bro...");
        //     }else{System.out.println("Too low... :-(");}
        // }

        //input.close();
        // int sum = 0; 
        // int i = 1;
        // while(i < 10){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println("sum is " + sum);
        // int count = 1;
        // while(count <= 100){
        //     System.out.println("This is the " + count + " time I've printed this!");
        //     count++;
        // }
    //     while(true){
    //     System.out.print("Enter a year: ");
    //     int year = input.nextInt();
    //     //System.out.println(year % 12);
    //     switch(year % 12){
    //         case 0: System.out.println("monkey"); break;
    //         case 1: System.out.println("rooster"); break;
    //         case 2: System.out.println("dog"); break;
    //         case 3: System.out.println("pig"); break;
    //         case 4: System.out.println("rat"); break;
    //         case 5: System.out.println("ox"); break;
    //         case 6: System.out.println("tiger"); break;
    //         case 7: System.out.println("rabbit"); break;
    //         case 8: System.out.println("dragon"); break;
    //         case 9: System.out.println("snake"); break;
    //         case 10: System.out.println("horse"); break;
    //         case 11: System.out.println("sheep"); break;
    //     }
    // }

        // switch(status){
        //     case 0:
        //         System.out.println("Compute for single filers");
        //         break;
        //     case 1: 
        //         System.out.println("Compute for married jointly / widow(er)");
        //         break;
        //     case 2: 
        //         System.out.println("Compute for married filing seperately.");
        //         break;
        //     case 3: 
        //         System.out.println("Compute for head of household.");
        //         break;
        //     default: System.out.println("Error: invalid status");
        //              System.exit(1);
        // }

    }


    static int sum(int i1, int i2){
        int result = 0;
        for(int i = i1; i < i2; i++){
            result += i;
        }
        return result;
    }

    static void printCountDown(int start){
        for(int t = start; t >= 0; t--){
            System.out.println("T minus " + t);
        }
    }

    static int getRandInt(){
        int rand = (int) (Math.random() * 100);
        return rand;
    }

}

