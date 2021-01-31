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
public class Cesar {
    private String message;
    private int key;
    private static char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    public Cesar (){
        super();
    }
    
    public Cesar ( String message, int key){
        super();
        this.message= message;
        this.key= key;
        
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public static char[] getAlfabeto() {
        return alfabeto;
    }

    public static void setAlfabeto(char[] alfabeto) {
        Cesar.alfabeto = alfabeto;
    }

   public void LeerMsj(){
       
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Introduzca su mensaje");
       
       setMessage(sc.nextLine().toUpperCase());
       
       System.out.println("Introduzca la llave");
       
       setKey(sc.nextInt());
       
       sc.close();
   }
    
   public char [] encriptar (){
       
       char [] newMessage= new char [getMessage().length()];
       
       for (int i = 0; i < getMessage().length(); i++) {
           if (getMessage().charAt(i)== ' '){
               newMessage[i]=getMessage().charAt(i);
           }else {
               for (int j = 0; j < getAlfabeto().length; j++) {
                   if (getMessage().charAt(i)==getAlfabeto()[j]){
                       if (getKey()<0){
                           newMessage[i]=getAlfabeto()[(j+getKey()+getAlfabeto().length)%getAlfabeto().length];
                           j=getAlfabeto().length;
                       }else{
                           newMessage[i]=getAlfabeto()[(j+getKey())%getAlfabeto().length];
                           j=getAlfabeto().length;
                       }
                   }else{
                       newMessage[i]=getMessage().charAt(i);
                   }
               }
           }
       }
       return newMessage;
   }
   
   public char[] decriptar(){
       char [] newMessage= new char [getMessage().length()];
       
       for (int i = 0; i < getMessage().length(); i++) {
           if (getMessage().charAt(i)== ' '){
               newMessage[i]=getMessage().charAt(i);
           }else {
               for (int j = 0; j < getAlfabeto().length; j++) {
                   if (getMessage().charAt(i)==getAlfabeto()[j]){
                       if (j<getKey()){
                           newMessage[i]=getAlfabeto()[(j-getKey()+getAlfabeto().length)%getAlfabeto().length];
                           j=getAlfabeto().length;
                       }else{
                           newMessage[i]=getAlfabeto()[(j-getKey())%getAlfabeto().length];
                           j=getAlfabeto().length;
                       }
                   }else{
                       newMessage[i]=getMessage().charAt(i);
                   }
               }
           }
       }
       return newMessage;
   }
    
}

