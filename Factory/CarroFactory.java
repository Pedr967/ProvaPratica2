package Factory;

// Fábrica concreta para criar carros
class CarroFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();  // Cria e retorna um Carro
    }
}