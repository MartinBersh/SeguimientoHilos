package Ejemplos;

import Ejemplos.Runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();

        Runnable viaje = () -> {
                for (int i=0;i<10;i++){
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long)Math.random() * 1000 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };

        Thread v1 = new Thread(viaje,"Malvinas");
        Thread v2 = new Thread(viaje,"Manizales");
        Thread v3 = new Thread(viaje,"Pereira");
        Thread v4 = new Thread(viaje,"Bogotá");
        Thread v5 = new Thread(viaje,"Medellin");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();
        //Thread.sleep(100);

        System.out.println("continuo con el metodo main" + main.getName());

    }
}
