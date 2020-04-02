public class Conta implements Comparable<Conta> {
	
	// atributos ******************************************
	private String nomeTitular;
	private int numero;
	private double saldo;
	
	// contrutor ******************************************
	public Conta(String nomeTitular, int numero, double saldo) {
		this.nomeTitular = nomeTitular;
		this.numero = numero;
		this.saldo = saldo;
	}

	// Getters & Setters *********************************
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	// Métodos abstratos *******************************
	/** Nos permite definir o critério de comparação*/
	@Override  //criterio de comparação (definição)
	public int compareTo(Conta outraConta) {
		// TODO Auto-generated method stub
		if(this.numero<outraConta.numero) return -1;
                if(this.numero>outraConta.numero) return 1;
                return 0; // relação de igualdade 
        }
	
}
