package behavioral.iterator.my;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new Facebook(getTestProfiles());
        Spammer spammer = new Spammer(socialNetwork);
        spammer.sendSpamToFriends("aaa@123.com", "buy a iphone?");
        spammer.sendSpamToCoworkers("aaa@123.com", "get a good job?");
    }

    public static List<Profile> getTestProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("aaa@123.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
