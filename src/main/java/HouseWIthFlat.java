


class HouseWithFlat extends Construct implements Window, Doors{
    public HouseWithFlat(int flat, String name) {
        super(flat, name);
    }

    public static void main(String[] args) {
        Construct construct = new HouseWithFlat(22, "Mira");
        System.out.println(doors);

    }


    @Override
    public void window() {
        System.out.println("quantity of window is 4");
    }

}



abstract class Construct{
    int flat;
    String name;

    public Construct(int flat, String name) {
        this.flat = flat;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

interface Window {
    public void window();
}

interface Doors {
    public int doors = 1;
}
