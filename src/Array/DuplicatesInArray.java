package Array;

/**
 * Created by sai on 7/12/17.
 */

import java.util.HashSet;
import java.util.Set;

    public class DuplicatesInArray {
        public static String checkDuplicates(String[] input) {
            int cnt = 0;
            Set<String> tempSet = new HashSet<String>();


            for (String str : input) {
                if (!tempSet.add(str))
                     cnt++;
                    return "true:: Duplicate String is: " + str + "cnt:"+cnt;
            }

            return "false:: No Duplicate found";
        }

        public static void main(String[] args) {
            String[] duplicates = new String[] {"one","two","three","nine","one"};
            System.out.println(checkDuplicates(duplicates));
        }
    }
