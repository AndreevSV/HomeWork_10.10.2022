import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    int [] arr = new int[]{1, 2, 3};
        System.out.println("Длина массива: " + arr.length);
    //    System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
            System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
        }    else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)  {
                arr[i]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
            System.out.print(arr[i]);
        } else {
                System.out.print(arr[i] + ", ");
            }
        }
    System.out.println();

///////////////////////////////////////////////////////////////////
    double [] arr1 = {1.57, 7.654, 9.986};
        System.out.println("Длина массива: " + arr1.length);
    //    System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length -1) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr1.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
    System.out.println();
///////////////////////////////////////////////////////////////////
    int [] arr2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Длина массива: " + arr2.length);
    //    System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr2.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
    }
}