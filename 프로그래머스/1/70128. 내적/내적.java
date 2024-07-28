import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] a, int[] b) {
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        
        int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i] * b[i];
		}
		return result;

    }
}