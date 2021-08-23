/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Hasnain Gakhar
 */
public class demo 
{
    public static void main(String args[])
    {
   
        Box abc=new Box(4,5,6);
        Box abc1=new Box(abc);
    abc1.a=6;
    abc1.b=5;
    abc1.c=5;
    System.out.println(abc.mul1());
    System.out.println(abc1.mul());
    }
            
    
}
