package Factory;

// Classe principal para testar o Factory Method
public class Main {
    public static void main(String[] args) {

        // Criando uma fábrica para carros
        VeiculoFactory carroFactory = new CarroFactory();
        Veiculo carro = carroFactory.criarVeiculo();
        carro.criar();  // Saída: Criando um carro...

        // Criando uma fábrica para motocicletas
        VeiculoFactory motocicletaFactory = new MotocicletaFactory();
        Veiculo motocicleta = motocicletaFactory.criarVeiculo();
        motocicleta.criar();  // Saída: Criando uma motocicleta...
    }
}