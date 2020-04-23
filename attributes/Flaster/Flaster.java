import java.util.Scanner;

public class Flaster{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    private static int example(int a, int b, int c){
	System.out.println("Start..");
	int tmp = 11;
	if(a>b){
	    switch(c){
	    case 1:
		System.console();
	    case 2:
		System.out.print("sdsd");
	    case 3:
		System.out.println();
		break;
	    case 4:
		tmp += c;
		return a+b;
	    case 5:
		tmp *= b;
		break;
	    default:
		if(c>b)
		    tmp = 9;
		else
		    tmp = 7;
	    }
	}else{
	    tmp -= a;
	}
	return tmp;
    }
}
