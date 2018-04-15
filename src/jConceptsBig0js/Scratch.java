/*
//This function runs in O(1)O(1) time
// (or "constant time") relative to its input.
// The input array could be 1 item or
// 1,000 items,
public static void printFirstItem(int[]
        arrayOfItems) {
        System.out.println(arrayOfItems[0]);
        }

//This function runs in O(n)O(n) time
// (or "linear time"),
// where nn is the number of items in the array.
// If the array has 10 items,
// we have to print 10 times.
public static void
        printAllItems(int[] arrayOfItems) {
        for (int item : arrayOfItems) {
        System.out.println(item);
        }
        }

//String buffer performance test
public class ConcatTest{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        System.out.println
                ("Time taken by StringBuffer: " +
        "" +(System.currentTimeMillis() -
                        startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder
                ("Java");
        for (int i=0; i<10000; i++){
            sb2.append("Tpoint");
        }
 System.out.println("Time taken by StringBuilder: " +
                "" + (System.currentTimeMillis() -
         startTime) + "ms");
    }
}
 //   Time taken by StringBuffer: 16ms
   //     Time taken by StringBuilder: 0ms

//Logarithm time

while(low <= high)
        {
        mid = (low + high) / 2;
        if (target < list[mid])
        high = mid - 1;
        else if (target > list[mid])
        low = mid + 1;
        else break;
        }


*/
/*
Insertion/Selection/Bubble Sorts: Θ(n2).
Merge/Heap Sorts: Θ(nlogn).
Quicksort: Θ(nlogn) average case but (very rarely) Θ(n2) worst case.
But quicksort is usually faster in practice.
Big Oh denotes "fewer than or the same as" <expression> iterations.
Big Omega denotes "more than or the same as" <expression> iterations.
Big Theta denotes "the same as" <expression> iterations.
Little Oh denotes "fewer than" <expression> iterations.
Little Omega denotes "more than" <expression> iterations.*//*


*/
/*the worst-case runtime complexity of the
algorithm is the function defined by the
maximum number of steps taken on any
instance of size a.
 *//*


*/
/*the best-case runtime complexity of the algorithm
is the function defined by the minimum number of
 steps taken on any instance of size a.*//*


*/
/*the average case runtime complexity of the
algorithm is the function defined by an average
 number of steps taken on any instance of size a.
  *//*

*/
/*the amortized runtime complexity of the
algorithm is the function defined by a sequence
 of operations applied to the input of size a
 and averaged over time.
 */

