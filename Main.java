import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int number = (int)(Math.random() * 101);

        System.out.println("Guess a magic number between 0 and 100");
        int guess = -1;
        while(guess != number){
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
        
            if(number == guess){
                System.out.println("You win... or something");
                //break;
            }else if(number < guess){
                System.out.println("Too high, bro...");
            }else{System.out.println("Too low... :-(");}
        }

        input.close();
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
}
