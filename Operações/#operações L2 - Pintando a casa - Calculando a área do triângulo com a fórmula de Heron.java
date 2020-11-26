import java.util.Scanner;

class AreaTriangulo {
    public static void main(String[] args){
        float a, b, c, p, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os lados a, b e c da casa:");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        p = (a + b + c) / 2;
        area = p * (p-a) * (p-b) * (p-c);

        System.out.printf("%.2f", Math.sqrt(area));
        input.close();
    }    
}