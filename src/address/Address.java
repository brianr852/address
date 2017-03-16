/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Address {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
   {
    Scanner scan = new Scanner( System.in );
    final  String VALID_GOV = "This is a government web address ";
    final String VALID_ORG = "This is a orginization web address";
    final String VALID_EDU = "This is a university web address";
    final String VALID_COM = "This is a business web address.";
   
    String reply;
    String emailStr = scan.next();
  
    String DomainType = emailStr.substring(emailStr.length() - 4);

    if (DomainType.matches( ".gov"))
    {
        reply = VALID_GOV;
    }
    else if (DomainType.matches(".org"))
    {
        reply = VALID_ORG;
    }
        else if (DomainType.matches(".com"))
    {
        reply = VALID_COM;
    }
    else if (DomainType.matches(".edu"))
    {
        reply = VALID_EDU;
    }
    else
    {
        reply = "Web adress from another entity";
    }
  
    System.out.println(reply);
        // TODO code application logic here
    }
    
}
