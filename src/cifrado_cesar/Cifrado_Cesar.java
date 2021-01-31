/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado_cesar;

/**
 *
 * @author Eliana Velasquez
 */
import java.util.Scanner;
public class Cifrado_Cesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cesar c = new Cesar();
        c.LeerMsj();
        System.out.println(c.encriptar());
        
        
       
    }
    
}
