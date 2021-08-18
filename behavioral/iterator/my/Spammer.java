package behavioral.iterator.my;

public class Spammer {
    SocialNetwork socialNetwork;
    ProfileIterator iterator;

    public Spammer(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public void sendSpamToFriends(String ownerEmail, String msg) {
        System.out.println("SentSpamToFriends...");
        iterator = socialNetwork.createFriendsIterator(ownerEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.next();
            sendMsg(profile.getEmail(), msg);
        }
    }

    public void sendSpamToCoworkers(String ownerEmail, String msg) {
        System.out.println("SendSpamToFriends...");
        iterator = socialNetwork.createCOworkersIterator(ownerEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.next();
            sendMsg(profile.getEmail(), msg);
        }
    }

    private void sendMsg(String email, String msg) {
        System.out.println("Send msg to : '" + email + "'. Message body: '" +
            msg + "'");
    }

}
