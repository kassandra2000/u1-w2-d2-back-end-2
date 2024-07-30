package esercizio3;

import java.util.*;

public class Es3 {
    static HashMap<String, Long> addressBook = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("-----------------------esercizio 1------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num == 0) {
            System.out.println("quanti contatti vuoi aggiungere? ");
            try {
                num = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Errore devi inserire un numero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println("inserisci un nome: ");
            String name = sc.nextLine();
            System.out.println("inserisci un numero di telefono: ");
            long numb = Long.parseLong(sc.nextLine());
            add(name, numb);
        }
        System.out.println(addressBook);

        System.out.println("-----------------------esercizio 2------------------------------------------");
        Set<String> keyAddressBook = addressBook.keySet();
        List<String> keyList = new ArrayList<>(keyAddressBook);
        System.out.println("scegli quale eliminare: ");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.println((i + 1) + ". " + keyList.get(i));
        }
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Errore devi inserire un numero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        switch (choice) {
            case 1:
                remove(keyList.getFirst());
                System.out.println(addressBook);
                break;
            case 2:
                remove(keyList.get(1));
                System.out.println(addressBook);
                break;
            case 3:
                remove(keyList.get(2));
                System.out.println(addressBook);
                break;
            case 4:
                remove(keyList.get(3));
                System.out.println(addressBook);
                break;
            case 5:
                remove(keyList.get(4));
                System.out.println(addressBook);
                break;
            case 6:
                remove(keyList.get(5));
                System.out.println(addressBook);
                break;
            default:
                System.out.println("non è stato possibile eliminare nessun elemento");
        }


        System.out.println("--------------------esercizio 3----------------------------------");
        System.out.println("inserisci il nome da cercare: ");

        String name;
        while (true) {
            try {
                name = sc.nextLine();
                System.out.println("il numero di cellulare di " + name + " è: " + search(name));
                break;
            } catch (NullPointerException e) {
                System.out.println("Errore devi inserire la stringa corretta");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("--------------------esercizio 4----------------------------------");
        Collection<Long> valueAddressBook2 = addressBook.values();
        List<Long> keyList2 = new ArrayList<>(valueAddressBook2);

        System.out.println("inserisci il numero  da cercare: ");
        for (int i = 0; i < keyList2.size(); i++) {
            System.out.println((i + 1) + ". " + keyList2.get(i));
        }

        int choice2;
        while (true) {
            try {
                choice2 = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Errore devi inserire un numero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        switch (choice2) {
            case 1:
                searchInt(keyList2.getFirst());
                break;
            case 2:
                searchInt(keyList2.get(1));
                break;
            case 3:
                searchInt(keyList2.get(2));
                break;
            case 4:
                searchInt(keyList2.get(3));
                break;
            case 5:
                searchInt(keyList2.get(4));
                break;
            case 6:

                searchInt(keyList2.get(5));
                break;
            default:
                System.out.println("non è stato possibile eliminare nessun elemento");
        }

        System.out.println("--------------------esercizio 5----------------------------------");
        printArray();
    }

    public static void add(String str, long num) {
        addressBook.put(str, num);
    }

    public static void remove(String str) {
        addressBook.remove(str);
    }

    public static long search(String str) {

        return addressBook.get(str);
    }

    public static void searchInt(Long value) {
        for (String name : addressBook.keySet()) {
            if (value.equals(addressBook.get(name))) {

                System.out.println("il contatto che cercavi è: " + name + " e il suo numero è: " + addressBook.get(name));
            }
        }

    }


    public static void printArray() {

        System.out.println(addressBook);
    }

}
