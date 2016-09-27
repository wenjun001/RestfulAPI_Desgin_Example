package net.example.services;

import net.example.model.user.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiu on 9/20/16.
 */
public class UserService {

    List<User> DBUser;

   public UserService(){
       DBUser = new ArrayList<>();

       User user1 = new User(1,"vincent");
       user1.setAddress(new Address("aa","bb","cc","dd"));
       List<Email> emails = new ArrayList<>();
       emails.add(new Email("vincent.ma@oracle.com",true));
       emails.add(new Email("vincent.ma2@oracle.com", false));
       user1.setEmailList(emails);

       DBUser.add(user1);


       User user2 = new User(2,"xiu");
       user1.setAddress(new Address("aa","bb","cc","dd"));
       List<Email> emails2 = new ArrayList<>();
       emails2.add(new Email("vincent.ma@oracle.com",true));
       emails2.add(new Email("vincent.ma2@oracle.com", false));
       user2.setEmailList(emails2);
       DBUser.add(user2);



   }

    public List<User> getAllUser(){
        return DBUser;
    }

    public User getUserByUserId(long userId){
       for (User user:DBUser){
           if(user.getUserId() == userId){
               return user;
           }
       }
        return null;
    }


    public List getUserByUserName(String name){
        List result  = new ArrayList();
        for (User user:DBUser){
            if(user.getUserName().equals(name)){
                result.add(user);
                return result;
            }
        }
        return null;
    }



    public User addUser(User user){
        DBUser.add(user);
        return user;


    }

    public  User updateUser(User user2){
        for (User user:DBUser){
            if(user.getUserId() == user2.getUserId()){
               User temp = DBUser.get(user2.getUserId());
                temp.setUserName(user2.getUserName());
                temp.setEmailList(user2.getEmailList());
                temp.setAddress(user2.getAddress());
                return temp;
            }
        }
        return null;

    }

    public  void delete(int userId){
        User user = new User();
        user.setUserId(userId);
        DBUser.remove(user);

    }

}
