import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int i = 1;

        while (i == 1){
            System.out.println("Infome o número para gerar sua respectiva tabuada:");
            int num = myInput.nextInt();
            myInput.nextLine();

            for(int j=0; j <= 10; j++){
                System.out.printf("%d x %d = %d\n", num, j, num * j);
            }
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
