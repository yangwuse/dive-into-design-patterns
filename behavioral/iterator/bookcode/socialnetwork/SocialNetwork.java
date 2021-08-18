package behavioral.iterator.bookcode.socialnetwork;

import behavioral.iterator.bookcode.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkerIterator(String profileEmail);
}
