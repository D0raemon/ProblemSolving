package my.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Gaurav on 1/24/2017.
 */

public class Array_Sum_Of_Two_Numbers {

    static void printSum(int arr[], int sum) {

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int number : arr){
            map.put(number, false);
        }

        for (int pair1 : arr) {
            int pair2 = sum - pair1;
            // Important to see if the value exist in the map or not
            if (pair2 > 0 && map.containsKey(pair2) && map.get(pair2)) {
                System.out.println("Elements in array whose sum equals " + sum + " are " + pair1 + " and " + pair2);
                return;
            }
            map.put(pair1, true);
        }

        System.out.println("Elements in array whose sum equals " + sum + " are not present in the given array");
    }

    public static void main(String args[]) {

        System.out.print("Enter a value to find two numbers in array whose sum equals the value provided :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = {4, 6, 3, 5, 2, 1, 7, 102};
        printSum(arr, number);

    }
}
