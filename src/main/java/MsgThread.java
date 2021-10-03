public class MsgThread implements Runnable{
    public static final int THREAD_TIMEOUT = 2000;
    @Override
    public void run() {
        // имя потока
        String name = Thread.currentThread().getName();
        // работа потока
        while(true) {
            // проверка на остановку
            if(Thread.currentThread().isInterrupted()) return;
            // вывод сообщений
            try {
                Thread.sleep(THREAD_TIMEOUT);
                System.out.println("Tread " + name + ": hello!");
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted when sleeping!");
                return;
            }
        }
    }
}
