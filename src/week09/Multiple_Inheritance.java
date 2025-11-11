package week09;

interface A {
    void displayA();
}

interface B {
    void displayB();
}

public class C implements A, B {
    public void displayA() {
        System.out.println("Display A");
    }

    public void displayB() {
        System.out.println("Display B");
    }

    public static void main(String[] args) {
        C c = new C();
        c.displayA(); // Memanggil metode dari interface A
        c.displayB(); // Memanggil metode dari interface B
    }
}