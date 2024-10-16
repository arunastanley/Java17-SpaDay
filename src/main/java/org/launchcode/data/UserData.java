package org.launchcode.data;



import org.launchcode.models.User;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class UserData {

    private static Map<Integer, User> userList = new HashMap<>();

//    add
    public static void addUsers(User user){
        userList.put(user.getId(),user);
    }

//    getAll
    public static Collection<User> getAll(){
        return userList.values();
    }


//    getById
    public static User getById(int id){
        return userList.get(id);
    }
}
