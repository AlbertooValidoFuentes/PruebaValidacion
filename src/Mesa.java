public class Mesa extends Thread {
     private int numeroMagdalenas = 15;

    synchronized public void consumir() {
        numeroMagdalenas--;
        System.out.println(numeroMagdalenas);
    }

    public int getNumeroMagdalenas() {
        return numeroMagdalenas;
    }

    
}
