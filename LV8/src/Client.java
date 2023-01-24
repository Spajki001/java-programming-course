import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Thread {
    private final Socket socket;
    private final PrintWriter printWriter;
    private final BufferedReader reader;

    private Client(String address, int port) {
        try {
            System.out.println("[CLIENT]: Connecting...");
            this.socket = new Socket(address, port);
            this.printWriter = new PrintWriter(new PrintStream(this.socket.getOutputStream()), true);
            this.reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.start();
            System.out.println("[CLIENT]: Connection established!");
            String[] messages = new String[]{"Welcome!", "curse3", "Testing...", "insult2", "Goodbye!"};
            System.out.println("[CLIENT]: Sending messages...");
            String[] var4 = messages;
            int var5 = messages.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                String message = var4[var6];
                this.printWriter.println(message);
            }

            System.out.println("[CLIENT]: Finished, exiting application!");
        } catch (IOException var8) {
            throw new RuntimeException(var8);
        }
    }

    public void run() {
        while(true) {
            try {
                String message;
                if ((message = this.reader.readLine()) != null) {
                    System.out.println("[SERVER]: " + message);
                    continue;
                }
            } catch (IOException var2) {
                var2.printStackTrace();
            }

            return;
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", 32100);
    }
}