package friends;

import static java.lang.String.format;

    public class SayHello {
        public static void main(String[] args) {
            var helloFriends = new Friends();
            helloFriends.addNewFriend("Nastya");
            helloFriends.addNewFriend("Sasha");
            for (int i = 0; i < helloFriends.myFriendsVar.size(); i++) {
                System.out.println(format("Hello %s",
                        helloFriends.myFriendsVar.get(i)));
            }
        }
    }

