package com.district.test.entity;

import com.dao.annotation.*;
import com.dao.annotation.conf.ForeignType;


@Table(name = "photos")
public class Photos {
	@Column(name = "nom3")
	String nom3;
	@Column(name = "nom2")
	String nom2;
	@Column(name = "nom1")
	String nom1;
	@PrimaryKey
	@GeneratedValue(autoIncrement = true)
	@Column(name = "idphoto")
	Integer idphoto;
	@Column(name = "nom4")
	String nom4;


	public Photos(){}
	public String getNom3(){
		return this.nom3;
	}
	public void setNom3(String nom3){
		this.nom3 = nom3;
	}
	public String getNom2(){
		return this.nom2;
	}
	public void setNom2(String nom2){
		this.nom2 = nom2;
	}
	public String getNom1(){
		return this.nom1;
	}
	public void setNom1(String nom1){
		this.nom1 = nom1;
	}
	public Integer getIdphoto(){
		return this.idphoto;
	}
	public void setIdphoto(Integer idphoto){
		this.idphoto = idphoto;
	}
	public String getNom4(){
		return this.nom4;
	}
	public void setNom4(String nom4){
		this.nom4 = nom4;
	}

}
