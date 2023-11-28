public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Onibus("ABC1234", 2022, 40);
        veiculos[1] = new Caminhao("XYZ5678", 2021, 6);
        veiculos[2] = new Veiculo("DEF4321", 2020) {
            @Override
            public void exibirDados() {
                System.out.println("Veículo genérico - Placa: " + getPlaca() + ", Ano: " + getAno());
            }
        };

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }
    }
}