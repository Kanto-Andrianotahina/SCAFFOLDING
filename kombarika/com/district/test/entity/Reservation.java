package com.district.test.entity;

import com.dao.annotation.*;
import com.dao.annotation.conf.ForeignType;

import java.sql.Date;

@Table(name = "reservation")
public class Reservation {
	@ForeignKey(mappedBy = "idpersonne", foreignType = ForeignType.OneToMany)
	Personnes personnes;
	@Column(name = "datesortie")
	Date datesortie;
	@PrimaryKey
	@GeneratedValue(autoIncrement = true)
	@Column(name = "idreservation")
	Integer idreservation;
	@Column(name = "datearrive")
	Date datearrive;
	@Column(name = "idhabitation")
	Integer idhabitation;


	public Reservation(){}
	public Personnes getPersonnes(){
		return this.personnes;
	}
	public void setPersonnes(Personnes personnes){
		this.personnes = personnes;
	}
	public Date getDatesortie(){
		return this.datesortie;
	}
	public void setDatesortie(Date datesortie){
		this.datesortie = datesortie;
	}
	public Integer getIdreservation(){
		return this.idreservation;
	}
	public void setIdreservation(Integer idreservation){
		this.idreservation = idreservation;
	}
	public Date getDatearrive(){
		return this.datearrive;
	}
	public void setDatearrive(Date datearrive){
		this.datearrive = datearrive;
	}
	public Integer getIdhabitation(){
		return this.idhabitation;
	}
	public void setIdhabitation(Integer idhabitation){
		this.idhabitation = idhabitation;
	}

}
