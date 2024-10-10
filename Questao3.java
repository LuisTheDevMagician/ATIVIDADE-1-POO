import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int i = 1;

        while (i == 1){
            int[] num = new int[5];

            for(int j=0; j < 5; j++){
                System.out.printf("Infome o numero %d: \n", j+1);
                num[j] = myInput.nextInt();
                myInput.nextLine();
            }


            System.out.printf("Números do Vetor: %d, %d, %d, %d, %d\n", num[0], num[1], num[2], num[3], num[4]);
            System.out.println("Soma dos números do vetores: " + (num[0] + num[1] + num[2] + num[3] + num[4]));
            System.out.println("Multiplicação dos números do Vetor: " + num[0] * num[1] * num[2] * num[3] * num[4]);

            System.out.println("Deseja continuar? (S/n)");
            String continuar = myInput.nextLine().trim();

            if (continuar.equalsIgnoreCase("S")) {
                i = 1;
            } else {
                i = 0;
            }
        }
        myInput.close();
    }
}
