import java.util.Scanner;
import java.util.Arrays;
import java.lang.System;

class Array2 {

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
	int[] c = {23, 23, 2323, 1232};
        int i = example(sc.nextInt(), sc.nextInt(), c);
	System.out.println(i);
	
        return;
    }

    private static int example(int a, int b, int[] c) throws Exception {
        //Write your function here
	if(a>b)
	    return b;
	
	int[] tmp = {1, 2, 3, 4};
	int[] tmp2 = {1, 2, 3, 4};
	// simple == check pointers
	System.out.println(tmp.equals(tmp2));

	// ArrayEquals
	System.out.println(Arrays.equals(tmp, tmp2));

	// Invoke Arrays.compare
	System.out.println(Arrays.compare(tmp, tmp2));
    
	if(a>b)
	    return b;

	int[] src  = new int[]{1,2,3,4,5};
	int[] dest = new int[5];
	System.arraycopy( src, 0, dest, 0, src.length );

	System.console();
	dest = Arrays.copyOf(src, src.length);
	
	return a;
    }
}
