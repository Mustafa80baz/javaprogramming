package Day35Encapsulation.Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
       Employee employee1=new Employee("Nihal",'F',23,110000);
        System.out.println( employee1);
        employee1.setAge(34);
        System.out.println("employee1 = " + employee1);
        Employee employee2=new Employee("Salih",'M',24,45000);
        employee2.setName("Numan");//direk değiştirir
        System.out.println("employee2 = " + employee2);
        employee2.setSalary(employee2.getSalary()+1500);//burada ekleme yapıyor-+*366


      System.out.println("employee2 = " + employee2);
    }

}
