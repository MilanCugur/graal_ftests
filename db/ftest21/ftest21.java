import java.util.Scanner;

class ftest21{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest21(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest21(int a, int b, int c){
        //Write your function here
	System.console();
	for(int i=0; i<a; i++)
	    for(int j=0; j<b; j++)
		for(int k=0; k<c; k++){
		    System.out.println(i);
		    System.out.println(j);
		    System.out.println(k);
		}
	System.console();
	
        return;
    }

}
