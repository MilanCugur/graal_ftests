import java.util.Scanner;

public class Simple {
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
		tmp += b;
		break;
	    case 2:
		tmp *= b;
		break;
	    default:
		tmp /= a;
		tmp /= b;
	    }
	}else{
	    int i = 0;
	    tmp = tmp & 23;
	    tmp = tmp << 2;
	}
       
	return tmp;
    }
}
