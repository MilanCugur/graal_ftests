import java.util.Scanner;

class Monitor{

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
        int i = example(sc.nextInt(), sc.nextInt(), sc.nextInt());
	System.out.println(i);
	
        return;
    }

    private static int example(int a, int b, int c) throws Exception {
        //Write your function here
	System.console();
	System.console();

	Scanner x = new Scanner(System.in);
	Scanner y = new Scanner(System.in);
	if(a>b){
	    synchronized(x){
		c += a;
		synchronized(y){
		    c *= b;
		}
	    }
	}else
	    c /= a;
	return c;
    }

}
