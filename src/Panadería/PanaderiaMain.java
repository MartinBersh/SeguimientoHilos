package Panadería;

import Panadería.Runnable.Consumidor;
import Panadería.Runnable.Pandero;

public class PanaderiaMain {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        new Thread(new Pandero(panaderia)).start();
        new Thread(new Consumidor(panaderia)).start();
    }
}
