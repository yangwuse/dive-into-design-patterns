package behavioral.iterator.bookcode.iterators;

import behavioral.iterator.bookcode.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
