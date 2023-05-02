package Panadería;

import java.security.PrivateKey;

public class Panaderia {
    private String pan;
    private boolean dispoible;

    public synchronized void hornear(String masa){
        while (dispoible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.dispoible = true;
        notify();
    }

    public synchronized String consumir(){
        while (!dispoible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Cliente consume: " + this.pan);
        this.dispoible = false;
        notify();
        return pan;
    }

}
