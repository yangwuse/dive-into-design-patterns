package behavioral.iterator.my;

import java.util.ArrayList;
import java.util.List;

public class FacebookIter implements ProfileIterator {
    private Facebook facebook;
    private String contactType;
    private String ownerEmail;
    private int currentPosition;
    private List<String> contactEmails = new ArrayList<>();
    private List<Profile> contactProfiles = new ArrayList<>();

    public FacebookIter(Facebook facebook, String contactType, String ownerEmail) {
        this.facebook = facebook;
        this.contactType = contactType;
        this.ownerEmail = ownerEmail;
    }

    private void lazyLoad() {
        if (contactEmails.isEmpty()) {
            Profile profile = facebook.getProfileByEmail(ownerEmail);
            List<String> contacts = profile.getContacts(contactType);
            for (String contact : contacts) {
                contactEmails.add(contact);
                contactProfiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < contactEmails.size();
    }

    @Override
    public Profile next() {
        if (!hasNext())
            return null;
        Profile contactProfile = contactProfiles.get(currentPosition);
        if (contactProfile == null) {
            contactProfile = facebook.getProfileByEmail(contactEmails.get(currentPosition));
            contactProfiles.add(contactProfile);
        }
        currentPosition++;
        return contactProfile;
    }
    
}
