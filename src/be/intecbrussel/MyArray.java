package be.intecbrussel;
import java.util.Scanner;
import java.util.Arrays;


public class MyArray {

    public static void main(String[] args){

        //Oefening 1

        Scanner scn = new Scanner(System.in);
        int [] myArray = new int[10];
        for(int i=0; i<10; i++)
        {
            System.out.print("Enter the value\n ");
            myArray[i] = scn.nextInt();
        }
        int maxIndex = 0;
        int max = myArray[0];
        for(int i=0; i<10; i++)
        {
            for(int arr=i+1; arr<10; arr++)
            {
                if(myArray[arr]>max)
                {
                    maxIndex = arr;
                    max = myArray[maxIndex];
                }
            }
        }
        int minIndex = 0;
        int min = myArray[0];
        for(int i=0; i<10; i++)
        {
            for(int j=i+1; j<10; j++)
            {
                if(myArray[j]<min)
                {
                    minIndex = j;
                    min = myArray[minIndex];
                }
            }
        }
        //Oefening 2 met reverse

        System.out.print("\nArray voor reverse:\n");
        for(int index=0; index<10; index++)
            System.out.print(myArray[index] + " ");

        System.out.println("\nArray na reverse: ");
        for(int index= myArray.length -1; index >= 0; index--)
            System.out.print(myArray[index] + " ");

    //Oefening 3

    }
}
