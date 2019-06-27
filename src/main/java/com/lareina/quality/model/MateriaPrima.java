package com.lareina.quality.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="materia_prima")
public class MateriaPrima implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_materia_prima")
	private long id;
	
	private java.sql.Date fecha;
	
	private String presentacion;
	
	private String placa;
	
	private String producto;
	
	private String variedad;
	
	private String procedencia;
	
	@Column(name="nombre_conductor")
	private String nombreConductor;
	
	@Column(name="iden_conductor")
	private int idConductor;
	
	@Column(name="humedad_1")
	private double humedad1;
	
	@Column(name="humedad_2")
	private double humedad2;
	
	@Column(name="humedad_3")
	private double humedad3;
	
	@Column(name= "peso_especifico_1")
	private double pesoEspecifico1;
	
	@Column(name= "peso_especifico_2")
	private double pesoEspecifico2;
	
	@Column(name= "peso_especifico_3")
	private double pesoEspecifico3;
	
	@Column(name="temperatura_1")
	private double temperatura1;
	
	@Column(name="temperatura_2")
	private double temperatura2;
	
	@Column(name="temperatura_3")
	private double temperatura3;
	
	private double impurezas;
	
	@Column(name="granos_partidos")
	private double granosPartidos;
	
	@Column(name="germen_dañado")
	private double germenDañado;
	
	private double cristalizados;
	
	@Column(name="dañados_calor")
	private double dañadosCalor;
	
	@Column(name="infectados_hongos")
	private double infectados_hongos;
	
	@Column(name="infectados_plagas")
	private double infectados_plagas;
	
	@Column(name="mezcla_color")
	private double mezclaColor;
	
	private double amilaceos;
	
	private String olor;
	
	private double aflatoxina;
	
	private double pequeño;
	
	private String infestacion;
	
	@Column(name="dañado_total")
	private double dañadoTotal;
	
	private String grado;
	
	private String observacion;
	
	private boolean verificacion;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name="id_user")
	private User idUser;

	public MateriaPrima() {
	}

	public MateriaPrima(Date fecha, String presentacion, String placa, String producto, String variedad,
			String procedencia, String nombreConductor, int idConductor, double humedad1, double humedad2,
			double humedad3, double pesoEspecifico1, double pesoEspecifico2, double pesoEspecifico3,
			double temperatura1, double temperatura2, double temperatura3, double impurezas, double granosPartidos,
			double germenDañado, double cristalizados, double dañadosCalor, double infectados_hongos,
			double infectados_plagas, double mezclaColor, double amilaceos, String olor, double aflatoxina,
			double pequeño, String infestacion, double dañadoTotal, String grado, String observacion,
			boolean verificacion) {
		this.fecha = fecha;
		this.presentacion = presentacion;
		this.placa = placa;
		this.producto = producto;
		this.variedad = variedad;
		this.procedencia = procedencia;
		this.nombreConductor = nombreConductor;
		this.idConductor = idConductor;
		this.humedad1 = humedad1;
		this.humedad2 = humedad2;
		this.humedad3 = humedad3;
		this.pesoEspecifico1 = pesoEspecifico1;
		this.pesoEspecifico2 = pesoEspecifico2;
		this.pesoEspecifico3 = pesoEspecifico3;
		this.temperatura1 = temperatura1;
		this.temperatura2 = temperatura2;
		this.temperatura3 = temperatura3;
		this.impurezas = impurezas;
		this.granosPartidos = granosPartidos;
		this.germenDañado = germenDañado;
		this.cristalizados = cristalizados;
		this.dañadosCalor = dañadosCalor;
		this.infectados_hongos = infectados_hongos;
		this.infectados_plagas = infectados_plagas;
		this.mezclaColor = mezclaColor;
		this.amilaceos = amilaceos;
		this.olor = olor;
		this.aflatoxina = aflatoxina;
		this.pequeño = pequeño;
		this.infestacion = infestacion;
		this.dañadoTotal = dañadoTotal;
		this.grado = grado;
		this.observacion = observacion;
		this.verificacion = verificacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.sql.Date getFecha() {
		return fecha;
	}

	public void setFecha(java.sql.Date fecha) {
		this.fecha = fecha;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	public int getIdConductor() {
		return idConductor;
	}

	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}

	public double getHumedad1() {
		return humedad1;
	}

	public void setHumedad1(double humedad1) {
		this.humedad1 = humedad1;
	}

	public double getHumedad2() {
		return humedad2;
	}

	public void setHumedad2(double humedad2) {
		this.humedad2 = humedad2;
	}

	public double getHumedad3() {
		return humedad3;
	}

	public void setHumedad3(double humedad3) {
		this.humedad3 = humedad3;
	}

	public double getPesoEspecifico1() {
		return pesoEspecifico1;
	}

	public void setPesoEspecifico1(double pesoEspecifico1) {
		this.pesoEspecifico1 = pesoEspecifico1;
	}

	public double getPesoEspecifico2() {
		return pesoEspecifico2;
	}

	public void setPesoEspecifico2(double pesoEspecifico2) {
		this.pesoEspecifico2 = pesoEspecifico2;
	}

	public double getPesoEspecifico3() {
		return pesoEspecifico3;
	}

	public void setPesoEspecifico3(double pesoEspecifico3) {
		this.pesoEspecifico3 = pesoEspecifico3;
	}

	public double getTemperatura1() {
		return temperatura1;
	}

	public void setTemperatura1(double temperatura1) {
		this.temperatura1 = temperatura1;
	}

	public double getTemperatura2() {
		return temperatura2;
	}

	public void setTemperatura2(double temperatura2) {
		this.temperatura2 = temperatura2;
	}

	public double getTemperatura3() {
		return temperatura3;
	}

	public void setTemperatura3(double temperatura3) {
		this.temperatura3 = temperatura3;
	}

	public double getImpurezas() {
		return impurezas;
	}

	public void setImpurezas(double impurezas) {
		this.impurezas = impurezas;
	}

	public double getGranosPartidos() {
		return granosPartidos;
	}

	public void setGranosPartidos(double granosPartidos) {
		this.granosPartidos = granosPartidos;
	}

	public double getGermenDañado() {
		return germenDañado;
	}

	public void setGermenDañado(double germenDañado) {
		this.germenDañado = germenDañado;
	}

	public double getCristalizados() {
		return cristalizados;
	}

	public void setCristalizados(double cristalizados) {
		this.cristalizados = cristalizados;
	}

	public double getDañadosCalor() {
		return dañadosCalor;
	}

	public void setDañadosCalor(double dañadosCalor) {
		this.dañadosCalor = dañadosCalor;
	}

	public double getInfectados_hongos() {
		return infectados_hongos;
	}

	public void setInfectados_hongos(double infectados_hongos) {
		this.infectados_hongos = infectados_hongos;
	}

	public double getInfectados_plagas() {
		return infectados_plagas;
	}

	public void setInfectados_plagas(double infectados_plagas) {
		this.infectados_plagas = infectados_plagas;
	}

	public double getMezclaColor() {
		return mezclaColor;
	}

	public void setMezclaColor(double mezclaColor) {
		this.mezclaColor = mezclaColor;
	}

	public double getAmilaceos() {
		return amilaceos;
	}

	public void setAmilaceos(double amilaceos) {
		this.amilaceos = amilaceos;
	}

	public String getOlor() {
		return olor;
	}

	public void setOlor(String olor) {
		this.olor = olor;
	}

	public double getAflatoxina() {
		return aflatoxina;
	}

	public void setAflatoxina(double aflatoxina) {
		this.aflatoxina = aflatoxina;
	}

	public double getPequeño() {
		return pequeño;
	}

	public void setPequeño(double pequeño) {
		this.pequeño = pequeño;
	}

	public String getInfestacion() {
		return infestacion;
	}

	public void setInfestacion(String infestacion) {
		this.infestacion = infestacion;
	}

	public double getDañadoTotal() {
		return dañadoTotal;
	}

	public void setDañadoTotal(double dañadoTotal) {
		this.dañadoTotal = dañadoTotal;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public boolean isVerificacion() {
		return verificacion;
	}

	public void setVerificacion(boolean verificacion) {
		this.verificacion = verificacion;
	}

	public User getElaborado() {
		return idUser;
	}

	public void setElaborado(User elaborado) {
		this.idUser = elaborado;
	}

	@Override
	public String toString() {
		return "MateriaPrima [id=" + id + ", fecha=" + fecha + ", presentacion=" + presentacion + ", placa=" + placa
				+ ", producto=" + producto + ", variedad=" + variedad + ", procedencia=" + procedencia
				+ ", nombreConductor=" + nombreConductor + ", idConductor=" + idConductor + ", humedad1=" + humedad1
				+ ", humedad2=" + humedad2 + ", humedad3=" + humedad3 + ", pesoEspecifico1=" + pesoEspecifico1
				+ ", pesoEspecifico2=" + pesoEspecifico2 + ", pesoEspecifico3=" + pesoEspecifico3 + ", temperatura1="
				+ temperatura1 + ", temperatura2=" + temperatura2 + ", temperatura3=" + temperatura3 + ", impurezas="
				+ impurezas + ", granosPartidos=" + granosPartidos + ", germenDañado=" + germenDañado
				+ ", cristalizados=" + cristalizados + ", dañadosCalor=" + dañadosCalor + ", infectados_hongos="
				+ infectados_hongos + ", infectados_plagas=" + infectados_plagas + ", mezclaColor=" + mezclaColor
				+ ", amilaceos=" + amilaceos + ", olor=" + olor + ", aflatoxina=" + aflatoxina + ", pequeño=" + pequeño
				+ ", infestacion=" + infestacion + ", dañadoTotal=" + dañadoTotal + ", grado=" + grado
				+ ", observacion=" + observacion + ", verificacion=" + verificacion + ", elaborado=" + idUser
				+ ", verificado=" + "]";
	}
	
	

}
