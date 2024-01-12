import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Server {
    private static final List<String> FILTERS = Arrays.asList("curse1", "curse2", "curse3", "insult1", "insult2",
            "insult3");
    private final ServerSocket serverSocket;
    private final Socket socket;
    private final PrintWriter printWriter;

    private Server(String address, int port) {
        try {
            this.serverSocket = new ServerSocket();
            this.serverSocket.bind(new InetSocketAddress(address, port));
            System.out.println("[SERVER]: Waiting connection...");
            this.socket = this.serverSocket.accept();
            System.out.println("[SERVER]: Connection established! " + this.socket);
            this.printWriter = new PrintWriter(new PrintStream(this.socket.getOutputStream()), true);
            this.read(new BufferedReader(new InputStreamReader(this.socket.getInputStream())));
        } catch (IOException var4) {
            throw new RuntimeException(var4);
        }
    }

    private void read(BufferedReader reader) throws IOException {
        String message;
        while ((message = reader.readLine()) != null) {
            System.out.println("[CLIENT]: " + message);

            String filter;
            StringBuilder builder;
            for (Iterator<String> var3 = FILTERS.iterator(); var3
                    .hasNext(); message = message.replaceAll(filter, builder.toString())) {
                filter = var3.next();
                builder = new StringBuilder();
                for (int i = 0; i < filter.length(); ++i) {
                    builder.append("*");
                }
            }

            this.printWriter.println(message);
        }

    }

    public static void main(String[] args) {
        new Server("127.0.0.1", 32100);
    }
}
