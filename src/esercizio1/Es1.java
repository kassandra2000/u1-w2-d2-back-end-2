package esercizio1;

import java.util.*;

public class Es1 {
    public static void main(String[] args) {
        Set<String> arr = new HashSet<>();
        List<String> arrOfDuplicate = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int numOfElements = 0;
//
//
        while (numOfElements == 0) {
            System.out.println("quanti elementi vuoi inserire nell'array?");
            try {
                numOfElements = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Errore devi inserire un numero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        for (int i = 0; i < numOfElements; i++) {
            System.out.println("inserisci la parola");
            String word = sc.nextLine();
            if (arr.add(word)) arr.add(word);
            else {
                System.out.println("parola già presente !!");
                arrOfDuplicate.add(word);
                i--;
            }
        }

        System.out.println("il numero delle parole distinte è: " + arr.toArray().length);
        System.out.println("parole duplicate: " + arrOfDuplicate);
        System.out.println("lista parole distinte: " + arr);
    }
}
