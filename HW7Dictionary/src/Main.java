import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
    	
    	int[] a = {1, 2, 3};
    	int[] b = {4, 5, 6};
    	int[] c = {9, 10};
    	
    	
    	
    	a = b;
    	c = b;
    	a[0] = 100;
    	System.out.println(Arrays.toString(a) + "\n" + Arrays.toString(b) + "\n" + Arrays.toString(c));
    	
    	
    }
}
