package nio;

import lombok.SneakyThrows;

import java.nio.channels.Channel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.rmi.registry.Registry;
import java.util.Iterator;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/27/下午 5:38
 **/
public class Worker implements Runnable{

    private Thread thread;
    private Selector selector;
    private volatile Boolean start=false;
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @SneakyThrows
    public  void registry(SocketChannel socketChannel){
        if(!start){
            selector=Selector.open();//开启selector
            thread=new Thread(this,name);//创建线程
            thread.start();
            start=true;
        }
        selector.wakeup();
        socketChannel.register(selector,SelectionKey.OP_READ);

    }
    @Override
    public void run() {
//            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
//            while (iterator.hasNext()){
//                SelectionKey nextkey = iterator.next();
//                iterator.remove();
//
//
//
//            }
    }


    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public Boolean getStart() {
        return start;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
