package javaBasic;

public class loopTest {
	public static void main(String args[])
	{
		int [] numbers = { 1,2,3,4};
		
		for (int x : numbers) {
			System.out.print( x );
			System.out.print(",");
		}
		System.out.println("\n");
		String [] names = { "sai" , "Siri" , "nimi", "radha"};
		for (String name : names){
			System.out.print(name);
			System.out.print(",");
		}
	}
	

}
