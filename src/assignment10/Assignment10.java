/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment10;
import inpututilities.InputUtilities;
// this is used to import the inpututilities
/**
 *
 * @author OSAGIE
 */
public class Assignment10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             
        
        InputUtilities myInput = new InputUtilities();
        String Name;
        // Variable decleration
        
         try{
             
        Name = myInput.askUserForText("what is your name?");
        // this gets the input from the keyboard and assign it to Name
        String New = Name.toUpperCase();
        // this convert the string Name to uppercase
        
        String NameSpace = New.replaceAll("", " ").trim();
        /** This manipulates the strings to add space after every alphabet entered after first 
        converting the user input to capital letters
        */
        System.out.println("Hello " +  New  + " Is this the right spelling of your name " + NameSpace);
        //This is to display prompt 
        
        
         }catch (Exception e){
            //input was not an integer - output error message
            System.out.println("You did not enter a aphabets");
        }
    }
    
}
