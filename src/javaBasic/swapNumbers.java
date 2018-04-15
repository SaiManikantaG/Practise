package javaBasic;
import java.util.*;

public class swapNumbers {
	public static void main(String args[])
	{
	float a, b;
	@SuppressWarnings("resource")
	Scanner st = new Scanner (System.in);
	System.out.print("Enter first value");
	 a = st.nextFloat();
	 System.out.println("Enter Second value");
	 b= st.nextFloat();
	 @SuppressWarnings("unused")
	float swappdVals = swapValues( a,  b);
	}
	
	public static float swapValues(float a, float b)
	{
		System.out.printf("Before swapping, First number is:"+a+" Second number is:%f  \n", b);
		float c;
		c = a;
		a = b;
		b = c;
System.out.print("After swapping, First number is:"+a+" Second number is:"+b);
return c;
	}
	

}
