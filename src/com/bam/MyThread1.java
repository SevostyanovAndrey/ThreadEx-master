package com.bam;

import java.util.Random;

public class MyThread1 extends Thread{

    private final Buffer __buffer;

    public MyThread1(Buffer buffer)
    {
        __buffer = buffer;
    }


    /**
     * Главный метод потока. Запускается при вызове start
     */
    @Override
    public void run() {

        try {

            method();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     *Бесконечно генерирует рандомные числа и добавляет их в буфер.
     */
    private void method() throws InterruptedException {


        while (true) {
            int a = new Random().nextInt(10);

            int b = new Random().nextInt(10);

            if (check(a) && check(b)) {
                __buffer.add(a);
                __buffer.add(b);
            }
        }
    }
    private boolean check(int a){
        return a * a - 5 * a + 6 == 0;
    }
}
