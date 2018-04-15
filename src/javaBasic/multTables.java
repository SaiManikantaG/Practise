package javaBasic;

public class multTables {
	public static void main(String args[])
	{
		int result = multTables(2);
		
	}
	public static int multTables ( int max )
	{
	    for ( int i = 1; i <= max; i++ ) {
	        for ( int j = 1; j <= max; j++ ) {
	            System.out.print ( String.format ( "%4d", j * i ));
	        }
	        System.out.println();
	    }
		return max;
	}
}


