import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, HashSet<String>> phoneBook;

    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> book = phoneBook.getOrDefault(name, new HashSet<>());
        book.add(phone);
        phoneBook.put(name, book);
    }

    public void findAndPrint(String name) {
        System.out.println("Contact " + name + " / Phone number " + phoneBook.getOrDefault(name, new HashSet<>()));
    }
}