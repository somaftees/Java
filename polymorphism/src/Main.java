/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Main {
    public static void main (String[]args){
      
   Male o1 = new Male();
   
   Female o2 = new Female();
   
   
   Person hala = new Female();
   Female o3 = (Female)hala;
   
   Person Ali = new Male();
   
   
  
   
   
   
   System.out.println(hala.getClass());
   System.out.println(Ali.getClass());
   System.out.println(o3.getClass());
   
   o1.print();
   o2.print();
   o3.print();
   hala.print();
   Ali.print();
   o1.a= 40;
   
   Ali.a=20;
   System.out.println(o1.a);
   System.out.println(Ali.a);
   
   
   
      
      
    }
}
