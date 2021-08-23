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
public class Constt 
{
int a,b,c;
int add() //In this method is used when we get value from main class object parameters (---)
{
    return(a+b+c); //in this condition it is written on the top of a constructor
}
 /*Constt() //constructor name is same like class 
{        // Constructor have no return value
a=5; //Values pass in constructor block
b=6;
c=6;
}*/
Constt(int A,int B,int C) //Parameterized Constructors
{
a=A;
b=B;
c=C;
}
/*int add() // we use this method only when we pass value in constructor block
{
    return(a+b+c); //!!!It is written as below of constructor
}*/
}


