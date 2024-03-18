package com.district.test.entity;

import com.dao.annotation.*;
import com.dao.annotation.conf.ForeignType;


@Table(name = "typehabitation")
public class Typehabitation {
	@PrimaryKey
	@GeneratedValue(autoIncrement = true)
	@Column(name = "idtype")
	Integer idtype;
	@Column(name = "nomtype")
	String nomtype;


	public Typehabitation(){}
	public Integer getIdtype(){
		return this.idtype;
	}
	public void setIdtype(Integer idtype){
		this.idtype = idtype;
	}
	public String getNomtype(){
		return this.nomtype;
	}
	public void setNomtype(String nomtype){
		this.nomtype = nomtype;
	}

}
