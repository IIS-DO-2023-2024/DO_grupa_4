package thread;

public class TestThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
//		for(var i = 0; i < 10; i++) {
//			Thread thread = new Thread(new DownloadFileTask()); // kreiramo novi thread
//			thread.start();
//			
//			try {
//				thread.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		Thread thread = new Thread(new DownloadFileTask());
		thread.start();
			
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			thread.interrupt();
			
			
			System.out.println("File is ready to be scanned.");

	}

}
