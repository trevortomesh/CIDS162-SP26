import java.io.IOError;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        java.io.File file = new java.io.File("scores.txt");
        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();

            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }

        input.close();

        // Scanner input = new Scanner(System.in);

        // java.io.File file = new java.io.File("scores.txt");
        // if(file.exists()){
        //     System.out.println("File already exists!");
        //     System.exit(0);
        // }

        // int numInts = 50;
        // try(
        // java.io.PrintWriter output = new java.io.PrintWriter(file);){
        //    for(int i = 0; i < numInts; i++){
        //     output.println((int)(Math.random()*100));
        //    }
        // }


        // Scanner input = new Scanner(System.in);
        // boolean continueInput = true;

        // System.out.print("Enter an integer (not zero!): ");
        // try{
        //     int x = input.nextInt();
        //     System.out.println(quotient(100, x));
        // }catch(IllegalArgumentException ex){
        //     System.out.println("Oop! Follow directions!");
        // // }catch(InputMismatchException ex){
        // //     System.out.println("Oop! Wrong type!");
        // }catch(ArithmeticException ex){
        //     System.out.println("Divide by zero oops... universe gone!");
        // }finally{
        //     System.out.println("all done!");
        // }

        // System.out.println("Keep going...");

        // do{
        //     try{
        //         System.out.print("Enter an integer: ");
        //         int number = input.nextInt();
        //         System.out.println("The number entered is " + number);

        //         continueInput = false;
        //     }catch(InputMismatchException ex){
        //         System.out.println("Try again. (" +
        //             "Incorrect input: an integer is required)");
        //         }
        //         input.nextLine();
            
        // }while(continueInput);

        // System.out.print("Enter two integers: ");
        // int number1 = input.nextInt();
        // int number2 = input.nextInt();

        // int result = 12;
        // try{
        // result = quotient(number1, number2);
        // }catch(ArithmeticException ex){
        //     System.out.println("Error: divide by zero!");
        // }
        // System.out.println(result);

    //     boolean tryAgain = true;
    //     while(tryAgain){
    //         tryAgain = false;
    //         System.out.print("Enter two integers: ");
    //         int number1 = input.nextInt();
    //         int number2 = input.nextInt();
    //         try{
    //             int result = quotient(number1, number2);
    //             System.out.println(number1 + " / " + number2 + " is " + result);
    //         }
    //         catch(ArithmeticException ex){
    //             // System.out.println("Exception: an integer " + 
    //             // "cannot be divided by zero ");
    //             System.out.println(ex.getMessage());
    //             tryAgain = true;
    //     }
    // }
    //     System.out.println("Execution continues...");

        // testMaxArrayDimensions();
        // return;

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number of points: ");
        // int numberOfPoints = input.nextInt();

        //  double[][] points = new double[numberOfPoints][2];
        // System.out.print("Enter " + numberOfPoints + " points: ");
        // for(int i = 0; i < points.length; i++){
        //     points[i][0] = input.nextDouble();
        //     points[i][1] = input.nextDouble();
        // }

        // int p1 = 0, p2 = 1;
        // double shortestDistance = distance(points[p1][0], points[p1][1],
        //                                    points[p2][0], points[p2][1]);

        // for(int i = 0; i < points.length; i++){
        //     for(int j = i+1; j < points.length; j++){
        //         double distance = distance(points[i][0], points[i][1],
        //                                    points[j][0], points[j][1]);

        //         if(shortestDistance > distance){
        //             p1 = i;  //new point 1
        //             p2 = j;  //new point 2
        //             shortestDistance = distance;
        //         }
        //     }
        // }

        // System.out.println("The closest two points are " +
        //     "("+points[p1][0] + ", " + points[p1][1] + ") and (" +
        //     points[p2][0] + ", " + points[p2][1]+")"); 

        // shortestDistance = distance(25, 3,
        //                             1, 2);
       // System.out.println(shortestDistance);

        // int[][] matrix = randomMatrix(5,5);
        // printMatrix(matrix);
        // System.out.println(sumMatrix(matrix));

        // int[][] triangleArray ={
        //     {1,2,3,4,5},
        //     {2,3,4,5},
        //     {3,4,5},{},
        //     {4,5},
        //     {5}
        // };

        // triangleArray[2][1] = 0;

        // System.out.println(triangleArray[3][0]);


        // String[] lotr = {"UT","SMRN","Hobbit","FOTR", "TTT", "ROK"};
        // String[] hp = {"SS", "TCS", "PoA", "GoF", "OOP", "HBP", "DH"};
        // String[] mc = {"JP", "TLW", "CONGO", "PREY", "MICRO"};

        // String[][] books = {lotr, hp, mc};

        // String[] nswitch = {"Loz:Botw", "LoZ: ToK", "Pokemon Sword", "Pokemon Shield"};
        // String[] steam = {"DOOM", "Myst", "Balatro", "Slay The Spire"};
        // String[][] games = {nswitch, steam};

        // String[][][] collections = {books, games};

        // System.out.println(collections[1][0][2]);

        // double[][][] scores = {
        //     {{7.5, 20.5}, {9.0, 22.5}, {19, 33.5}, {13, 21.5},{15, 2.5}},
        //     {{6.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5},{15, 2.5}},
        //     {{7.9, 20.5}, {9.3, 22.5}, {16, 33.5}, {13, 21.5},{15, 2.5}},
        //     {{7.5, 20.5}, {9.0, 22.5}, {15,8, 33.5}, {13, 21.5},{13, 2.5}},
        //     {{7.5, 21.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5},{15, 2.5}}
        // };

        // scores[0][3][1] = 30;
        // System.out.println(scores[0][3][1]);
    
    //    int[][][][][][][][][][][][][][][][] stupid = new int[10][10][10][10][10][10][10][10][10][10][10][10][10][10][10][10];

        
    // System.out.println(books[1]);
        // System.out.println(books[1][6]);
       // int[][] matrix = new int[5][5];

        // matrix[2][1] = 7;
        // System.out.println(matrix[2][1]);
        


        //System.out.println(books[1][2]);
        //System.out.println(books);
        //System.out.println(mc[3]);

        // int[] testArray = {1,4,4,2,5,-3,6,2};
        // int[] orderedArray = {1, 10, 16, 25, 29, 33, 34, 62, 100, 120, 121};
        // double[] unordered = {2.3, 5.1, 0.2, 5.0, 9.7, 8.0, 12.2, 4.1};
        // selectionSort(unordered);
        // printArray(unordered);
        // //int j = linearSearch(testArray, -3);
        // int k = binarySearch(orderedArray, 120);
        // int j = linearSearch(orderedArray, 120);
        // System.out.println(k);
        // System.out.println(j);




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

        public static void printArray(double[] array){
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

        public static void selectionSort(double[] list){
            for(int i = 0; i < list.length-1; i++){
                double currentMin = list[i];
                int currentMinIndex = i;

                for(int j = i + 1; j < list.length; j++){
                    if(currentMin > list[j]){
                        currentMin = list[j];
                        currentMinIndex = j;
                    }
                }

                if(currentMinIndex != i){
                    list[currentMinIndex] = list[i];
                    list[i] = currentMin;    
                }
            }
        }

        public static int[][] randomMatrix(int r, int c){
        int[][] matrix = new int[r][c];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                    matrix[row][column] = (int)(Math.random()*100);
            }
        }
        return matrix;
        }

        
        public static void printMatrix(int matrix[][]){
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int sumMatrix(int matrix[][]){
        int total = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                total+= matrix[row][column];
            }
        }
        return total;
    }

    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    public static void testMaxArrayDimensions(){
        int low = 1;
        int high = 512;
        int maxWorking = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canCreateArrayWithDimensions(mid)){
                maxWorking = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        System.out.println("Max working array dimensions: " + maxWorking);
        System.out.println("First failing dimensions: " + (maxWorking + 1));
    }

    public static boolean canCreateArrayWithDimensions(int dimensions){
        try{
            int[] sizes = new int[dimensions];
            for(int i = 0; i < sizes.length; i++){
                sizes[i] = 1;
            }

            Object array = java.lang.reflect.Array.newInstance(int.class, sizes);
            return array != null;
        }catch(Throwable t){
            return false;
        }
    }

    public static int quotient(int number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1/number2;
    }


    public static void myMethod(int x) throws IllegalArgumentException{
        IllegalArgumentException ex = new IllegalArgumentException("Wrong Argument");
        throw ex;
    }
}



