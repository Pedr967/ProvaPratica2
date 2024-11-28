package Factory;

// Fábrica concreta para criar motocicletas
class MotocicletaFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Motocicleta();  // Cria e retorna uma Motocicleta
    }
}