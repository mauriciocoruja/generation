import modelo.Animal;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };

    }
}
