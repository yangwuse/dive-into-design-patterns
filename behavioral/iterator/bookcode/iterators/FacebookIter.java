package behavioral.iterator.bookcode.iterators;

import java.util.ArrayList;
import java.util.List;

import behavioral.iterator.bookcode.profile.Profile;
import behavioral.iterator.bookcode.socialnetwork.Facebook;

public class FacebookIter implements ProfileIterator{
    private Facebook facebook;
    private String type;
    private String email;
    private int currentPosition;
    private List<String> contactsEmails = new ArrayList<>();
    private List<Profile> contactsProfiles = new ArrayList<>();

    public FacebookIter(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (contactsEmails.isEmpty()) {
            List<String> contacts = facebook.getContacts(email, type);
            for (String contact : contacts) {
                contactsEmails.add(contact);
                contactsProfiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < contactsEmails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext())
            return null;
        String friendEmail = contactsEmails.get(currentPosition);
        Profile friendProfile = contactsProfiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.getProfile(friendEmail);
            contactsProfiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;        
    }
    
}
