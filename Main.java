public class Main {
    // O nome da class Main tem de ser o nome do arquivo .java
    public static void main(String[] args){
        System.out.println("****************************************\n");

        // ojacto = instância da class
        Celular telemovel = new Celular();
        Celular telemovelB = new Celular();

        // atribuindo valores nos atributos do objecto telemovel
        telemovel.nome = "Iphone";
        telemovel.sistemaOperacional = "IOS";
        telemovel.espacoArmazenamento = 256;
        telemovel.tamanhoTela = 6.1f;
        
        // atribuindo valores nos atributos do objecto telemovelB
        telemovelB.nome = "Sansung";
        telemovelB.sistemaOperacional = "Android";
        telemovelB.espacoArmazenamento = 128;
        telemovelB.tamanhoTela = 6.8f;

        // imprimindo os atributos na tela 
        System.out.format("O %s possui %dbg  de armazenamento e uma tela de %.1f mega pixel e ainda um sistema %S \n", telemovel.nome, telemovel.espacoArmazenamento, telemovel.tamanhoTela, telemovel.sistemaOperacional);

        // imprimindo os atributos na tela B
        System.out.format("O %s possui %dbg  de armazenamento e uma tela de %.1f mega pixel e ainda um sistema %S \n", telemovelB.nome, telemovelB.espacoArmazenamento, telemovelB.tamanhoTela, telemovelB.sistemaOperacional);
    
        System.out.println("****************************************\n");

        // instaciando o objeto anderson em duas alineas
        Personagem anderson;
        anderson = new Personagem();

        anderson.nome = "Anderson";
        anderson.nivel = 2;
        anderson.forca = 16;

        // chamada aos metodos com o objeto
        anderson.mostrarStatus();
        anderson.atacar("Vilao", "tai jutsu");

        System.out.println("****************************************\n");

        Calculadora somando = new Calculadora();

        somando.n1 = 20;
        somando.n2 = 10;

        System.out.println("Resultado "+ somando.somar());

        System.out.println("############################################################");

        // Criando uma fila
        Fila fila = new Fila(5);

        // Adicionando elementos à fila
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        // Imprimindo o tamanho da fila
        System.out.println("Tamanho da fila: " + fila.tamanho());

        // Imprimindo o primeiro e último elementos da fila
        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Último elemento da fila: " + fila.ultimo());

        // Removendo elementos da fila
        System.out.println("Elemento desenfileirado: " + fila.desenfileirar());

        // Imprimindo o primeiro elemento da fila após a remoção
        System.out.println("Novo primeiro elemento da fila: " + fila.primeiro());
        
    }
}