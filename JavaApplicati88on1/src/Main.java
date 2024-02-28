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
      
    A o1 = new A();
    A o2 = new A();
    A o3 = new A();
    A o4 = new A();
    A o5 = new A();
    
      A[] list={o1, o2, o3, o4, o5};
      o3.x= 14;
      o3.printx();
      list[2].x= 16;
      list[2].printx();
      
      
    }
}
