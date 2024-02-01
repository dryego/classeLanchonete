package lanchonete.atendimento.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("Escolhendo o lanche.");
    }
    public void fazendoPedido(){
        System.out.println("Fazendo pedido.");
    }
    public void pagarConta(){
        consultarSaldoNoAplicativo();
        System.out.println("Pagando conta.");
    }
    public void pegarPedidoBalcao(){
        System.out.println("Pegando pedido no balcão.");
    }
    private void consultarSaldoNoAplicativo(){
        System.out.println("Consultandpo saldo no aplicativa.");
    }
}
