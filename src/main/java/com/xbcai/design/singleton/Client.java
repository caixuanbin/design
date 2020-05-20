package com.xbcai.design.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.*;

public class Client {
    static ThreadPoolExecutor  threadFactory = new ThreadPoolExecutor(10, 20, 3L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(1024),
            new ThreadPoolExecutor.AbortPolicy());
    public static void test01() throws Exception{
        SingletonDemo6 s1 = SingletonDemo6.getInstance();
        SingletonDemo6 s2 = SingletonDemo6.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        Class<SingletonDemo6> clazz = (Class<SingletonDemo6>)Class.forName("com.xbcai.design.singleton.SingletonDemo6");
        Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        //因为SingletonDemo6已经加上防反射漏洞，所以这里进行初始化的时候，因为在上面已经调用SingletonDemo6.getInstance()进行实例化过了
        //通过反射进行实例化的时候就会抛出异常
        SingletonDemo6 s3 = c.newInstance();
        SingletonDemo6 s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);
    }

    public static void test02() throws Exception{
        SingletonDemo6 s1 = SingletonDemo6.getInstance();
        SingletonDemo6 s2 = SingletonDemo6.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        //系列化保存对象到磁盘文件
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        //反系列化从磁盘实例化该对象
        //因为SingletonDemo6类上面已经加了readResolve()方法，防止了反系列化漏洞，所以打印出来的对象还是同一个，不然就会从新创建了一个新的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        SingletonDemo6 s3 = (SingletonDemo6)ois.readObject();
        System.out.println(s3);

    }

    /**
     * 测试5种单例的效率
     */
    public static  void test03() throws Exception{
        CountDownLatch countDownLatch = new CountDownLatch(10);
        long begin = System.currentTimeMillis();
        for (int i=0;i<10;i++) {
            threadFactory.execute(()->{
                for (int ii = 0; ii < 1000000; ii++) {
                    //SingletonDemo1.getInstance(); //92ms
                    //SingletonDemo2.getInstance();//420ms
                    //SingletonDemo3.getInstance();//96ms
                    //SingletonDemo4.getInstance();//69ms
                    SingletonDemo5 o = SingletonDemo5.INSTANCE; //60ms
                }
                countDownLatch.countDown();
            });

        }
        countDownLatch.await();
        threadFactory.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-begin));
    }
    public static void main(String[] args) throws Exception {
        test03();

    }
}
