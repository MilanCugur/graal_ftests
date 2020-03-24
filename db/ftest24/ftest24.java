import java.util.Scanner;

class ftest24{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest24(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest24(int a, int b){
        //Write your function here
	if(a<b)
	    return;
	System.out.println("Begin");
	int i = 0;
	do{
	    System.out.println(i);
	    i += 1;
	}while(i<a);
	System.out.println("End");
        return;
    }

}
