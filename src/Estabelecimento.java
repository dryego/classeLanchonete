import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.adicionarLancheBalcao();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.fritarIngredientes();
        cozinheiro.lavarIngredientes();
        cozinheiro.preparaLanche();
    }
}
