package OOP;

public class Incapsulation {
    final String pol;

    public Incapsulation (String pol) {
        this.pol = pol;
    }

    private boolean active;

    public boolean isActive() {
        return active;
    }

    private StringBuilder name;
    // если тип возвращаемых данных изменяемый, то лучше возвращать его копию. чтобы нельзя было изменить данные
    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder s) {
        name = s;
    }


    private int vozrast;
    public int getVozrast() {
        return vozrast;
    }
    public void setVozrast(int i) {
        if(i > 0) {
            vozrast = i;
        }
    }

    private int ves;
    public int getVes() {
        return ves;
    }
    public void setVes(int v) {
        if(v > 0) {
            ves = v;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Incapsulation human = new Incapsulation("male");
        human.setName(new StringBuilder("Stepan"));

        human.getName().append("!!!");
        human.setVozrast(25);
        human.setVes(50);
        System.out.print(human.getName() +" "+ human.getVes() + " " + human.getVozrast() + " " + human.isActive());
    }
}
