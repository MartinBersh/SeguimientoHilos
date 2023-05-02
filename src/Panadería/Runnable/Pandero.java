package Panadería.Runnable;

import Panadería.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Pandero implements Runnable{
    private Panaderia panaderia;

    public Pandero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            panaderia.hornear("Pan #:"+ i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {

            }

        }

    }
}
