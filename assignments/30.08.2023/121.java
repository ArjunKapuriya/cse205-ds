mport java.util.*;
import java.lang.*;
class Solution {
    public int maxProfit(int[] a) {
        int mx=Integer.MIN_VALUE;int cp=0;
        int b=a[0],s=0;
        for(int i=0;i<a.length;i++){
            b=Math.min(b,a[i]);
            cp=a[i]-b;
            mx=Math.max(mx,cp);
        }
        return mx;
    }
}
