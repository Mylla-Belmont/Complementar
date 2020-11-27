import java.util.Scanner;

class Distancia_Entre_Pontos{
    public static void main(String[] args){
        int x1, y1, x2, y2;
        double a, b, distancia;

        Scanner input = new Scanner (System.in);

        System.out.println("Digite as coordenadas do 1° ponto:");
        x1 = input.nextInt();
        y1 = input.nextInt();

        System.out.println("Digite as coordenadas do 2° ponto:");
        x2 = input.nextInt();
        y2 = input.nextInt();

        a = Math.pow((y2 - y1), 2);
        b = Math.pow((x2 - x1), 2);
        distancia = a + b;

        System.out.printf("%.2f", Math.sqrt(distancia));
        input.close();
    }
}