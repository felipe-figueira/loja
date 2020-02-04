package entities;

public class ProdutoImportado extends Produto{

	private Double taxaAlfandega;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	public double valorTotal() {
		return super.getPreco() + taxaAlfandega;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() + "taxa de importação: " + taxaAlfandega; 
	}
	
}
