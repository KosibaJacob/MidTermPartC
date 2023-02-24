/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.*;

/**
 *
 * @author kubakosiba
 */
public class TestUserprofile {
    public static void main(String[] args) {
        
              
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String input1 = scanner.next();
        System.out.println("What is your favourite genere: 0,1,2,3");
        String input2 = scanner.next();
        UserProfile user = new UserProfile(input1, input2);   
        System.out.println(user.getUserID() + user.getGenre());
        
                
    }
    
}
