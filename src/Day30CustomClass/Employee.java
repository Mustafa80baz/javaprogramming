package Day30CustomClass;

public class Employee {
    public String name;
    public int ID;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

      public void setInfo(String name, int ID, char gender, int i, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }


    public void work(){
        System.out.println(jobTitle+ name+" is Working");
    }
    public void work1(){
        System.out.println(jobTitle+name+" is not working");
    }


    }


