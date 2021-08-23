//Pass Objects to Constructor
package constructor;

/**
 *
 * @author Hasnain Gakhar
 */
public class Box 
{
double a,b,c;
Box(Box ob)
{
a=ob.a;
b=ob.b;
c=ob.c;
}
Box (double A,double B,double C)
{
    a=A;
    b=B;
    c=C;
}
double mul()
{
return(a*b*c);
}
double mul1()
{
return(a+b+c);
}
}

