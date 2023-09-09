package Ex_6_practice;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return Integer.compare(user1.getPersonalNumber(), user2.getPersonalNumber());
    }
}
