package javaBasic;

public class StringDemo {
	public static void main(String args[]){
		char [] string_value = {'s','a','i'};
		StringBuilder st = new StringBuilder();
		String result2 = "nimi";
		String onet = "sai ";
		String result_string = new String(string_value);
		System.out.println("String is \n"+result_string);
		System.out.println("length is:"+result_string.length());
		System.out.printf("String is %s", result_string);
		String rt= onet.concat(result2);
		System.out.printf("value is:%s",rt);
		System.out.println("Hascode for sai is:"+onet.hashCode());
		System.out.println("Index is:"+onet.indexOf('a'));
		System.out.println("UpperCase:"+rt.toUpperCase());
		System.out.println("Comparig onet and result2:"+onet.compareTo(result2));
       // System.out.println("String reverse:"+st.reverse(onet).toString());
	}

}
