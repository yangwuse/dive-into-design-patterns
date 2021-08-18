package behavioral.iterator.my;

// 社交网络接口

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String ownerEmail);
    ProfileIterator createCOworkersIterator(String owernEmail);
}
