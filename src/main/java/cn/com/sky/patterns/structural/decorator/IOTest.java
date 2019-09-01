package cn.com.sky.patterns.structural.decorator;


import org.junit.Test;

import java.io.*;

/**
 * <pre>
 * 　装饰模式在Java语言中的最著名的应用莫过于Java I/O标准库的设计了。
 *
 * 由于Java I/O库需要很多性能的各种组合，如果这些性能都是用继承的方法实现的，那么每一种组合都需要一个类，这样就会造成大量性能重复的类出现。
 *
 * 而如果采用装饰模式，那么类的数目就会大大减少，性能的重复也可以减至最少。因此装饰模式是Java I/O库的基本模式。
 */


public class IOTest {

    @Test
    public void test1() {
        try {
            InputStream is = new FileInputStream("a.txt");
            new DataInputStream(is);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        // 流式读取文件
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("a.txt")
                    )
            );
            //读取文件内容
            byte[] bs = new byte[dis.available()];
            dis.read(bs);
            String content = new String(bs);
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
