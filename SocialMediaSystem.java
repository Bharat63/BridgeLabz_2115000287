import java.util.*;

class User {
    int userId;
    String name;
    int age;
    FriendNode friends;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }

    public void addFriend(int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        if (friends == null) {
            friends = newFriend;
        } else {
            FriendNode temp = friends;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newFriend;
        }
    }

    public void removeFriend(int friendId) {
        if (friends == null) return;
        if (friends.friendId == friendId) {
            friends = friends.next;
            return;
        }
        FriendNode temp = friends;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public boolean hasFriend(int friendId) {
        FriendNode temp = friends;
        while (temp != null) {
            if (temp.friendId == friendId) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void displayFriends() {
        if (friends == null) {
            System.out.println("No friends.");
            return;
        }
        FriendNode temp = friends;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int countFriends() {
        int count = 0;
        FriendNode temp = friends;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

class FriendNode {
    int friendId;
    FriendNode next;

    public FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class SocialMedia {
    User head;

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
    }

    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            FriendNode temp1 = user1.friends;
            while (temp1 != null) {
                if (user2.hasFriend(temp1.friendId)) {
                    System.out.print(temp1.friendId + " ");
                }
                temp1 = temp1.next;
            }
            System.out.println();
        }
    }

    public void displayAllFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            user.displayFriends();
        }
    }

    public void displayUserCount() {
        User temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userId + " Name: " + temp.name + " Friends Count: " + temp.countFriends());
            temp = temp.next;
        }
    }
}

public class SocialMediaSystem {
    public static void main(String[] args) {
        SocialMedia system = new SocialMedia();

        system.addUser(1, "Alice", 25);
        system.addUser(2, "Bob", 30);
        system.addUser(3, "Charlie", 22);
        system.addUser(4, "David", 28);

        system.addFriendConnection(1, 2);
        system.addFriendConnection(1, 3);
        system.addFriendConnection(2, 3);
        system.addFriendConnection(3, 4);

        System.out.println("Alice's Friends:");
        system.displayAllFriends(1);

        System.out.println("Mutual Friends between Alice and Bob:");
        system.findMutualFriends(1, 2);

        System.out.println("Removing friendship between Alice and Bob.");
        system.removeFriendConnection(1, 2);

        System.out.println("Alice's Friends after removal:");
        system.displayAllFriends(1);

        system.displayUserCount();
    }
}
