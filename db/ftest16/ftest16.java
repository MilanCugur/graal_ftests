import java.util.Scanner;

class ftest16{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest16(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest16(int a, int b, int c){
        //Write your function here
	if(a>b)
	    System.console();
	
	System.out.println("dummy");
	System.out.println("dummy");
	
       	if(a>b){
	    System.out.println("path to Control Split block");
	    System.console();
	    if(b>c)
		System.out.println("b>c");
	    else
		System.out.println("b<=c");
	}else{
	    System.out.println("dsfsdf");
	    if(a>c)
		System.out.println("a>c");
	    else
		System.out.println("a<=c");
	    System.out.println("breaking println");
	    if(a+b<c)
		System.out.println("a+b<c");
	    else
		System.out.println("??");
	}		
 	System.console();
	System.console();
	
        return;
    }

}
