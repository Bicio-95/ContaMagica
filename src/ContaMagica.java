import java.math.BigDecimal;

public class ContaMagica {
	
	private String NomeCliente;
	private BigDecimal saldo;
	private Categorias  Status ;
	
	public ContaMagica(String nome){
		this.NomeCliente = nome;
		//saldo = 0;
		
	}
	 public String getNomeCliente(){
		 return NomeCliente;
	 }
	 public BigDecimal getSaldo(){
		 return saldo;
		 
	 }
	 public Categorias getStatus(){
		 return Status;
	 }
	 public void deposito(BigDecimal valor) {
		 saldo.add(valor);
		 
	 }
	 public void retirada(BigDecimal valor) {
		 saldo.subtract(valor);
	 }
	

}
