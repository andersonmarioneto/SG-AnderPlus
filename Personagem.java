import java.util.Random; // biblioteca java util - estamos a usar o Random 

public class Personagem {
    String nome;
    int nivel;
    int forca;


    // metodo sem retorno
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de forca \n", nome, nivel, forca);
    }

    // metodo que retorna um inteiro 
    int calcularDano() { 
        // criamos o objeto gerador da class Random que gera números aleatorios 
        Random gerador = new Random(); 
        int aleatorio = 1 + gerador.nextInt(19); // o numero aleatorio gerado está no intervalo de 1 a 20
        int dano = forca + aleatorio; // o dano será o numero da forca mais o numero aleatorio 
        return dano;
    }

    // metodo sem retorno, usando parametro Alvo
    void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano(); // aqui estou a chamar o metodo dentro de outro metodo
        // o length() quer dizer tamanho
        if (habilidade.length() == 0) {
            System.out.format("Personagem: %s atacou o %s e causou %d de dano \n", nome, alvo, danoCausado);
        } else {
            System.out.format("Personagem: %s usou '%s' e atacou o %s cansando %d de dano \n", nome, habilidade, alvo, danoCausado);
        }
        // fora da condicao if
    }
}
