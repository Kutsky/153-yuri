import java.util.Scanner;

    public class ativi01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite um número número de 1 à 5 ");
        int numero = leia.nextInt();
         switch (numero) {
            case 1: 
                System.out.println("Número 1 foi digitado...");
                break;
         
            case 2:
                 System.out.println("Número 2 foi digitado...");
                break;

             case 3: 
                System.out.println("Número 3 foi digitado...");
                break;
         
            case 4:
                System.out.println("Número 4 foi digitado...");
                break;

            case 5:
                System.out.println("Número 4 foi digitado...");
                break;

            default:
                System.out.print("Inválido");
                break;


         }
    }
}