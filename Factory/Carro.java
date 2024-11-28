package Factory;

// Classe Carro: implementa a interface Veiculo
class Carro implements Veiculo {
    @Override
    public void criar() {
        System.out.println("Criando um carro...");
    }
}

// Classe Motocicleta: implementa a interface Veiculo
class Motocicleta implements Veiculo {
    @Override
    public void criar() {
        System.out.println("Criando uma motocicleta...");
    }
}