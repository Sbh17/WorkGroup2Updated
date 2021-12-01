import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    // Checking if the organ value is bigger than array's average
    public static void isNumBiggerThanAvg(int []arr){
        double avg=0;
        for (int i=0;i<arr.length;i++){
            avg+=arr[i];
        }
        avg=avg/arr.length;
        System.out.println("The Average is "+avg);
        int j=0;
        while (j<arr.length) {
            if (arr[j] > avg) {
                System.out.println(arr[j]);
                System.out.println("The organ arr[" + j + "] is bigger than avg.");
                j++;
            } else
                j++;
        }
    }
    public static void main(String[] args) {
        // Testing array
        int [] arr ={10,11,2,7,9,5,16,8,12,25};
        isNumBiggerThanAvg(arr);
        // Scanning form user values from array & the print the numbers are bigger than the avg
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating new array");
        int [] arr1 = new int[10];
        for(int i=0;i< arr.length;i++){
            System.out.println("Please enter the value");
            arr1[i]= scanner.nextInt();
        }
        System.out.println("The array is :"+ Arrays.toString(arr));
        isNumBiggerThanAvg(arr1);
    }
}
