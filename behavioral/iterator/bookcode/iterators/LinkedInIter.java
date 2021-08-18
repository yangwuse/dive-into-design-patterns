package behavioral.iterator.bookcode.iterators;

import java.util.ArrayList;
import java.util.List;

import behavioral.iterator.bookcode.profile.Profile;
import behavioral.iterator.bookcode.socialnetwork.LinkedIn;

public class LinkedInIter implements ProfileIterator {
    private LinkedIn linkedIn;
    private String type;
    private String email;
    private int currentPosition;
    private List<String> emails = new ArrayList<>();
    private List<Profile> contacts = new ArrayList<>();

    public LinkedInIter(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.isEmpty()) {
            List<String> friendsEmails = linkedIn.getFriendsEmails(email, type);
            for (String email : friendsEmails) {
                emails.add(email);
                contacts.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) 
            return null;
        String friendEmail = emails.get(currentPosition);
        Profile friendContact = contacts.get(currentPosition);
        if (friendContact == null) {
            friendContact = linkedIn.getProfile(friendEmail);
            contacts.add(currentPosition, friendContact);
        }
        currentPosition++;
        return friendContact;
    }

    @Override
    public void reset() {
        currentPosition = 0;        
    }
    
}
