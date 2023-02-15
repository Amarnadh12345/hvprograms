class WorkerThread implements Runnable {
    private int num;
    public WorkerThread(int num){
       this.num=num;
    }
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(num+"*"+i+"="+num*i);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
   public class multithreads {
public static void main(final String[] args) {
    System.out.println("Thread main started");
    final Thread thread1 = new Thread(new WorkerThread(2));
    thread1.setName("WorkerThread 1");
    final Thread thread2 = new Thread(new WorkerThread(3));
    thread1.setName("WorkerThread 2");
    final Thread thread3 = new Thread(new WorkerThread(4));
    thread3.setName("WorkerThread 3");
    final Thread thread4 = new Thread(new WorkerThread(5));
    thread4.setName("WorkerThread 4");
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    System.out.println("Thread main ended");
}
}



