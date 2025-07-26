package Aulas.Heranca_e_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee emp) {
        System.out.printf("======%s======\n", emp.getClass().getCanonicalName());
        switch (emp){
            case Manager manager -> {
                manager.setCode("123");
                manager.setNome("João");
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setCommission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getNome());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
            }
            case Salesman salesman -> {
                salesman.setCode("456");
                salesman.setNome("Pedro");
                salesman.setSalary(5000);
                salesman.setPercentagePerSold(10);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getNome());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentagePerSold());
            }
        }
    }
}
