// Classe principal para testar o Template Method
public class Main {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        Bebida cha = new Cha();
        Bebida cafe = new Cafe();

        // Preparando o chá
        System.out.println("Preparando Chá:");
        cha.prepararBebida();
        System.out.println();

        // Preparando o café
        System.out.println("Preparando Café:");
        cafe.prepararBebida();
    }
}