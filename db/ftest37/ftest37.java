
class ftest37{

    public static void main(String args[]) throws Exception {
        // Method call
        example_ftest37();

        return;
    }

    private static void example_ftest37() throws Exception {
        //Write your function here
	Runnable sharedRunnableInstance = new Runnable(){
		public void run() {
		    // stuff here
		}
	    };

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate

	System.console();
	System.console();
        return;
    }

}
