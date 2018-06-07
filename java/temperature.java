import java.math.*;

class Solution {

 static double closestToZero(double[] ts) {
  if (ts == null || ts.length == 0) return 0;
  else {
   double min = ts[0];

   for (int i = 0; i < ts.length; i++) {
    if (Math.abs(ts[i]) < Math.abs(min)) min = ts[i];
    else if ((Math.abs(ts[i]) == Math.abs(min)) && ts[i] != min) min = Math.abs(ts[i]);
   }
   min = min < -273 ? -273 : min;
   min = min > 5526 ? 5526 : min;
   return min;
  }
 }
}
