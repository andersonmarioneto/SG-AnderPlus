
public class Fila {
    private int tamanhoMaximo;
    private int[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;

    public Fila(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == tamanhoMaximo;   
        
    }

    public int tamanho() {
        return tamanho;
    }

    public void enfileirar(int elemento) {
        if (!estaCheia()) {
            fim = (fim + 1) % tamanhoMaximo;
            elementos[fim] = elemento;
            tamanho++;
        } else {
            System.out.println("A fila está cheia. Não é possível enfileirar mais elementos.");
        }
    }
}

    public int desenfileirar() {
        if (!estaVazia()) {
            int elementoRemovido = elementos[inicio];
            inicio = (inicio + 1) % tamanhoMaximo;
            tamanho--;
            return elementoRemovido;
        } else {
            System.out.println("A fila está vazia. Não é possível desenfileirar elementos.");
            return -1; // Retorna um valor padrão indicando que a fila está vazia
        }
    }

    public int primeiro() {
        if (!estaVazia()) {
            return elementos[inicio];
        } else {
            System.out.println("A fila está vazia. Não há primeiro elemento.");
            return -1; // Retorna um valor padrão indicando que a fila está vazia
        }
    }

    public int ultimo() {
        if (!estaVazia()) {
            return elementos[fim];
        } else {
            System.out.println("A fila está vazia. Não há último elemento.");
            return -1; // Retorna um valor padrão indicando que a fila está vazia
        }
    }
}