public class Comensal implements Runnable {
    private String nombre;
    private Mesa mesa;

    public Comensal(String nombre, Mesa mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    public void run() {
        while (mesa.getNumeroMagdalenas() > 0) {
            try {
                mesa.consumir();
                System.out.println(this.nombre + " ha cogido una Magdalena");
                Thread.sleep(10000);
                System.out.println(this.nombre + " ha terminado de comer una Magdalena ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}