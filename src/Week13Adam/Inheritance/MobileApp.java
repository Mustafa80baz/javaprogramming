package Week13Adam.Inheritance;

public class MobileApp {
    public String name;
    public double version;

    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }
    public void useTheApp(int minute){
        System.out.println("User be cool"+name+"application for");

    }
    public void downLoad(){
        System.out.println(name+"application is downloading");
    }

    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
    /*
     Task 3: appTask:
        Create a class called MobileApp
            instance variables:
                name, version
                add a constructor to set all the fields
            instance methods:
                useTheApp(int minutes), download()
        Create the following subclasses of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)
     */
}
