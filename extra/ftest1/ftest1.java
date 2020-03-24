import java.util.Scanner;

public class ftest1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
	example_ftest1(a, b);
    }
    
    private static void example_ftest1(int a, int b) {
	System.out.println("a?b");
	if(a>b)
	    System.out.println("a>b");
	else
	    System.out.println("a=<b");
	System.console();

	System.out.println("a?b");
	if(a>b)
	    System.out.println("a>b");
	else
	    System.out.println("a=<b");
	System.console();

	switch(a){
	case 1:
	    System.console();
	    break;
	case 2:
	    System.console();
	    break;
	case 3:
	    System.console();
	    break;}
    }
}
