public class Main {
    public static final int WORK_TIME = 15000;
    public static void main(String[] args) {
        // группа потоков
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        // создаем потоки
        final Thread thread1 = new Thread(mainGroup, new MsgThread(), "Messanger1");
        final Thread thread2 = new Thread(mainGroup, new MsgThread(), "Messanger2");
        final Thread thread3 = new Thread(mainGroup, new MsgThread(), "Messanger3");
        // запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();
        // остановка потоков
        try {
            Thread.sleep(WORK_TIME);
            mainGroup.interrupt();
        } catch (InterruptedException exp) {
            mainGroup.interrupt();
        }
    }
}
