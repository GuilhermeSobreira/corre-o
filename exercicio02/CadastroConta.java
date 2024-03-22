package exercicio02;

public class CadastroConta {
    Conta[] conta;
    int numContas;

    public CadastroConta() {
        conta = new Conta[3];
        numContas = 0;
    }

    public void adicionarConta(String nome, double valor) {
        if (numContas < conta.length) {
            conta[numContas] = new Conta(nome, valor);
            numContas++;
            System.out.println("Conta adicionada com sucesso!\n");
        } else {
            System.out.println("\nLimite de contas atingido!\n");
        }
    }

    public void listarContas() {
        if (numContas == 0) {
            System.out.println("\nNenhuma conta cadastrada!\n");
        } else {
            System.out.println("\nContas cadastradas: ");
            for (int i = 0; i < numContas; i++) {
                System.out.println("\nNome: " + conta[i].getNome() + "\nValor: \n" + conta[i].getValor());
            }
        }
    }

    public void procurarConta(String nome) {
        boolean encontrada = false;
        for (int i = 0; i < numContas; i++) {
            if (conta[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("\nConta encontrada! \n\nNome: " + conta[i].getNome() + "\nValor: " + conta[i].getValor());
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("\nConta não encontrada!\n");
        }
    }
    
    public void adicionarPorPosicao(Conta c, int posicao) {
    	for(int i = this.numContas-1; i >= posicao; i--) {
    		this.conta[i+1] = this.conta[i];
    	}
    		this.conta[posicao] = c;
    		this.numContas++;
    }
    
    public void removerConta (int posicao) {
    	for(int i = posicao; i < this.numContas; i++) {
    		this.conta[i] = this.conta[i++];
    	}
    	this.conta[this.numContas-1] = null;
    }
    
    
}