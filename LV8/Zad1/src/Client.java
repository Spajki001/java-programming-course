import java.io.*;
import java.net.Socket;

public class Client extends Thread {
    private final Socket socket;
    private final PrintWriter printWriter;
    private final BufferedReader reader;
    private Client(String address, int port){
        try{
            System.out.println("[CLIENT]: Connecting...");
            this.socket = new Socket(address, port);
            this.printWriter = new PrintWriter(new PrintStream(socket.getOutputStream()), true);
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.start();
            System.out.println("[CLIENT]: Connection established!");

            final String[] messages = new String[]{
                    "Welcome!",
                    "curse3",
                    "Testing...",
                    "insult2",
                    "Goodbye!"
            };
            System.out.println("[CLIENT]: Sending messages...");
            for (String message : messages){
                printWriter.println(message);
            }
            System.out.println("[CLIENT]: Finished, exiting application!");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run(){
        try{
            String message;
            while ((message = reader.readLine()) != null){
                System.out.println("[SERVER]: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", 32100);
    }
}
