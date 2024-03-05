package pratica5.classes;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au!");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo.");
    }
}
