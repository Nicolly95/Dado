import java.util.Scanner;        //Importa classe que lê as entradas do usuário
import java.util.Random;         //Importa classe que gera números aleatoriamente

public class CalculoDados {
    
    public static void main(String[] args) {
        
        //Declara o array contendo os valores das faces dos dados
        int faces[] = {1,2,3,4,5,6};


        //Instancia a classe Scanner para ler as entradas com o método .in, e armazena o valor digiato na variável "entrada".
        Scanner entrada = new Scanner(System.in);   
        System.out.println("Qual face do dado será sorteada? ");
        //Atribui a entrada do usuário da variável "entrada" para a variável "palpite"
        int palpite = entrada.nextInt();            


        //Instancia a classe Random para dentro do método principal com o nome "aleatorio"
        Random aleatorio = new Random();            
        
        //Vincula a classe Random(aleatorio) para sortear um número dentro da array "faces", 
        // le o valor sorteado com o método .nextInt e armazena em "indiceAleatorio" 
        int indiceAleatorio = aleatorio.nextInt(faces.length);
        
        //Array "faces" passa a receber o valor sorteado em "indiceAleatorio" e armazena o resultado em "numeroFaceAleatorio"
        int numeroFaceAleatorio = faces[indiceAleatorio];  
        
        //Armazena o resultado de numeroFaceAleatorio em "resultado"
        String resultado = ("Número sorteado: " + numeroFaceAleatorio);
        
        //Exibe o resultado pro usuário
        System.out.println(resultado);

        if (palpite == numeroFaceAleatorio) {
            System.out.println("Você acertou o número sorteado!!!");
        }
        else {
            System.out.println("Você errou.");
        }  

    }

}
