import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    private static int example(int a, int b, int c) throws Exception {
	System.console();

	// BytecodeException
	int tmp = 123;
	try{
	    tmp /= b;
	}
	catch (Exception e){
	    e.printStackTrace();
	}

	System.console();

	// ThrowBytecodeException	
	tmp /= a;

	System.console();

	// Invoke Throwable.fillInStackTrace
	if(c>tmp)
	    throw new Exception();

	System.console();

	// Invoke Throwable.fillInStackTrace
	if(b>tmp)
	    throw new NullPointerException();

	System.console();

	// Invoke Throwable.fillInStackTrace
	tmp += f(a, b);
	return tmp;
    }

    private static int f(int a, int b) throws Exception {
	if(a>b)
	    throw new Exception();
	return 8;
    }
}
