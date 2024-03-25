import java.util.*;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // Solução do livro effective Java
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentarCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    @SuppressWarnings("unchecked")
    private void aumentarCapacidade() {
        if (this.tamanho >= this.elementos.length) {
            T[] elementosNovos = Arrays.copyOf(this.elementos, this.elementos.length * 2);
            this.elementos = elementosNovos;
        }
    }

    private void posicaoInvalida(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
    }

    public void remover(int posicao) {
        posicaoInvalida(posicao);
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
/* 
class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) return null;
        return this.elementos[0];
    }

    public T desenfileirar() {
        if (this.estaVazia()) return null;
        T elementoASerRemovido = this.elementos[0];
        this.remover(0);
        return elementoASerRemovido;
    }
}
 */
/* class FilaComPrioridade<T> extends Fila<T> {

    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for (i = 0; i < this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona(i, elemento);
    }
} */
/* 
class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if (this.estaVazia()) return null;
        return this.elementos[tamanho - 1];
    }

    public T desempilhar() {
        if (this.estaVazia()) return null;
        return this.elementos[--tamanho];
    }
}
 *//* 
public class Main {
    public static void main(String[] args) {
        // Criando uma fila
        Fila<Integer> fila = new Fila<>();
        
        // Enfileirando elementos
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        
        // Mostrando o elemento da frente da fila
        System.out.println("Elemento da frente da fila: " + fila.espiar());
        
        // Desenfileirando elementos
        System.out.println("Desenfileirando elementos:");
        while (!fila.estaVazia()) {
            System.out.println(fila.desenfileirar());
        }
        
        // Criando uma fila com prioridade
        FilaComPrioridade<Integer> filaPrioridade = new FilaComPrioridade<>();
        
        // Enfileirando elementos com prioridade
        filaPrioridade.enfileira(5);
        filaPrioridade.enfileira(3);
        filaPrioridade.enfileira(7);
        filaPrioridade.enfileira(1);
        
        // Mostrando a fila com prioridade
        System.out.println("Fila com prioridade:");
        while (!filaPrioridade.estaVazia()) {
            System.out.println(filaPrioridade.desenfileirar());
        }
        
        // Criando uma pilha
        Pilha<String> pilha = new Pilha<>();
        
        // Empilhando elementos
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        
        // Mostrando o topo da pilha
        System.out.println("Topo da pilha: " + pilha.topo());
        
        // Desempilhando elementos
        System.out.println("Desempilhando elementos:");
        while (!pilha.estaVazia()) {
            System.out.println(pilha.desempilhar());
        }
    }
} */