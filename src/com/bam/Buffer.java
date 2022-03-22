package com.bam;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * Класс отвечающий за буфер. В основе лежит структура данных очередь.
 */
public class Buffer {


    /**
     * Очередь хранящая целые числа Integer. Менять в зависимости от задания
     */
    private Queue<Integer> __buffer = new ArrayDeque<>();


    /**
     * Метод для добавления элемента в очередь
     * @param a
     */
    public synchronized void add(Integer a)
    {
        __buffer.add(a);
    }

    /**
     * Метод для получения первого элемента очереди с удалением.
     * @return
     */
    public Integer get()
    {
        return __buffer.poll();
    }

}
