import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Mesa mesa = new Mesa();

        Comensal comensal1 = new Comensal("Alberto", mesa);
        Comensal comensal2 = new Comensal("Joel", mesa);
        Comensal comensal3 = new Comensal("Adrian", mesa);

        Thread h1 = new Thread(comensal1);
        Thread h2 = new Thread(comensal2);
        Thread h3 = new Thread(comensal3);

        h1.setPriority(10);
        h2.setPriority(5);
        h3.setPriority(1);

        h1.start();
        h2.start();
        h3.start();

        final int NOTAS_TOTAL = 100000;

        List<Integer> notas = new ArrayList<>();

        for (int i = 0; i < NOTAS_TOTAL; i++) {
            int randomCalification = (int) (Math.random() * 10);
            notas.add(randomCalification);
        }

        Media hilo1 = new Media(1, 0, 9999, notas);
        Media hilo2 = new Media(2, 10000, 19999, notas);
        Media hilo3 = new Media(3, 20000, 29999, notas);
        Media hilo4 = new Media(4, 30000, 39999, notas);
        Media hilo5 = new Media(5, 40000, 49999, notas);
        Media hilo6 = new Media(6, 50000, 59999, notas);
        Media hilo7 = new Media(7, 60000, 69999, notas);
        Media hilo8 = new Media(8, 70000, 79999, notas);
        Media hilo9 = new Media(9, 80000, 89999, notas);
        Media hilo10 = new Media(10, 90000, 99999, notas);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();
        hilo6.join();
        hilo7.join();
        hilo8.join();
        hilo9.join();
        hilo10.join();


        System.out.println("Todos los hilos han acabado su tarea");


        float totalDeNotas = 0;

        totalDeNotas += hilo1.getSumaTotal();
        totalDeNotas += hilo2.getSumaTotal();
        totalDeNotas += hilo3.getSumaTotal();
        totalDeNotas += hilo4.getSumaTotal();
        totalDeNotas += hilo5.getSumaTotal();
        totalDeNotas += hilo6.getSumaTotal();
        totalDeNotas += hilo7.getSumaTotal();
        totalDeNotas += hilo8.getSumaTotal();
        totalDeNotas += hilo9.getSumaTotal();
        totalDeNotas += hilo10.getSumaTotal();

        float media = totalDeNotas / 100000;

        double mediaRedondeada = Math.round(media * 100.0) / 100.0;

        System.out.println("La media aritmética es de " + mediaRedondeada);
    }

}
