package com.cg.ofr.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.entities.FlatBooking;
import com.cg.ofr.exception.FlatBookingNotFoundException;

import com.cg.ofr.repository.IFlatBookingRepository;
import com.cg.ofr.service.IFlatBookingService;

@Service
public class FlatBookingService implements IFlatBookingService {
	
	
	@Autowired
	private IFlatBookingRepository flatbookingRepository;
	
	public String addFlatBooking(FlatBooking flat) {
		flatbookingRepository.save(flat);
		return "Added";
	}
	
	public List<FlatBooking> viewAllFlatBooking(){
   	 return flatbookingRepository.findAll();
}

	
	
	  public List<FlatBooking> updateFlatBooking(int bookingNo, Flat flat) throws
	  FlatBookingNotFoundException{
	  if(!flatbookingRepository.existsById(bookingNo)) { 
		  throw new FlatBookingNotFoundException(); } 
	  FlatBooking flatbooking=flatbookingRepository.findById(bookingNo).get();
	  
	  flatbooking.setFlat(flat); flatbookingRepository.flush(); return
	  flatbookingRepository.findAll(); }
	  
	  public List<FlatBooking> deleteFlatBooking(int bookingNo, Flat flat) throws
	  FlatBookingNotFoundException{
	  if(!flatbookingRepository.existsById(bookingNo)) { throw new
	  FlatBookingNotFoundException(); } FlatBooking
	   flatbooking=flatbookingRepository.findById(bookingNo).get();
	  flatbooking.setFlat(flat);
	  
	  return flatbookingRepository.findAll(); }
	  
	  
	  public List<FlatBooking> viewFlatBooking(int bookingNo, Flat flat) throws
	  FlatBookingNotFoundException{
	  if(!flatbookingRepository.existsById(bookingNo)) { throw new
	  FlatBookingNotFoundException(); } FlatBooking
	  flatbooking=flatbookingRepository.findById(bookingNo).get();
	  flatbooking.setFlat(flat);
	  
	  return flatbookingRepository.findAll(); }
	 
     
     
     
     

	
	}

	

		
//	public Flat updateFlatBooking(Flat flat) throws FlatBookingNotFoundException;
//	public Flat deleteFlatBooking(Flat flat) throws FlatBookingNotFoundException;
//	public Flat viewFlatBooking(int id) throws FlatBookingNotFoundException;
//	public List<FlatBooking> viewAllFlatBooking();

	


