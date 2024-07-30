package esercizio1;

import java.util.*;

public class Es1 {
    public static void main(String[] args) {
        Set<String> arr = new HashSet<>();
        List<String> arrOfDuplicate = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int numOfElements;

        try {
            System.out.println("Quanti elementi vuoi inserire nell'array? ");
            numOfElements = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Errore devi inserire un numero");
            numOfElements = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            numOfElements = Integer.parseInt(sc.nextLine());
        }


        for (int i = 0; i < numOfElements; i++) {
            System.out.println("inserisci la parola");
            String word = sc.nextLine();
            if (arr.add(word)) arr.add(word);
            else arrOfDuplicate.add(word);
        }

        System.out.println("il numero delle parole distinte è: " + arr.toArray().length);
        System.out.println("parole duplicate: " + arrOfDuplicate);
        System.out.println("lista parole distinte: " + arr);
    }
}
