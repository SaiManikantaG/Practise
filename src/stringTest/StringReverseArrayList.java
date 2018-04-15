package stringTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by sai on 7/15/17.
 */
public class StringReverseArrayList
{
    public static void main(String[] args)
    {
        String input = "Manikanta";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for (char c: hello)
            trial1.add(c);

        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
}