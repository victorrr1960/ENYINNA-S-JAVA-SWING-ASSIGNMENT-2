/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Enyinna
 */
public class UserDirectory {
    ArrayList<User> allUsers;

    public UserDirectory() {
        this.allUsers = new ArrayList<>();
    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }
    
    public void addUser(User newUser){
        this.allUsers.add(newUser);
    }
    
    public void removeUser(User User){
        this.allUsers.remove(User);
    }

    
    
}
