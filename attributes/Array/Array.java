import java.util.Scanner;

class Array {

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
	int[] c = {23, 23, 2323, 1232, 23};
        int i = example(sc.nextInt(), sc.nextInt(), c);
	System.out.println(i);
	
        return;
    }

    private static int example(int a, int b, int[] c) throws Exception {
        //Write your function here
	System.console();

	if(a>b){
	    int[] tmp = {1, 2, 3};
	    a += tmp[0];
	}else{
	    int[] tmp1 = new int[3];
	    tmp1[0] = 5;
	    a *= tmp1[0];
	}
	a -= c[0];
	return a;
    }
}
