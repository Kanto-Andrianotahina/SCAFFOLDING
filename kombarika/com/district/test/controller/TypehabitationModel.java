package com.district.test.controller;

import com.district.test.entity.Typehabitation;
import com.karana.etu2060.framework.annotation.*;
import com.karana.etu2060.framework.annotation.property.*;
import com.dao.database.GenericDao;

@RequestMapping(path = "/typehabitation")
public class TypehabitationModel {
	private Typehabitation entity = new Typehabitation();

	@Url(method = HttpMethod.POST)
	@Json
	public Object save(@RequestBody Typehabitation typehabitation){
	 	try{
			GenericDao.save(null, typehabitation);
			return "saved successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.PUT)
	@Json
	public Object update(@RequestBody Typehabitation typehabitation){
	 	try{
			GenericDao.update(null, typehabitation);
			return "updated successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.DELETE)
	@Json
	public Object delete(@RequestBody Typehabitation typehabitation){
	 	try{
			GenericDao.delete(null, typehabitation);
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
