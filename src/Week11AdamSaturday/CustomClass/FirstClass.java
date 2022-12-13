package Week11AdamSaturday.CustomClass;

public class FirstClass {
    public int a;
    public String b;
    public secondClass secondClass;

    public FirstClass(int a, String b, Week11AdamSaturday.CustomClass.secondClass secondClass) {
        this.a = a;
        this.b = b;
        this.secondClass = secondClass;
    }

    public String toString() {
        return "FirstClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", secondClass=" + secondClass +
                '}';
    }
}

