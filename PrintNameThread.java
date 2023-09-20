public class PrintNameThread extends Thread {
    PrintNameThread(String name) {
            super(name);
            // menjalankan thread dengan satu kali instantiate
        start(); }
        public void run() {
            String name = getName();
            for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }
}