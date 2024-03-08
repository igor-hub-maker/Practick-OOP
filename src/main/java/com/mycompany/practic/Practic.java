package com.mycompany.practic;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

import com.mycompany.practic.Exceptions.ExitException;
import java.util.Random;

public class Practic {

//    public static void main(String[] args) {
//        try{
//            var worker = new CalculationWorker();
//            worker.calculateAndShowResult();
//        }
//        catch(ExitException ex){ System.out.println("Exiting, bye"); }
//        catch(Exception e){
//            
//        }
//        
//    }
    
    
     /**
     * Головний метод програми.
     * @param args аргументи командного рядка (не використовуються у цьому прикладі)
     * @throws InterruptedException виняток, який виникає, якщо потік перервано під час очікування завершення іншого потоку
     * @throws ExecutionException виняток, який виникає, коли виникає помилка в час виконання задачі
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Створення масиву з 10000 випадкових чисел
        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000);
        }

        // Створення пулу потоків фіксованого розміру (4 потока)
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Створення черги задач
        Queue<Runnable> taskQueue = new LinkedBlockingQueue<>();
        taskQueue.add(() -> System.out.println("Min value: " + findMin(array))); // Знаходження мінімального значення
        taskQueue.add(() -> System.out.println("Max value: " + findMax(array))); // Знаходження максимального значення

        // Створення списку майбутніх результатів
        List<Future<?>> futures = new ArrayList<>();

        // Виконання задач з черги в потоках
        while (!taskQueue.isEmpty()) {
            Runnable task = taskQueue.poll();
            Future<?> future = executor.submit(task);
            futures.add(future);
        }

        // Очікування завершення всіх задач
        for (Future<?> future : futures) {
            future.get();
        }

        // Завершення роботи пулу потоків
        executor.shutdown();
    }

    /**
     * Метод для пошуку мінімального значення в масиві.
     * @param array вхідний масив
     * @return мінімальне значення в масиві
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Метод для пошуку максимального значення в масиві.
     * @param array вхідний масив
     * @return максимальне значення в масиві
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
