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
public class number_count {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         String str=sc.next();
         int num=0;
         char[] ch=str.toCharArray();
         for(int count=0;count<str.length();count++)
         {
             if(Character.isDigit(ch[count]))
                 num++;
         }
         System.out.println(num);
         
     }
}
