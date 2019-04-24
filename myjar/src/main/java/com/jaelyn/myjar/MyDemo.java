package com.jaelyn.myjar;

/**
 * @author jingling.zhang@ucarinc.com
 * @description TODO
 * @date 2019/4/10 17:59
 **/
public class MyDemo {
    public MyDemo() {

    }

    public void test() {
        System.out.println("-----------------------");
        System.out.println("myjar v6 classloader=" + this.getClass().getClassLoader());
        System.out.println("我这边是版本为v6的myjar包");
        System.out.println("-----------------------");
        System.out.println("啦啦啦---v6");
    }

}
