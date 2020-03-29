class ftest66{

    public static void main(String args[]){
        // Method call
        int k = example_ftest66(-3);
	System.out.println(k);
	
        return;
    }

    private static int example_ftest66(int a){
        //Write your function here
	System.out.println("start:");
	int i = a;
	if(a>0)
	    i++;
	else
	    i--;
	System.out.println("end:");
        return i;
    }

}
