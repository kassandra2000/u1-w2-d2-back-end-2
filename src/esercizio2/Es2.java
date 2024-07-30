package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {

        System.out.println("-----------------------esercizio 1--------------------------------");
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num == 0) {
            System.out.println("quanti elementi vuoi inserire nell'array?");
            try {
                num = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Errore devi inserire un numero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(orderedList(num));

        System.out.println("-----------------------esercizio 2--------------------------------");
        System.out.println(reverseList(orderedList(num)));

        System.out.println("-----------------------esercizio 3--------------------------------");
        trueOrFalseList(orderedList(num), false);
    }

    public static ArrayList<Integer> orderedList(int num) {
        ArrayList<Integer> arrOrderedList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            arrOrderedList.add(r.nextInt(0, 101));
        }
        Collections.sort(arrOrderedList);
        return arrOrderedList;

    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> arr) {
        ArrayList<Integer> arrOfNumber = new ArrayList<>(arr);
        arrOfNumber.addAll(arr.reversed());
        return arrOfNumber;
    }

    public static void trueOrFalseList(ArrayList<Integer> arr, boolean b) {
        System.out.println(arr + "\n");
        for (Integer integer : arr) {
            if (integer % 2 == 0 && b) {
                System.out.print("stampo numeri pari: ");
                System.out.println(integer);
            }
            if (integer % 2 != 0 && !b) {
                System.out.print("stampo numeri dispari: ");
                System.out.println(integer);
            }


        }
    }


}
