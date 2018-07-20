// Java code​​​​​​​‌​‌‌‌‌​‌‌‌​‌‌​​‌‌​‌‌‌‌‌‌ below
import java.util.*;
import java.io.*;
import java.nio.*;
import java.math.*;

class Solution {
     public static boolean isTwin(String a, String b) {
     char[] a1 = a.toLowerCase().replaceAll("[\\s]", "").toCharArray();
     char[] b2 = b.toLowerCase().replaceAll("[\\s]", "").toCharArray();
     Arrays.sort(a1);
     Arrays.sort(b2);
     return Arrays.equals(a1, b2);     
     }
}
