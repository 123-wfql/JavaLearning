package exp3socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class ClientChannel implements Runnable {
    private SocketChannel clientChannel;
    private boolean flag = true;

    public ClientChannel(SocketChannel cilentChannel) throws Exception {
        this.clientChannel = cilentChannel;
        System.out.println("【客户端连接成功】，该客户端的地址为：" + cilentChannel.getRemoteAddress());
    }

    public void run() {
        ByteBuffer buffer = ByteBuffer.allocate(50);
        try {
            while (this.flag) {
                buffer.clear();
                int readCount = this.clientChannel.read(buffer);
                String readMessage = new String(buffer.array(), 0, readCount).trim();
                System.out.println(readMessage);
                String writeMessage = "\n"+"【成功发送】" + readMessage + "\n";
                String []str = readMessage.split(" ") ;
                String []str0 = str[2].split(":") ;
                if ("Exit".equals(str[1])) {
                    writeMessage = "To "+str0[0]+":BYE";
                    this.flag = false;
                }
                buffer.clear();
                buffer.put(writeMessage.getBytes());
                buffer.flip();
                this.clientChannel.write(buffer);
            }
            this.clientChannel.close();
        } catch (Exception e) {
        }
    }
}
