import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task5() {
    }

    private static void task7() {
    }

    private static void task6() {

    }

    private static void task1() {
        System.out.println(" задача 1");
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        float[] arr1 = {1.57f, 7.654f, 9.986f};

        String[] arr2= { " a ", "b ", "c ", "d"};
    }

    private static void task2() {
        System.out.println(" Задача 2 ");
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        float[] arr1 = {1.57f, 7.654f, 9.986f};
        String[] arr2= { "a", "b", "c", "d"};
        for (int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(", ");
            }
        }
System.out.println();
        for (int i=0 ; i<arr1.length; i++){
            System.out.print(arr1[i]);
            if(i != arr1.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=0 ; i<arr2.length; i++){
            System.out.print(arr2[i]);
            if(i != arr2.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        }


    private static void task3() {
        System.out.println("задача 3");
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        float[] arr1 = {1.57f, 7.654f, 9.986f};
        String[] arr2= { " a ", "b ", "c ", "d"};
        for (int i= arr.length-1; i>=0; i-- ) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i= arr1.length-1; i>=0; i-- ) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i= arr2.length-1; i>=0; i-- ) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    private static void task4() {
        System.out.print("задача 4");
        int[] arr={ 1, 2, 3};
        for (int i=0 ; i<arr.length; i++){
            if (arr[i] % 2!=0){
                arr[i]+=1;
            }
        }
System.out.println(Arrays.toString(arr));
    }
}








