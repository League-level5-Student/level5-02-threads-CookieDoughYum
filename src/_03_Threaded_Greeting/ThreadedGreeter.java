package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int a;
	Thread r1;

	public ThreadedGreeter(int a) {
		this.a=a;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Hello from thread number: " + a);
		if (a < 50) {
			r1 = new Thread(new ThreadedGreeter(a+1));
				ThreadedGreeter tg = new ThreadedGreeter(a+1);
				//tg.a = a + 1
				r1.run();
				try {
					r1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
       //run();
	}

}
