package Mandatory1;

import java.util.Scanner;


public class comboBreaker {

    public static void main(String[] args) {

// Tag input og omform det til et array.
        Scanner sc = new Scanner(System.in);

        String length = sc.nextLine();
        String input = sc.nextLine();

        int len = Integer.parseInt(length);

        char[] moves = new char[len];

        input = input.replaceAll("\\s", "");

        for (int i = 0; i < input.length(); i++) {
            moves[i] = input.charAt(i);
        }
// Logikken

        for (int i=0; i<len; i++) {

            if (i < len - 3 && combo(moves, i)) {
                System.out.print("F");
                i += 3; //Hvis den laver en combo, så skal den ikke kigge på 4 næste
            }
            else
                System.out.print(counter(moves[i]));
            if (i != len-1)
                System.out.print(" ");

        }

    }

    public static boolean combo(char[] moves, int index){
        int startingIndex=index;

        for (int k=0 ; k<4; k++) { // finder ens bogstaver
            if (index <= startingIndex+2 && moves[index] == moves[index+1]) // tjekker 1 med 2, 2 med 3 og 3 med 4.
                return false;

            else if (index <= startingIndex+1 && moves[index] == moves[index+2]) // Tjekker 1 me 3 og 2 med 4
                return false;

            else if (startingIndex == index && moves[index] == moves[index+3]) // tjekker 1 med 4
                return false;

            else
                index++;
        }

        return true;
    }

    public static char counter(char a){
        if (a == 'C')
            return 'M';
        else if (a=='L')
            return 'E';
        else if (a=='R')
            return 'C';
        else if (a =='S')
            return 'S';
        else
            return ' ';

    }

}
