package Mandatory3;

import java.util.Arrays;
import java.util.Scanner;

public class XmasLights {

    public static void main(String[] args) {
        // input til output
        Scanner sc = new Scanner(System.in);

        //Read the input
        String input = sc.nextLine();
        sc.close();

        String[] numbers = input.split("\\s");
        for (String a : numbers) { //todo delete
            System.out.println(a);
        }

        for (i = 0; i < numbers.length; i++) {
            int temp = 0;

            for (j = i + 1; j < numbers.length; j++){
                if (numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
            System.out.println(Arrays.toString(numbers)); //todo
        }

        for (i = 0; i < numbers.length; i++) {
            int tempLongest = 0;
            int longest = 0;

            for (j = i + 1; j < numbers.length; j++){
                if (Integer.parseInt(numbers[i]) == Integer.parseInt(numbers[i] - 1)){
                    tempLongest += 1;

                }
            }
        }









    }
}
