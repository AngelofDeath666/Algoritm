package Mandatory1;

import java.util.Scanner;

public class ringOfFire {
    public static void main(String[] args) {

        //input = int N,C,K // K= slut antal elever, N = students, C = eliminationNr

        Scanner sc = new Scanner(System.in);
        int n,c,k;

        n = sc.nextInt(); // Total student
        c = sc.nextInt(); // Kill count
        k = sc.nextInt(); // Number of survivors

        //Lav array af integers, aka elever
        boolean[] students = new boolean[n];
        for (int i=0; i<n; i++ ) {
            students[i] = true;
//            System.out.println(students[i]);
        }

        dead(c,n,k,students);

        int aliveCount=0;

        for (int i=0; i<n; i++ ) {
            if (students[i]) {
                System.out.print(i + 1);
                aliveCount++;
                if (aliveCount!=k)
                    System.out.print(" ");
            }
        }
    }

    public static void reset(){

    }

    public static void dead(int c, int n, int k, boolean[] students){ //Ændre de elever i arrayet, som er døde

        int count = c;
        int alive = n; // starts at total student, and goes down to k
        int index = 0;

        while (alive > k){
//If student is dead, skip him in counting, and index++.
            if (!students[index]) {
//                System.out.println("Skips cause dead "+ index);

                if (index == students.length-1){ //Reset index in ring
                    index = 0;
//                    System.out.println("Ring reset");
                }
                else {
                    index++;
                }

                continue;
            }

            else if (count == 1) { // if student dies, kill him, count reset, alive down, index++.
                students[index] = false;
                count = c;
                alive--;
//                System.out.println("Die number " + index);

                if (index == students.length-1){ //Reset index in ring
                    index = 0;
//                    System.out.println("Ring reset");
                }
                else
                    index++;

                continue;
            }
            else {
                count--;

                if (index == students.length-1){ //Reset index in ring
                    index = 0;
//                    System.out.println("Ring reset");
                }
                else {
                    index++;
                }
            }



        }

    }

}
