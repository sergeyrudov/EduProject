public class Polymorph {

    public class Animal {

        public void voice() {

            System.out.println("Голос!");
        }
    }

    public class Dog extends Animal {


        @Override
        public void voice() {
            System.out.println("Гав-гав!");
        }
    }

    public class Cat extends Animal {

        @Override
        public void voice() {
            System.out.println("Мяу!");
        }
    }
}
