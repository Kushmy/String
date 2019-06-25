/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

import java.util.Scanner;

/**
 *
 * @author KUSHMITHA
 */
public class special_count {
    
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         String str=sc.next();
         int special=0,temp=0;
         
         for(int count=0;count<str.length();count++)
         {
             if((str.charAt(count)>='A' && str.charAt(count)<='Z')||(str.charAt(count)>='0' && str.charAt(count)<='9')||(str.charAt(count)>='a' && str.charAt(count)<='z'))
                temp++;
             else
                 special++;
         }
         System.out.println(special);
         
     }
    
    
    
}
