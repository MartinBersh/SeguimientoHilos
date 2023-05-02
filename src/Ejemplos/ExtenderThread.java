package Ejemplos;

import Ejemplos.Threads.NombreThread;

public class ExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("John Doe");

        hilo.start();
        //Thread.sleep(10);

        Thread hilo2 = new NombreThread("Martin");
        hilo2.start();

        Thread hilo3 = new NombreThread("Pedro");
        hilo3.start();

        System.out.println(hilo.getState());
    }
}
