package edu.kits.kitsspringmvc.Service;

import edu.kits.kitsspringmvc.UserDTO.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    List<User> users;

    public UserService(){
        this.users = new ArrayList<>();
        this.users.add(new User("Nam", 0L));
        this.users.add(new User("Quynh Anh", 1L));
    }
    public List<User> getAllUsers(){
        return this.users;
    }

    public User getUserById(Long id){
//        Cach 1
//        List<User> users = this.users.stream().filter(user -> user.getId() == id).collect(Collectors.toList());
//        if (users.size() > 0){
//            return users.get(0);
//        }
//        return null;

//        Cach 2
        User user = null;
        for (User u : this.users) {
            if(u.getId() == id){
                user = u;
                break;
            }
        }
        return  user;
    }

    public User findUserByIdAndName(Long id, String name){
        User user = null;
        for(User u : this.users){
            if(u.getId() == id && u.getName() == name){
                user = u;
                break;
            }
        }
        return user;
    }

    public String display(){
        String out = "";
        for (User user : this.users){
            out += "" + user.getName() + " - " + user.getId() + "\n";
        }
        return out;
    }
}
