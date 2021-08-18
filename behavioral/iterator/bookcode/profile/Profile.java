package behavioral.iterator.bookcode.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private String email;
    private String name;
    private Map<String, List<String>> contacts = new HashMap<>();
    public Profile(String email, String name, String... contacts) {
        this.name = name;
        this.email = email;
        for (String contact : contacts) {
            String[] parts = contact.split(":");
            String contactType = parts[0];
            String contactEmail = parts[1];
            this.contacts.computeIfAbsent(contactType, 
                key -> new ArrayList<>()).add(contactEmail);
        }
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public List<String> getContacts(String contactType) {
        return contacts.computeIfAbsent(contactType, key -> new ArrayList<>());
    }
}
