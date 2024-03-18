package com.district.test.controller;

import com.district.test.entity.Photos;
import com.karana.etu2060.framework.annotation.*;
import com.karana.etu2060.framework.annotation.property.*;
import com.dao.database.GenericDao;

@RequestMapping(path = "/photos")
public class PhotosModel {
	private Photos entity = new Photos();

	@Url(method = HttpMethod.POST)
	@Json
	public Object save(@RequestBody Photos photos){
	 	try{
			GenericDao.save(null, photos);
			return "saved successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.PUT)
	@Json
	public Object update(@RequestBody Photos photos){
	 	try{
			GenericDao.update(null, photos);
			return "updated successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.DELETE)
	@Json
	public Object delete(@RequestBody Photos photos){
	 	try{
			GenericDao.delete(null, photos);
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
