package com.district.test.controller;

import com.district.test.entity.Habitation;
import com.karana.etu2060.framework.annotation.*;
import com.karana.etu2060.framework.annotation.property.*;
import com.dao.database.GenericDao;

@RequestMapping(path = "/habitation")
public class HabitationModel {
	private Habitation entity = new Habitation();

	@Url(method = HttpMethod.POST)
	@Json
	public Object save(@RequestBody Habitation habitation){
	 	try{
			GenericDao.save(null, habitation);
			return "saved successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.PUT)
	@Json
	public Object update(@RequestBody Habitation habitation){
	 	try{
			GenericDao.update(null, habitation);
			return "updated successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.DELETE)
	@Json
	public Object delete(@RequestBody Habitation habitation){
	 	try{
			GenericDao.delete(null, habitation);
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
