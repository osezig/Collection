import java.util.HashMap;
import java.util.Map;

public class Phonebook1 {
    private final Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String number) {
        contacts.put(name, number);

    }
    public void removeContact(String name ){
        contacts.remove(name);
    }


    @Override
    public String toString() {
        return "Phonebook1{" +
                "contacts=" + contacts +
                '}';
    }
}


