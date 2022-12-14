package Day38CarTaskInheritance.ShapeTask;

public class Shape {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        if (name==null){
            System.out.println("Name can not be null");
            System.exit(1);// something went wrong
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
      setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }


}
