package staticKeyword;
public class Friend {
    public String name;
    public static int numOfFriends;
    public Friend(String name) {
        this.name = name;
        numOfFriends++;
    }
    static void displayFriendCount() {
        System.out.println("Total number of friends: " + numOfFriends);
    }
}
