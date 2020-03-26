import java.util.Scanner;

class ftest39{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
	example_ftest39(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest39(int a, int b){
	if(a*a<b*9)
	    return;
	
	switch(a){  
	case 1:
	    System.out.println(); 
	case 2: 
	    System.console();
	case 3:
	    System.out.print("cse3");
	default:
	    System.out.println("def");
	}
	if(a>b)
	    System.console();
	else
	    System.out.println("tail");
    }
   
}
