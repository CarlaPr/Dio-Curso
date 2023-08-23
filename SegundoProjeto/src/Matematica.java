import java.util.Scanner;
public class Matematica {

    public static void main (String [] args ) {
        
        System.out.println("Idade da Turma");
        Scanner m = new Scanner(System.in);
        int idade , maiorIdade = 0;

        for (int i = 0; i<4; i++){
            System.out.print("Digite sua idade: ");
            idade = m.nextInt();
            
            if (idade>maiorIdade){
                maiorIdade = idade;
            }
        }
        System.out.println(maiorIdade);
    }

}