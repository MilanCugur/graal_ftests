
class ftest32{

    public static void main(String args[]){
        // Method call
	int[] list ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int sum = example_ftest32(list);
	System.out.println("Sum of elements in list: " + sum);

        return;
    }

    private static int example_ftest32(int [] list){
        //Write your function here
	int total = 0;
	for(int val : list) {
	    total += val;
	}
	return total;
    }

}
