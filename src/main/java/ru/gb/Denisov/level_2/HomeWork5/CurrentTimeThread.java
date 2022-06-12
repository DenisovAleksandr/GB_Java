package ru.gb.Denisov.level_2.HomeWork5;

public class CurrentTimeThread {
    final int SIZE = 10_000_000;
    final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public CurrentTimeThread(float[] arr) {
        this.arr = arr;
    }

    void oneThread() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - start) + " ms");
    }

    void twoThread() {
        long start = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        Thread thread1=new Thread(()->{
            for (int i = 0; i < HALF; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2=new Thread(()->{
            for (int i = 0; i < HALF; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.out.println("One thread time: " + (System.currentTimeMillis() - start) + " ms");
    }
}

