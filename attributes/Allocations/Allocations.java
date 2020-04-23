import java.util.Scanner;

class Tmp{
    private int a;
    private int b;

    public Tmp(){
	this.a = 0;
	this.b = 0;
    }
    
    public Tmp(int a, int b){
	this.a = a;
	this.b = b;
    }

    public int getA(){ return this.a; }
    
    @Override
    public String toString(){
	return "("+this.a+", "+this.b+")";
    }
}

public class Allocations {
    public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    private static int example(int a, int b, int c)  throws Exception {
	System.out.println("Start..");
	int tmp = 11;
	if(a>b){
	    Scanner sc = new Scanner(System.in);
	    tmp += sc.nextInt();
	}else{
	    Tmp x = new Tmp();
	    Tmp y = new Tmp();
	    tmp += x.getA();
	}
	if(b>c)
	    throw new Exception();
	return tmp;
    }
}
