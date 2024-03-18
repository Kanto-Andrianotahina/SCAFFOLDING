package com.district.test.entity;

import com.dao.annotation.*;
import com.dao.annotation.conf.ForeignType;


@Table(name = "personnes")
public class Personnes {
	@PrimaryKey
	@GeneratedValue(autoIncrement = true)
	@Column(name = "idpersonne")
	Integer idpersonne;
	@Column(name = "typepersonne")
	String typepersonne;
	@Column(name = "motdepasse")
	String motdepasse;
	@Column(name = "numerotelephone")
	String numerotelephone;
	@Column(name = "nom")
	String nom;
	@Column(name = "email")
	String email;


	public Personnes(){}
	public Integer getIdpersonne(){
		return this.idpersonne;
	}
	public void setIdpersonne(Integer idpersonne){
		this.idpersonne = idpersonne;
	}
	public String getTypepersonne(){
		return this.typepersonne;
	}
	public void setTypepersonne(String typepersonne){
		this.typepersonne = typepersonne;
	}
	public String getMotdepasse(){
		return this.motdepasse;
	}
	public void setMotdepasse(String motdepasse){
		this.motdepasse = motdepasse;
	}
	public String getNumerotelephone(){
		return this.numerotelephone;
	}
	public void setNumerotelephone(String numerotelephone){
		this.numerotelephone = numerotelephone;
	}
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

}
