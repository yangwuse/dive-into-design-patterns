package behavioral.iterator.my;

import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles;
    
    public Facebook(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public Profile getProfileByEmail(String email) {
        for (Profile p : profiles) {
            if (p.getEmail().equals(email))
                return p;
        }
        return null;
    }

    public List<String> getContactsByEmail(String email, String contactType) {
        return getProfileByEmail(email).getContacts(contactType);
    }

    @Override
    public ProfileIterator createFriendsIterator(String ownerEmail) {
        return new FacebookIter(this, "friends", ownerEmail);
    }

    @Override
    public ProfileIterator createCOworkersIterator(String owernEmail) {
        return new FacebookIter(this, "coworkers", owernEmail);
    }
    
}
