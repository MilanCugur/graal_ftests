import java.util.Scanner;

class ftest19{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest19(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest19(int a, int b){
        //Write your function here
	System.out.println("begin");
	System.console();
	
        // simple loop
        int i = 0;
        while (i < a) {
            System.console();
	    if(a>b)
		System.out.println("a>b");
	    else
		System.out.println("!(a>b)");
	    System.console();
            i += 1;
        }

	System.out.println("end");
	System.console();
        return;
    }

}
