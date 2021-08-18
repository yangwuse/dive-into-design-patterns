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
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIter(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> friends = facebook.getFriends(email, type);
            for (String friend : friends) {
                emails.add(friend);
                profiles.add(null);
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
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.getProfile(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;        
    }
    
}
