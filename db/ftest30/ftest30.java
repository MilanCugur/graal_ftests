import java.util.Scanner;

class ftest30{

    public static void main(String args[]) throws Exception{
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest30(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest30(int a, int b, int c) throws Exception{
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>c)
		throw new Exception();
	    System.console();
	}
	System.out.println("End");
    }

}
