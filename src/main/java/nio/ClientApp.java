package nio;

import java.util.Optional;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/27/下午 5:38
 **/
public class ClientApp {
    public static void main(String[] args) {
        Worker worker=new Worker("xufeng");
        worker.setName("were");

        Worker worker1 = Optional.ofNullable(worker).orElse(new Worker("hehe"));
        Optional<Worker> worker3 = Optional.of(worker).filter(worker2 -> worker2.getName() != null);
        System.out.println(worker1.getName());
        System.out.println(worker3.get().getName());

    }
}
