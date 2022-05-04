package nio;



import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/27/下午 5:38
 **/
@Slf4j
public class ServerApp {
    public static void main(String[] args) throws IOException {
        Selector bosssector = Selector.open();
        //创建channel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //server设置
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(bosssector,SelectionKey.OP_ACCEPT);
        serverSocketChannel.bind(new InetSocketAddress(8080));
        log.debug("服务端启动成功。。。");





    }
}
