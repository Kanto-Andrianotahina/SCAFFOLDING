package com.district.test.entity;

import com.dao.annotation.*;
import com.dao.annotation.conf.ForeignType;

import java.math.BigDecimal;

@Table(name = "habitation")
public class Habitation {
	@ForeignKey(mappedBy = "idtype", foreignType = ForeignType.OneToMany)
	Typehabitation typehabitation;
	@Column(name = "nbchambres")
	Integer nbchambres;
	@Column(name = "quartier")
	String quartier;
	@Column(name = "loyerjournalier")
	BigDecimal loyerjournalier;
	@ForeignKey(mappedBy = "idphoto", foreignType = ForeignType.OneToMany)
	Photos photos;
	@PrimaryKey
	@GeneratedValue(autoIncrement = true)
	@Column(name = "idhabitation")
	Integer idhabitation;
	@Column(name = "descriptionhabitation")
	String descriptionhabitation;


	public Habitation(){}
	public Typehabitation getTypehabitation(){
		return this.typehabitation;
	}
	public void setTypehabitation(Typehabitation typehabitation){
		this.typehabitation = typehabitation;
	}
	public Integer getNbchambres(){
		return this.nbchambres;
	}
	public void setNbchambres(Integer nbchambres){
		this.nbchambres = nbchambres;
	}
	public String getQuartier(){
		return this.quartier;
	}
	public void setQuartier(String quartier){
		this.quartier = quartier;
	}
	public BigDecimal getLoyerjournalier(){
		return this.loyerjournalier;
	}
	public void setLoyerjournalier(BigDecimal loyerjournalier){
		this.loyerjournalier = loyerjournalier;
	}
	public Photos getPhotos(){
		return this.photos;
	}
	public void setPhotos(Photos photos){
		this.photos = photos;
	}
	public Integer getIdhabitation(){
		return this.idhabitation;
	}
	public void setIdhabitation(Integer idhabitation){
		this.idhabitation = idhabitation;
	}
	public String getDescriptionhabitation(){
		return this.descriptionhabitation;
	}
	public void setDescriptionhabitation(String descriptionhabitation){
		this.descriptionhabitation = descriptionhabitation;
	}

}
