/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33;

import java.util.Scanner;

/**
 *
 * NAMA :Muhamad Rizky Permana
KELAS : IF-2
NIM : 10118050
Deskripsi Program : user login
 */
public class Latihan33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User u = new User();
        Scanner input= new Scanner(System.in);
        String username = "riaki";
        String password = "enak";
        
        
        
        System.out.print("Username :" );
        
        u.username=input.nextLine();
                
        System.out.print("Password :" );
        u.password=input.nextLine();
        
        if (u.username.equals(username)){
            
            System.out.println("*******Hello" + username +"*****");
        }
        
        
        
       
        
        
    }
    
}
