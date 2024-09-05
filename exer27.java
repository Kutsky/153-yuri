import java.util.Scanner;

public class exer27{

    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int dia;
        System.out.print("Digite o dia: ");
        dia = leia.nextInt();
        switch (dia){
            case 1:
             System.out.print("domingo");
            break;
            
            case 2:
             System.out.println("Segunda-feira");
                break;

             case 3: 
              System.out.println("Terça-feira");
                break;
         
            case 4:
             System.out.println("quarta-feira");
                break;

            case 5:
             System.out.println("quinta-feira");
                break;

            case 6:
                System.out.println("sexta-feira");
                   break;

            case 7:
                   System.out.println("Sábado");
                      break;

            default:
             System.out.print("Nenhum dia da semena");
                break;

        }


    }
    }
