import java.util.Scanner;

public class ftest2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
	int c = sc.nextInt();
	example_ftest2(a, b, c);
    }
    
    private static void example_ftest2(int a, int b, int c) {
	System.out.println("a?b");
	if(a>b && b>c)
	    System.out.println("a>b>c");
	else if(a>c && c>b)
	    System.out.println("a>c>b");
	else if(b>a && a>c)
	    System.out.println("b>a>c");
	else if(b>c && c>a)
	    System.out.println("b>c>a");
	else if(c>a && a>b)
		    System.out.println("c>a>b");
	else if(c>b && b>a)
	    System.out.println("c>b>a");
	else
	    System.out.println("We have == variables.");
    }
}
