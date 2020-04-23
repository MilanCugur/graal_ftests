import java.util.Scanner;

public class Load {
    static int s = 7;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    private static int example(int a, int b, int c){
	System.console();
	System.console();
	if(a>b)
	    return -87;
	
	int tmp = a;
	tmp *= b;
	tmp -= c;
	tmp -= s;

        assert tmp >= 20 : " Underweight"; 
	
	return tmp;
	/*if(a>b){
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
       
	return tmp;*/
    }
}
