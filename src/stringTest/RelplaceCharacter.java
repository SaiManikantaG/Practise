package stringTest;

public class RelplaceCharacter {
    public static void main(String args[]){
        CharReplace charReplace = new CharReplace();

        String res = charReplace.replaceChar("sai manikanta nimisha ",' ');
        System.out.println(res);
    }
}
class CharReplace {
    public String replaceChar(String s, char c) {
        if (s == null || s.length() == 0) return s;

        StringBuilder sb = new StringBuilder();
        int previousIndex = -1;
        int index;
        while ((index = s.indexOf(c, previousIndex + 1)) != -1) {
            sb.append(s.substring(previousIndex + 1, index)).append("-");
            previousIndex = index;
        }
        if (previousIndex < s.length() - 1)
            sb.append(s.substring(previousIndex + 1));

        return sb.toString();
    }
}
