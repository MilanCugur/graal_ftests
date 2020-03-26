import java.util.Scanner;

public class ftest42 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        example_ftest42(a, b, c);
    }

    private static void example_ftest42(int a, int b, int c) throws Exception {
	System.console();
	System.console();

	if(a>b+c)
	    return;

	switch(b){
	case 1:
	    System.out.println("1");
	    break;
	case 2:
	    System.out.println("2");
	    break;
	case 3:
	    System.console();
	    throw new Exception("ex1");
	case 4:
	    System.out.println("4");
	    throw new Exception("ex2");
	default:
	    System.out.println("default");
	}

	System.console();
	System.console();
    }
}
