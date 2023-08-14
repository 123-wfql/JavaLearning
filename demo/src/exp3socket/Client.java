package exp3socket;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.util.Date;

public class Client {
    public static final String HOST = "localhost";
    public static final int PORT = 99 ;
    public static void main(String args[]) throws Exception {
        SocketChannel clientChannel = SocketChannel.open() ;
        clientChannel.connect(new InetSocketAddress(HOST,PORT));
        ByteBuffer buffer = ByteBuffer.allocate(50) ;
        boolean flag = true ;
        while(flag) {
            buffer.clear() ;
            String msg = Input.getString("请输入要发送的信息：");
            buffer.put(msg.getBytes()) ;
            buffer.flip();
            clientChannel.write(buffer);
            buffer.clear();
            int readCount = clientChannel.read(buffer) ;
            buffer.flip() ;
            System.err.println(new String(buffer.array(),0,readCount));
            String []str = msg.split(" ") ;
            String []str0 = str[2].split(":") ;
            String []str1 = msg.split(":") ;
            if("Exit".equals(str0[1])){
                flag = false ;
            }else if("what time is it".equals(str1[1])){
                Date date = new Date();
                System.out.println("To "+str0[0]+":"+date);
            }
        }
        clientChannel.close();
    }
}