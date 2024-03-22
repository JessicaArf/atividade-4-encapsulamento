public class Colaborador {
    String name;
    String surname;
    double salary;

    public Colaborador(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = Math.max(salary, 0);
    }

    public double getIncreaseSalary(){
        return salary *= 1.1;
    }

    public double getSalaryAnnual(){
        return salary * 12;
    }



}
