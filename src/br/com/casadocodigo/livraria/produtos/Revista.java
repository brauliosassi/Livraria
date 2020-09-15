package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Editora;

public class Revista implements Produto, Promocional{
	
	private String nome;
	private String descricacao;
	private double valor;
	private Editora editora;
		
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.1) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	 
}
