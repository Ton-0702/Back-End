package edu.kits.kitsspringmvc.Controller;

import edu.kits.kitsspringmvc.Service.UserService;
import edu.kits.kitsspringmvc.UserDTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
// /users
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping
//    @ResponseBody
    public String getAllUsers(Model model){
        // 1. Get All Users
        List<User> users = userService.getAllUsers();
//        System.out.println(userService.display());
//        return "index";

        // 2. Pass users to model
        model.addAttribute("users", users);
        return "userList";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id, Model model){
        System.out.println("id: "+id);
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "userDetails";
    }

    @GetMapping("/findUser")
    @ResponseBody
    public User findUserByIdAndName(@RequestParam("id") Long id, @RequestParam("name") String name){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        User user = userService.findUserByIdAndName(id, name);
        return "findUserDetails";
    }
}
