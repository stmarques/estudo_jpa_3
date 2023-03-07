package br.com.fiap.smartcities.entitades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_fornecedores")
public class Fornecedores {
	
	@Id
	@SequenceGenerator(name="produto",sequenceName="sq_tb_produto",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="produto")
	@Column(name="id_fornecedor")
	private int idFornecedor;

	@Column(name="tp_fornecedor")
	@Enumerated(EnumType.STRING)
	private Tipo tipoFornecedor;
	
	@Column(name="nm_fornecedor",nullable=false,length=100)
	private String nomeFornecedor;
	
	@ManyToOne
	@JoinColumn(name="id_embarque_fornecedor")
	private Embarques idEmbarque;
	
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="idFornecedor"),
	inverseJoinColumns=@JoinColumn(name="cd_reserva"),
	name="tb_fornecedor_reserva")
	private List<Reservas> cd_reserva;
	
	public Fornecedores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public Tipo getTipoFornecedor() {
		return tipoFornecedor;
	}

	public void setTipoFornecedor(Tipo tipoFornecedor) {
		this.tipoFornecedor = tipoFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	
	
	
}
