package Mandatory2;

import java.util.Scanner;
import java.util.Stack;

public class Caesarplusplus {

    public static void main(String[] args) {

// input til output
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();

        // tager den første integer og læser den
        String length = sc.nextLine();
        int len = Integer.parseInt(length);

        // tager resten og læser det
        String input = sc.nextLine();
        input = input.replaceAll("\\s", "");

        // genere stacken
        for (int i=0; i<len; i++){

            boolean yesInt = false;
            int a;

            try {
                a= Character.getNumericValue(input.charAt(i));
                yesInt = true;
            }catch (Exception e){
                System.out.println("Not an int");
            }

            if (input.charAt(i) == 94) { //Tjekker for pop  (^)

                if (yesInt == true){
                    System.out.println("Move numbers: " + a);
                }

                char pop = stack.pop(); // todo
                System.out.println("Pop: " +  pop); //todo

                continue;
            }

            stack.push(input.charAt(i));

            if (input.charAt())

        }

    }
    // metode for at printe stacken // todo
    public static void stackPrint (char [] stack) {
        for (int p = 0 ; i < n; i++) {

            System.out.println();
        }
    }


}
