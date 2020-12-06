package friends;

import java.util.ArrayList;
public class Friends {
    String[] myFriends = {"Artem", "Andrey", "Timur", "Nikita"};
    ArrayList myFriendsVar = new ArrayList();

    Friends() {
        for (var friend : myFriends) {
            myFriendsVar.add(friend);
        }
    }

    void addNewFriend(String friend) {
        myFriendsVar.add(friend);
    }
}






