package Lab01;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        double my_array[] = new double[n];
        double sum = 0;


        for(int i = 0; i < n; i++){
            my_array[i] = keyboard.nextDouble();
        }

        Arrays.sort(my_array);

        for(int i = 0; i < n; i++){
            sum += my_array[i];
        }
        double average = sum / n;

        for(int i = 0; i < n; i++){
            System.out.println(my_array[i]);
        }
        System.out.println(average);

    }

    private static void sort(double[] my_array) {
    }
}

