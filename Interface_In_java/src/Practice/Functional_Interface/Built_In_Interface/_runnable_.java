package Practice.Functional_Interface.Built_In_Interface;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//class _runnable_ {
//    public static void main(String[] args) {
//        Runnable r = () -> System.out.println("run is running");
//        r.run();
//    }
//}
//
//
//class PrintExample {
//    public static void main(String[] args) {
//        Runnable printTask = () -> System.out.println("Printing from a separate thread...");
//        Thread thread = new Thread(printTask);
//        thread.start();
//    }
//}


// defined by me
class thread{
    static int counter = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Runnable r = () ->{
            try{
                int inp = Integer.parseInt(input);
                counter += inp;
                if(counter > 3 ){
                    System.out.println("counter is greater than 3");
                }else {
                    System.out.println("counter is less than 3");
                }
                System.out.println("Sending network request...");
                Thread.sleep(2000); // Simulating network delay
                System.out.println("Network request completed!");

            }catch (Exception e){
                System.out.println(e);
            }


        };
        new Thread(r).start();

    }
}


//          USE CASE OF RUNNABLE INTERFACE

class FileWriteExample {
    public static void main(String[] args) {
        Runnable fileTask = () -> {
            try (FileWriter writer = new FileWriter("output.txt", true)) {
                writer.write("Writing to file from a Runnable thread.\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(fileTask);
        thread.start();
    }
}


class DatabaseUpdateExample {
    // Simulating a database with a static variable
    static int databaseRecord = 0;

    public static void main(String[] args) {
        Runnable updateDatabase = () -> {
            databaseRecord = 42; // Updating the "database"
            System.out.println("Database record updated to: " + databaseRecord);
        };

        Thread thread = new Thread(updateDatabase);
        thread.start();
    }
}

class NetworkRequestExample {
    public static void main(String[] args) {
        Runnable networkTask = () -> {
            try {
                System.out.println("Sending network request...");
                Thread.sleep(2000); // Simulating network delay
                System.out.println("Network request completed!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(networkTask);
        thread.start();
    }
}

class SharedObjectExample {
    static class Counter {
        int count = 0;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable incrementTask = () -> {
            counter.count++;
            System.out.println("Counter incremented to: " + counter.count);
        };

        Thread thread = new Thread(incrementTask);
        thread.start();
    }
}

class MessageSendExample {
    public static void main(String[] args) {
        Runnable messageTask = () -> {
            System.out.println("Sending message to another system...");
            // Imagine here we send a message to a server
            System.out.println("Message sent successfully!");
        };

        Thread thread = new Thread(messageTask);
        thread.start();
    }
}




