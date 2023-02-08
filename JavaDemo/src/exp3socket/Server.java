package exp3socket;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static final int PORT = 99 ;
    public static void main(String args[]) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5) ;
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open() ;
        serverSocketChannel.configureBlocking(false) ;
        serverSocketChannel.bind(new InetSocketAddress(PORT)) ;
        Selector selector = Selector.open() ;
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT) ;
        System.out.println("服务器端启动程序，该程序在"+PORT+"端口上监听，等待客户端连接…");
        int keySelect = 0;
        while((keySelect = selector.select())>0) {
            Set<SelectionKey> selectedKeys = selector.selectedKeys() ;
            Iterator<SelectionKey> selectionIter = selectedKeys.iterator() ;
            while(selectionIter.hasNext()) {
                SelectionKey selectionKey = selectionIter.next() ;
                if(selectionKey.isAcceptable()) {
                    SocketChannel clientChannel = serverSocketChannel.accept() ;
                    if(clientChannel != null) {
                        executorService.submit(new ClientChannel(clientChannel)) ;
                    }
                }
                selectionIter.remove();
            }
        }
        executorService.shutdown();
        serverSocketChannel.close();
    }
}
