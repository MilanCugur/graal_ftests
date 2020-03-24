import java.util.Scanner;

class ftest22{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest22(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest22(int a, int b){
        //Write your function here
	System.console();
	if(a<b){
	    for(int i=0; i<a; i++)
		System.out.println(i);
	}else{
	    for(int i=100; i>=b; i--)
		System.out.println(i);
	}
	System.console();
        return;
    }

}
