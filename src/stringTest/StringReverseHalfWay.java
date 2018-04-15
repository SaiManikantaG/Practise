package stringTest;

public class StringReverseHalfWay {
    public static void main(String args[]){
        Reverse reverse = new Reverse();
       String result =  reverse.reverse_halfway("Test Me");
       System.out.println("String reverse:: "+result);
    }

}

class Reverse{
    public String reverse_halfway(String s) {
        char[] array = s.toCharArray();
        char tmp;
        for(int i=array.length/2; i >= 0; i--) {
            tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        return new String(array);
    }

}