import java.util.List;

public class Media extends Thread {
    
    private int identificador;
    private int inicio;
    private int fin;
    private List<Integer> notas;

    private int sumaTotal;

    private int totalNotasSumadas = 0;

    public Media(int numeroHilo, int indiceInicial, int indiceFinal, List<Integer> notas) {
        this.identificador = numeroHilo;
        this.inicio = indiceInicial;
        this.fin = indiceFinal;
        this.notas = notas;
    }

    public int getSumaTotal() {
        return sumaTotal;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getInicio() {
        return inicio;
    }

    public int getTotalNotasSumadas() {
        return totalNotasSumadas + 1;
    }

    @Override
    public void run() {
        for (int i = inicio; i < fin; i++) {
            sumaTotal += notas.get(i);
            totalNotasSumadas += 1;
        }


        System.out.println("El hilo " + getIdentificador() + " que empezó en el índice " + getInicio() +
                " y ha contado " + getTotalNotasSumadas() + ", ha sumado un total de: " + getSumaTotal());
    }
}
