package Day30CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
    Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();
employee1.setInfo("John",2237,'M',25,"Developer",100000,true);
employee2.setInfo("Anna",2287,'F',28,"QA",85000,true);
employee3.setInfo("David",2256,'M',35,"Qa",45000,true);
employee4.setInfo("Lina",2290,'F',45,"Managerr",80000,true);
employee1.setInfo("Kevin",2298,'M',35,"Senior QA",1100000,true);

Employee[] employees={employee1,employee2,employee3,employee4,employee5};//array into yaptık
        int cuontFull=0;
        int parttime=0;
        double max=employees[0].salary;
        double min=employees[0].salary;

        for (Employee each : employees) {
            if (each.isFullTime){
                cuontFull++;
            }else {
                parttime++;
            }
if (each.salary>max){
    max= each.salary;
}

if (each.salary< min){
    min= each.salary;
}
        }

        System.out.println("cuontFull = " + cuontFull);
        System.out.println("parttime = " + parttime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
