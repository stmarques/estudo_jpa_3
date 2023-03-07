package br.com.fiap.smartcities.entitades;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="tb_reservas")
public class Reservas {
	
	@Id
	@SequenceGenerator(name="id_cliente",sequenceName="sq_tb_registro",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_cliente")
	@Column(name="cd_reserva")
	private int codigoReserva;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_check_in")
	private Calendar dataCheckIn;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_check_out")
	private Calendar dataCheckOut;
	
	@Column(name="vl_reserva")
	private float valorReserva;
	
	@CreationTimestamp
	@Column(name="dt_reserva")
	private Calendar dataReserva;
	
	@UpdateTimestamp
	@Column(name="dt_confirmacao")
	private Calendar dataConfirmacao;
	
	@ManyToOne
	@JoinColumn(name="id_reseva_embarque")
	private Embarques id_embarque;
	
	@ManyToMany(mappedBy="cd_reserva")
	private List<Passageiros> id_passageiros;
	
	@ManyToMany(mappedBy="cd_reserva")
	private List<Fornecedores> id_fornecedor;

	public Reservas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(int codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public Calendar getDataCheckIn() {
		return dataCheckIn;
	}

	public void setDataCheckIn(Calendar dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
	}

	public Calendar getDataCheckOut() {
		return dataCheckOut;
	}

	public void setDataCheckOut(Calendar dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
	}

	public float getValorReserva() {
		return valorReserva;
	}

	public void setValorReserva(float valorReserva) {
		this.valorReserva = valorReserva;
	}

	public Calendar getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Calendar dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Calendar getDataConfirmacao() {
		return dataConfirmacao;
	}

	public void setDataConfirmacao(Calendar dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}
	
	
	

}
