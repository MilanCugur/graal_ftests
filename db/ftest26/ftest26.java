import java.util.Scanner;

class ftest26{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest26(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest26(int a, int b){
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		continue;
	    System.console();
	}
	System.out.println("End");
        return;
    }

}
