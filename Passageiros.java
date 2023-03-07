package br.com.fiap.smartcities.entitades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table (name="tb_passageiros")
public class Passageiros {

	@Id
	@SequenceGenerator(name="id_passageiro",sequenceName="sq_tb_passageiro",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_passageiro")
	@Column(name="id_passageiro")
	private int idPassageiro;
	
	@Column(name="nm_passageiro",nullable=false,length=100)
	private String nomePassageiro;

	@ManyToOne
	@JoinColumn(name="id_embarque_passageiro")
	private Embarques idEmbarque;
	
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="idPassageiro"),
	inverseJoinColumns=@JoinColumn(name="cd_reserva"),
	name="tb_passageiro_reserva")
	private List<Reservas> cd_reserva;
	
	public Passageiros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPassageiro() {
		return idPassageiro;
	}

	public void setIdPassageiro(int idPassageiro) {
		this.idPassageiro = idPassageiro;
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}	
	
	
	
}
