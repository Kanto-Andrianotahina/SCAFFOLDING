package com.district.test.controller;

import com.district.test.entity.Personnes;
import com.karana.etu2060.framework.annotation.*;
import com.karana.etu2060.framework.annotation.property.*;
import com.dao.database.GenericDao;

@RequestMapping(path = "/personnes")
public class PersonnesModel {
	private Personnes entity = new Personnes();

	@Url(method = HttpMethod.POST)
	@Json
	public Object save(@RequestBody Personnes personnes){
	 	try{
			GenericDao.save(null, personnes);
			return "saved successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.PUT)
	@Json
	public Object update(@RequestBody Personnes personnes){
	 	try{
			GenericDao.update(null, personnes);
			return "updated successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.DELETE)
	@Json
	public Object delete(@RequestBody Personnes personnes){
	 	try{
			GenericDao.delete(null, personnes);
			return "deleted successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.GET)
	@Json
	public Object findAll(){
	 	try{
			return GenericDao.findAll(null, entity);
		}catch(Exception e){
			return "Bad request";
		}
	}


}
