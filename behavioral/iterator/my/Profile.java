package behavioral.iterator.my;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 个人简历

public class Profile {
    private String name;
    // id
    private String email;
    // "friends  : list" 
    // "coworker : list"
    private Map<String, List<String>> contacts = new HashMap<>();

    public Profile(String email, String name, String... contacts) {
        this.email = email;
        this.name = name;
        for (String contact : contacts) {
            // strs[0] : contactType 
            // strs[1] : contactEmail 
            String[] strs = contact.split(":");
            this.contacts.computeIfAbsent(strs[0], 
                key -> new ArrayList<>()).add(strs[1]);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getContacts(String contactType) {
        return contacts.computeIfAbsent(contactType, key -> new ArrayList<>());
    }
}
