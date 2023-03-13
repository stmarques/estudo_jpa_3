package br.com.fiap.smartcities.entitades;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="tb_embarques")
public class Embarques {
	
	@Id
	@SequenceGenerator(name="cd_embarque",sequenceName="sq_tb_embarque",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cd_embarque")
	@Column (name="cd_embarque")
	private int idEmbarque;
	
	@Column(name="nm_destino",nullable=false,length=100)
	private String nomeDestino;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_embarque")
	private Calendar dataEmbarque;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_desembarque")
	private Calendar dataDesembarque;
	
	@OneToMany
	private List<Passageiros>id_passageiro;
	
	@OneToMany
	private List<Fornecedores>id_fornecedor;
	
	@OneToMany
	private List<Reservas>cd_reserva;	
		
	public Embarques() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdEmbarque() {
		return idEmbarque;
	}

	public void setIdEmbarque(int idEmbarque) {
		this.idEmbarque = idEmbarque;
	}

	public String getNomeDestino() {
		return nomeDestino;
	}

	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}

	public Calendar getDataEmbarque() {
		return dataEmbarque;
	}

	public void setDataEmbarque(Calendar dataEmbarque) {
		this.dataEmbarque = dataEmbarque;
	}

	public Calendar getDataDesembarque() {
		return dataDesembarque;
	}

	public void setDataDesembarque(Calendar dataDesembarque) {
		this.dataDesembarque = dataDesembarque;
	}
	
	
	
}
	
	
	
	
