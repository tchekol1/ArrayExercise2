import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        //1. Write a program to print a string in reverse:
        //Eg: Welcome
        String rev= "Welcome";
        int repeat=0;
        int count=0;
        int j=0;
        String greeting="";
        int odd=0;
        int even=0;
        for (int i = rev.length()-1; i>=0 ; i--) {
            greeting+=rev.charAt(i);
        }
        System.out.println(greeting);
        for (int i = 0; i <greeting.length() ; i++) {
            count++;
        }
        System.out.println("The input greeting has " +count + " length");

        System.out.println();
        //3. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:

        int []arr1={1,7,6,5,9};
        int []arr2={2,7,6,3,4};
        System.out.println("Numbers which gives 13 when added ");
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k <arr2.length ; k++) {
                if((arr1[i]+arr2[k])==13){
                    System.out.print("("+arr1[i]+" , ");
                    System.out.print(arr2[k]+" )");
                }

            }

        }
        System.out.println();
        //4. Prompt the user to input 10 values and store them into an array.
        // Output the total number of odd and even values in the array.
        int []number= new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter a number ");
            number[i]=scanner.nextInt();
        }
        for (int i = 0; i <number.length ; i++) {
            if(number[i]%2==0){
                even++;
            }
            else
                odd++;

        }
        System.out.println("The number of even number 1-10 = "+ even);
        System.out.println("The number of odd number 1-10 = "+ odd);
        scanner.nextLine();
        //(Challenge!)  Prompt the user to input one line of a string.
        // Parse the string into a word, print out the word and length of the word.
        // Assume that the maximum size of a line is 132.
        System.out.println("Enter a sentences or word");
        String str= scanner.nextLine();
        System.out.println("You entered "+str);
        String []arr= str.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" has "+ arr[i].length()+" characters" );
        }
    }
}


