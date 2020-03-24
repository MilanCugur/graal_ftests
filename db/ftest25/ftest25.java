import java.util.Scanner;

class ftest25{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest25(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest25(int a, int b){
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		break;
	    System.console();
	}
	System.out.println("End");
        return;
    }

}
