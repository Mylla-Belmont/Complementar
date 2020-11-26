import java.util.Scanner;

class Desempenho {
    public static void main(String[] args){
        float velocidade, tempo, consumo, distancia, desempenho;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a velocida, tempo e comsumo:");
        velocidade = entrada.nextFloat();
        tempo = entrada.nextFloat();
        consumo = entrada.nextFloat();

        tempo = tempo / 60;
        distancia = velocidade * tempo;
        desempenho = distancia / consumo;

        System.out.printf("%.2f", desempenho);

        entrada.close(); //Fechando scanner
    }
    
}
