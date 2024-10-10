import java.util.Scanner;

public class Questao1{
    public static void main(String[] args){

        Scanner myInput = new Scanner(System.in);
        int i = 1;

        while (i == 1){
            System.out.println("Informe a quantidade de horas trabalhadas: ");
            int horasTrabalhadas = myInput.nextInt();
            myInput.nextLine();

            double valorHora = 1.0;

            double salarioBruto = valorHora * horasTrabalhadas;
            double sindical = 0.03;
            double fgts = 0.11;
            double ir1 = 0.05;
            double ir2 = 0.1;
            double ir3 = 0.2;

            if (salarioBruto <= 900){
                System.out.println(String.format("Sálario Bruto: R$ %.2f", salarioBruto));
                System.out.println(String.format("Imposto Sindical: R$ %.2f", salarioBruto * sindical));
                System.out.println(String.format("FGTS: R$ %.2f", salarioBruto * fgts));
                System.out.println(String.format("Total de descontos: R$ %.2f", salarioBruto * sindical));
                double salarioLiquido = salarioBruto - (salarioBruto * sindical);
                System.out.println(String.format("Salario Líquido: R$ %.2f", salarioLiquido));
            } else if (salarioBruto > 900 && salarioBruto <= 1500){
                System.out.println(String.format("Sálario Bruto: R$ %.2f", salarioBruto));
                System.out.println(String.format("Imposto Sindical: R$ %.2f", salarioBruto * sindical));
                System.out.println(String.format("FGTS: R$ %.2f", salarioBruto * fgts));
                System.out.println(String.format("Total de descontos: R$ %.2f", salarioBruto * sindical));
                double salarioLiquido = salarioBruto - (salarioBruto * ir1 + salarioBruto * sindical);
                System.out.println(String.format("Salario Líquido: R$ %.2f", salarioLiquido));
            } else if (salarioBruto > 1500 && salarioBruto <= 2500){
                System.out.println(String.format("Sálario Bruto: R$ %.2f", salarioBruto));
                System.out.println(String.format("Imposto Sindical: R$ %.2f", salarioBruto * sindical));
                System.out.println(String.format("FGTS: R$ %.2f", salarioBruto * fgts));
                System.out.println(String.format("Total de descontos: R$ %.2f", salarioBruto * sindical));
                double salarioLiquido = salarioBruto - (salarioBruto * ir2 + salarioBruto * sindical);
                System.out.println(String.format("Salario Líquido: R$ %.2f", salarioLiquido));
            } else if (salarioBruto > 2500){
                System.out.println(String.format("Sálario Bruto: R$ %.2f", salarioBruto));
                System.out.println(String.format("Imposto Sindical: R$ %.2f", salarioBruto * sindical));
                System.out.println(String.format("FGTS: R$ %.2f", salarioBruto * fgts));
                System.out.println(String.format("Total de descontos: R$ %.2f", salarioBruto * sindical));
                double salarioLiquido = salarioBruto - (salarioBruto * ir3 + salarioBruto * sindical);
                System.out.println(String.format("Salario Líquido: R$ %.2f", salarioLiquido));
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