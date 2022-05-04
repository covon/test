package com;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.util.function.Predicate;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/15/下午 8:30
 **/
public class App {
    public static void main(String[] args) throws IOException {
//       LambdaTest lambdaTest=x ->x+"hehe";
//        String ss=lambdaTest.getString2("baby");
//       Boolean ss= getResult("",x->x.length()>=0,x->x.length()<=0);
//        System.out.println(ss);
//        LocalDateTime ldt = LocalDateTime.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String s = dtf.format(ldt);
//        System.out.println(s);
//
//        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        String format = dateFormat.format(Date.from(Instant.now()));
//        System.out.println(format);
//        List <String> list=new ArrayList<String>();
//        list.add("sdfsd1");
//        list.add("sdfsd2");
//        list.add("sdfsd3");
//        list.add("sdfsd4");
//        list.add("sdfsd5");
//        list.add("sdfsd6");

//        File file=new File("c:\\111.txt");
//        Files.walk(Paths.get("c:\\")).forEach(x -> x.isAbsolute());
//
//        list.stream().forEach(System.out::println);

//        String sss = Optional.ofNullable(list.get(0)).flatMap((x) -> Optional.of(x)).orElse("sss");
//
//        System.out.println(sss);


//        String ss2= getResult(new LambdaTestImpl(),"dasdfs");
//        System.out.println(ss2);
        FileChannel inchannel =null;
        FileChannel outchannel =null;
    try {

        inchannel = new FileInputStream(new File("c:\\111.txt")).getChannel();
        outchannel = new FileOutputStream(new File("c:\\222.txt")).getChannel();

        long size = inchannel.size();

        for (long remain = size; remain > 0; ) {
            long redesize = inchannel.transferTo(size - remain, remain, outchannel);
            remain -= redesize;
        }
    }catch (Exception e){
        e.printStackTrace();
    }finally {
        inchannel.close();
        outchannel.close();
    }




    }

    public static Boolean getResult(String str,Predicate<String> predicate1, Predicate<String > predicate2){
        return predicate1.and(predicate2).test(str);
    }
}
