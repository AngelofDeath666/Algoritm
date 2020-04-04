package Mandatory3;

import java.util.Arrays;
import java.util.Scanner;

public class XmasLights {

    public static void main(String[] args) {
        int tempLongest = 1;
        int longest = 0;

        // input til output
        Scanner sc = new Scanner(System.in);

        String length = sc.nextLine();
        int len = Integer.parseInt(length);

        //Read the input
        String input = sc.nextLine();
        sc.close();

        String[] str = input.split("\\s");
//        for (String a : str) { //todo delete
//            System.out.println(a);
//        }


        int[] numbers = new int[len];
        for (int a = 0; a < len; a++){
            numbers[a] = Integer.parseInt(str[a]);
        }

        for (int i = 0; i < len; i++) {
            int temp;

            for (int j = i + 1; j < len; j++){
                if (numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
//            System.out.println(Arrays.toString(numbers)); //todo
        }

//        for (int i = 0; i < len; i++) {


            for (int i = 0; i < len; i++){
                if (i != 0 && numbers[i] == numbers[i-1] + 1){
                    tempLongest += 1;
                } else {
                    if (tempLongest > longest){
                      longest = tempLongest;
                    } else {
                        tempLongest = 1;
                    }
                }
                if (tempLongest > longest) {
                    longest = tempLongest;
                }
            }
//        }
        System.out.println(longest);









    }
}
