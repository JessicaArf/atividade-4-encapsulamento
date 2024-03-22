//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Suprimentos suprimento1 = new Suprimentos(1, "Teclado", 5, 100);
        double invoiceAmount = suprimento1.getInvoiceAmount();
        System.out.println("Olá, você escolheu o item: " +
                suprimento1.getDescription() +
                ", na quantidade: " + suprimento1.getQuantity() +
                " e o valor do item é: " + suprimento1.getValue() +
                "\nO valor da fatura é: R$" + invoiceAmount);

        System.out.println("------------------");

        Colaborador employee1 = new Colaborador("Sakura", "Silva", 4000);
        Colaborador employee2 = new Colaborador("Hinata", "Souza", 5000);
        System.out.println("O salário anual do primeiro funcionário é: " + employee1.getSalaryAnnual());
        System.out.println("O salário anual do segundo funcionário é: " + employee2.getSalaryAnnual());

        employee1.getIncreaseSalary();
        employee2.getIncreaseSalary();

        System.out.println("O salário anual do primeiro funcionário após o aumento de 10% é: " + employee1.getSalaryAnnual());
        System.out.println("O salário anual do segundo funcionário após o aumento de 10%  é: " + employee2.getSalaryAnnual());

    }
}