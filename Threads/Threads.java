// class A implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {

//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {

//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Threads {

    public static void main(String[] args) {
        // Runnable objA = new A();
        Runnable objA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable objB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();
    };
};

// By default, the code runs on a single thread but can run on multiple by the
// use of 'extends Threads' after the class name, by changing the name of the
// methods to run() and to call the method via .start()