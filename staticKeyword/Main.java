package staticKeyword;
public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Alice");
        Friend friend2 = new Friend("Bob");
        Friend friend3 = new Friend("Charlie");
        Friend friend4 = new Friend("Diana");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);

        Friend.displayFriendCount();
    }
}
