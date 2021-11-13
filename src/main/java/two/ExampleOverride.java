package two;

public class ExampleOverride {
    public static void main(String[] args) {
        System.out.println();

    }

   // void print (List<Issue> issues) {
      ////  System.out.println(issues.stream().filter(v ->));
    }




class DemoOne {
    void look() {
        System.out.println("LOOK1");
    }

    int look(int i) {
        return i;
    }

    public static void main(String[] args) {
        DemoOne demoOne = new DemoOne();
        demoOne.look();
    }
}


