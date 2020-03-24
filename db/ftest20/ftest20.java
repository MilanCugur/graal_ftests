import java.util.Scanner;

class ftest20{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest20(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest20(int a, int b){
        //Write your function here
	System.console();
	
	for(int i=0; i<a; i++){
	    System.out.println(i);
	    for(int j=0; j<b; j++){
		System.out.println(j);
	    }
	    System.console();
	}
	System.console();
        return;
    }

}
