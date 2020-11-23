import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] pets = {"cat", "dog", "parrot", "cat", "parrot", "cat", "hamster", "dog", "cat", "hamster", "kitten"};
        HashMap<String, Integer> HomeDurdom = new HashMap<>();

        for (String x : pets) {
            HomeDurdom.put(x, HomeDurdom.getOrDefault(x, 0) + 1);
        }

        System.out.println(HomeDurdom);

        Phonebook book = new Phonebook();
        book.addContact("Vova", "89993531168");
        book.addContact("Nastya", "89998673904");
        book.addContact("Ksenya", "899989436259");
        book.addContact("Vova", "89994572132");
        book.addContact("Nastya", "89998523647");
        book.addContact("Maks", "89993135296");

        book.findAndPrint("Vova");
        book.findAndPrint("Nastya");
        book.findAndPrint("Maks");
    }
}
