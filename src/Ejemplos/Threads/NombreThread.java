package Ejemplos.Threads;

public class NombreThread extends Thread {

    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el medtodo run del hilo" + getName());
        for (int i = 0; i < 10; i++){
            System.out.println(this.getName());
        }

        System.out.println("Finaliza el hilo");
    }
}
