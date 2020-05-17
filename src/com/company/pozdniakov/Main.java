package com.company.pozdniakov;

public class Main {

    public static void main(String[] args) {
        Manager man1 = new Manager("King",999);
        Manager man2 = new Manager("Balake",800);
        man2.setManager(man1);
        Employee emp1 = new Employee("Rembo");
        emp1.setManager(man2);
        Employee emp2 = new Employee("Max");
        emp2.setManager(man2);
        Employee emp3 = new Employee("Waka");
        emp3.setManager(man1);
        Manager man3 = new Manager("Nick",700);
        Manager man4 = new Manager("CoCo",600);
        man4.setManager(man3);
        Manager man5 = new Manager("Baks",500);
        man5.setManager(man4);
        Manager man6 = new Manager("Wrake",400);
        man6.setManager(man5);
        Employee emp4 = new Employee("Buble");
        emp4.setManager(man6);

        emp4.getManagerName();
        System.out.println(emp4.getTopManager(emp4.getManager()).toString());
    }
}
