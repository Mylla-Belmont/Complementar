import java.util.Scanner; //importando pacote java para ler valores do teclado

class Data {
    public static void main(String[] args){
        int hora, min, dia, mes, ano;

        Scanner ler = new Scanner(System.in); //criando o objeto 'ler' com a classe Scanner

        System.out.println("Digite hora, minuto, dia, mês e ano:");
        hora =  ler.nextInt();
        min =  ler.nextInt();
        dia =  ler.nextInt();
        mes =  ler.nextInt();
        ano =  ler.nextInt();
    
        if(hora == 24) {
            hora = 0;
        }else if(hora > 12 ){
            hora = hora - 12;
        }
        System.out.printf("%02d:%02d %02d/%02d/%d", hora, min, dia, mes, ano);
        
        ler.close(); //Fechando scanner
    }
}
