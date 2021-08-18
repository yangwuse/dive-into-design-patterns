package behavioral.iterator.bookcode.socialnetwork;

import java.util.ArrayList;
import java.util.List;

import behavioral.iterator.bookcode.iterators.LinkedInIter;
import behavioral.iterator.bookcode.iterators.ProfileIterator;
import behavioral.iterator.bookcode.profile.Profile;

public class LinkedIn implements SocialNetwork{
    private List<Profile> profiles;

    public LinkedIn(List<Profile> cache) {
        if (cache != null)
            profiles = cache;
        else
            profiles = new ArrayList<>();
    }

    public Profile getProfile(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + 
        "' over the network...");
        return findProfile(profileEmail);
    }

    public List<String> getFriendsEmails(String profileEmail, String contactType) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" +
        profileEmail + "' over the network");
        Profile profile = findProfile(profileEmail);
        if (profile != null)
            return profile.getContacts(contactType);
        return null;

    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail))
                return profile;
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIter(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkerIterator(String profileEmail) {
        return new LinkedInIter(this, "coworkers", profileEmail);
    }
}
