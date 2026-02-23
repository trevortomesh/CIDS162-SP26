import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //1. Generate two random single-digit integers

        int number1 = (int) (Math.random() * 10);
        //System.out.println(number1);
        int number2 = (int) (Math.random() *10 );
       //System.out.println(number2);

        //2. if number1 < number2, swap number1 with number2
        if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
            // System.out.println("number1 is now: " + number1);
            // System.out.println("number2 is now: " + number2);
        }

        //3. Prompt the student to answer "What is number1 - number2"
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();

        //4. Grade the answer and display result

        if(number1 - number2 == answer){
            System.out.println("You are correct! Way to go!");
        }else{
            System.out.println("Go back to kindergardten... eat some more crayons...");
            System.out.println(number1 + " - " + number2 +
                " should be " + (number1 - number2));
        } 

       // System.out.print("Give me a score: ");


        // int score = input.nextInt();

        // if(score >= 90){
        //     System.out.println("A");
        // }

        // else if(score >= 80){
        //     System.out.println("B");
        // }

        // else if(score >= 70){
        //     System.out.println("C");
        // }

        // else if(score >= 60){
        //     System.out.println("D");
        // }

        // else{
        //     System.out.println("F");
        // }

        // System.out.print("How old are you?: ");
        // int age = input.nextInt();

        // if( age >= 18 ){
        //     System.out.println("You're an adult!");

        //     if(age >= 21){
        //         System.out.println("You can drink!");
        //     }
        //     else{System.out.println("No beer for you!!");    
        //         if(age >= 25){
        //             System.out.println("You can rent a car!!!");
        //             if(age >= 65){
        //                 System.out.println("Gonna die soon.... cheap pancakes!!");
        //             }
        //         }
        //     }

        // }else{
        //     System.out.println("You are a baby child!");
        // }
        
        // // 1) input 

        //     System.out.print("Enter an integer: ");
        //     int number = input.nextInt();

        // // 2) computation

        //     if(number % 5 == 0){
        //         System.out.println("Hi 5!!");
        //     }
        //     else{
        //         System.out.println("No 5 for you!!!");
        //     }
            
        //     System.out.println("Thanks for playing!");
            // if(number % 2 == 0){
            //     System.out.println("Hi 2!!");
            // }


       

        // boolean niceOut = false;

        // if(niceOut == true){
        //     System.out.println("Go outside!");
        // }

        // if(niceOut == false){
        //     System.out.println("Stay inside!");
        // }

        // int i = 3;
        // int j = 3;

        // ++i;
        // --j;

        // int i = 10;
        // int newNum = 10 * --i;

        // System.out.println("i is now: " + i + ", newNum is " + newNum);

        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter a degree in Fahrenheit: ");
        // double fahrenheit = input.nextDouble();
        // double celsius = (5.0/9) * (fahrenheit - 32);
        // System.out.println("Fahrenheit " + fahrenheit + " is " + 
        //     celsius + " in Celsius.");


        //System.out.println(3+4*4+5*(4+3)-1);

        // final int numberOfYears = 34;
        // final long longy = 34L;
        // double weight = 0.305;
        //byte b = longy;
        //System.out.println(0B1111);
        // System.out.println(0XFFFF);

        // Scanner input = new Scanner(System.in);

        // // 1) Prompt the user for input.
        // // time in seconds as an integer
        // System.out.print("Enter an integer for seconds: ");
        // int seconds = input.nextInt();

        // // 2) Convert to minutes + seconds
        // int minutes = seconds / 60;
        // int remainingSeconds = seconds % 60;

        // // 3) Display time in minutes + seconds
        
        // System.out.println(" and " + remainingSeconds + " seconds");

        // System.out.print("How many pies do you want? ");
        // int pies = input.nextInt();
        // input.close();
        // System.out.println("Okay, oinky... here's " + pies + " pies!");
        // int add = 2+2;
        // int sub = 2-2;
        // int mult = 2*2;
        // System.out.println(2/3);
    //     double radius; // Declare radius
    //     double area;    // Declare area
    //     final double PI = 3.14159; 
    // //     final int MAXVALUE = 100000;
    // //     int numberOfPies = 42;
    // //     double SnakeCase;
    // //     final String GOOP_PIE; 
  
    // //    // int x;

    //     Scanner input = new Scanner(System.in);

    //     // Step 1: Read in radius
    //     System.out.print("Enter a number for radius: ");
    //     radius = input.nextDouble();
    //     input.close();
    //     // Step 2: Compute Area
  
    //     area = PI * Math.pow(radius, 2);

    //     // Step 3: Display Area

    //     System.out.println("The area for the circle of radius " + radius + " is " + area);
        
        // System.out.print("This is print");
        // System.out.print("This is also print!");
        // System.out.println("This is println!");
        // System.out.print("Hi, print again!");
    

    /******************* OLD STUFF ******************/

     /*    
        // Display message Hello World! on the console
        // System.out.println("Hello World!");
        // System.out.println("Hello again!");
        // System.out.println("This is silly.");

        // System.out.print("(10.5+2*3)/(45-3.5) = ");
        // System.out.println((10.5+2*3)/(45-3.5));

        // Celsius to Fahrenheit Calculator
    //     double c;
    //     c = 35.2;
    //     System.out.print("Celsius " + c + " is Fahrenheit: ");
    //     System.out.println((9.0/5) * c + 32);
    //     //System.out.println(9/5);

    //     // python
    //     /*
    //          x = 5
    //          x = "hello"
    //          x = 3.14159
    //     */

    // //    int x = 5;
    // //    x = 5.0; //compile time error!

    //     // Data types in java!
    //     // *** TYPES OF INTEGERS *** //
    //     byte b = 10; // 8 bits -> -128 to 128
    //     short s = 10000; // 2 bytes
    //     int myInt = 400000; // 4 bytes
    //     long myLong = 922337203; // 8 bytes;

    //     //*** DECIMAL TYPES *****/
    //     float myFloat = 223312.3451f;
    //     double myDouble = 12.3;

    //     //*********** OTHERS ********/
    //     char myChar = 'a';
    //     char myChar2 = '@';

    //     char ch; 
    //     ch = 'A';
    //     int code = ch;
    //     System.out.println(code);

    //     boolean isTrue = true;
    //     isTrue = false;


    //     System.out.println("b is " + b);

    //     int a = 12;
    //     char aChar = 'a';
    //     String x = "Hello world!"; // derived data type 
    //     // a = "hello world!";
    //     // a = 25.2;

    // char a = 'H';
    // char b = 'e';
    // char c = 'l';
    // char d = 'l';
    // char f = 'o';
    // char g = '!';
    // char symbol = '#';
    // char myChar = 'A';
    // System.out.println((int)myChar);
    // String hello = "Hello!";
    // System.out.println(hello);

    // // nums = [1,2,3]
    // int x = 7;
    // int[] nums = {1,2,3};
    // System.out.println(nums);

    // double db = 3.2;
    // double pi = 3.14159;

    // System.out.println(0.1 + 0.2);

    // boolean isDone = false;
    // int score = 25;
    // boolean passed = score >= 60;
    // System.out.println(passed);
    // //System.out.println(11%2);
    // String stringGuy = "Pikachu!!";
    // System.out.println(stringGuy);

        // int x = 7;
        // double y = x; 

        // System.out.println(x);
        // System.out.println(y);

        // double d = 9.8;
        // int n = (int)d;

        // System.out.println(n);

        // int max = Integer.MAX_VALUE;
        // System.out.println(max+1);     
   
        // int x = 5;
        // double y;
        // y = x;
        // System.out.println(y);
        // x = (int) 3.9;
        // System.out.println(x);

    }
}
