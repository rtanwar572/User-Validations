package com.user.Service;

import com.user.Model.User;
import com.user.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    @Autowired
    UserRepo userRepo;


    public String addUser(User user) {
        userRepo.getArrList().add(user);
        return "Added";
    }


    public List<User> deleteUser(Integer id) {
            for (int i = 0; i < userRepo.getArrList().size(); i++) {
                if (id.equals(userRepo.getArrList().get(i).getUserId())){
                    userRepo.getArrList().remove(userRepo.getArrList().get(i));
                    break;
                }
            }
        return userRepo.getArrList();

    }

    public String addAllUser( List<User> mylist) {
        userRepo.getArrList().addAll(mylist);
        return mylist.size()+" Were Added !!";
    }

    public List<User> getAllUser() {
        return userRepo.getArrList();
    }

    public List<User> getUser(Integer id) {
        List<User> result=new ArrayList<>();
        for (User rest:userRepo.getArrList()) {
            if (id.equals(rest.getUserId())){
                result.add(rest);
            }
        }
        return result;
    }

    public String updateUser(Integer id,String uName) {
        for (User rest:userRepo.getArrList()) {
            if (id.equals(rest.getUserId())){
                rest.setUserName(uName);
                return "Updated Successfully !!";
            }
        }
        return "Invalid ";
    }
}
