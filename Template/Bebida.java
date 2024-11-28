abstract class Bebida {

    // Template method: não deve ser sobrescrito, define o fluxo
    public final void prepararBebida() {
        ferverAgua();
        adicionarIngrediente();
        mexer();
        servir();
    }

    // Etapas do processo de preparação
    private void ferverAgua() {
        System.out.println("Fervendo água...");
    }

    // Método que cada classe concreta deve implementar
    protected abstract void adicionarIngrediente();

    private void mexer() {
        System.out.println("Mexendo a bebida...");
    }

    private void servir() {
        System.out.println("Servindo a bebida...");
    }
}