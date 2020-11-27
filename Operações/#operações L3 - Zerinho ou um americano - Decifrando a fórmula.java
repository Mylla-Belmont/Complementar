import java.util.Scanner;

class Zerinho_ou_um{
    public static void main(String[] args){
        int jog1, jog2, jog3, jog4, soma, res;

        Scanner input = new Scanner (System.in);

        System.out.println("Jogadores! 1, 2, 3... Já!!!");
        jog1 = input.nextInt();
        jog2 = input.nextInt();
        jog3 = input.nextInt();
        jog4 = input.nextInt();

        soma = jog1 + jog2 + jog3 + jog4;
        res = soma % 4;

        if(soma == 0) {
            System.out.println("Nenhum");
        }else if(res == 1){
            System.out.println("Jog1");
        }else if(res == 2){
            System.out.println("Jog2");
        }else if(res == 3){
            System.out.println("Jog3");
        }else if(res == 4 || res == 0){
            System.out.println("Jog4");
        }
        input.close();
    }
}