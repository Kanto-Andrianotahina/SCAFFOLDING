package com.district.test.controller;

import com.district.test.entity.Reservation;
import com.karana.etu2060.framework.annotation.*;
import com.karana.etu2060.framework.annotation.property.*;
import com.dao.database.GenericDao;

@RequestMapping(path = "/reservation")
public class ReservationModel {
	private Reservation entity = new Reservation();

	@Url(method = HttpMethod.POST)
	@Json
	public Object save(@RequestBody Reservation reservation){
	 	try{
			GenericDao.save(null, reservation);
			return "saved successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.PUT)
	@Json
	public Object update(@RequestBody Reservation reservation){
	 	try{
			GenericDao.update(null, reservation);
			return "updated successfully";
		}catch(Exception e){
			return "Bad request";
		}
	}
	@Url(method = HttpMethod.DELETE)
	@Json
	public Object delete(@RequestBody Reservation reservation){
	 	try{
			GenericDao.delete(null, reservation);
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
