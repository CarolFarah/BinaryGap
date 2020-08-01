// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
     public int solution(int N) {
       int maxGap = 0;
       
// remove trailing zeroes if not counted; credit to Peter Taylor
       while (N % 2 == 0) {
             N /= 2;
       }
             for ( int i = 0; N > 0; N /= 2) {
                 if (N % 2 == 0) {
                     i++;
                }
                else {
                     if ( i > maxGap) {
                          maxGap = i;
                    }
                    i = 0;
              }
               
              }
                return maxGap;
          }
}
