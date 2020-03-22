package Mandatory2;

import java.util.Scanner;
import java.util.Stack;

public class Caesarplusplus {

    public static void main(String[] args) {

// input til output
        Scanner sc = new Scanner(System.in);
        Stack<Character> myStack = new Stack<Character>();

        // tager den første integer og læser den
        String length = sc.nextLine();
        int len = Integer.parseInt(length);

        // tager resten og læser det
        String input = sc.nextLine();
        sc.close();


        input = input.replaceAll("\\s", "");

        // Pushing every character of the string into the stack, maybe not needed :3
        char[] ch = input.toCharArray();

        // genere stacken
        int temp = 0;
        int tot = 0;
        int cipher;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                ch[i] = (char) ((ch[i] + tot - 65) % 26 + 65);
                tot = tot + temp;
                temp = 0;

//                if (i> 1 && Character.isDigit(ch[i-1])){
//                    myStack.pop();
//                }

            } else if (Character.isDigit(ch[i])) {
                cipher = Integer.parseInt(String.valueOf(ch[i]));

                if (Character.isDigit(ch[i - 1]) && i > 1) {
                    temp = temp * 10 + cipher;
                    cipher = 0;
                    //myStack.pop();
                }
                temp = temp + cipher;
                // if previous char was an int multiply previous int by 10 and add current int

//

            }

            else { // pop  (^)



                char pop = myStack.pop();
                //System.out.println("Pop: " + pop);
                tot = tot + temp;
                temp = 0;

                continue;
            }

            char push = myStack.push(ch[i]);
            //System.out.println("Push: " + push);
            if (i> 1 && Character.isDigit(ch[i-1])){
                myStack.pop();
            }



        }
        Object[] blyat = myStack.toArray();
        for (int p = 0; p < blyat.length; p++) {
            System.out.print(blyat[p]);
            if (p != blyat.length - 1)
                System.out.print(" ");
        }
    }

}