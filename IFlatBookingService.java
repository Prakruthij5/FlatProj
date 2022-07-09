package com.cg.ofr.service;

import java.util.List;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.entities.FlatBooking;
import com.cg.ofr.exception.FlatBookingNotFoundException;

public interface IFlatBookingService {

	public String addFlatBooking(FlatBooking flat);
	
	public List<FlatBooking> viewAllFlatBooking();
	
	public List<FlatBooking> updateFlatBooking(int bookingNo, Flat flat) throws
	  FlatBookingNotFoundException;
	 
	public List<FlatBooking> deleteFlatBooking(int bookingNo, Flat flat) throws
	  FlatBookingNotFoundException;
	 
	public List<FlatBooking> viewFlatBooking(int bookingNo, Flat flat) throws
	  FlatBookingNotFoundException;
	 
	 
	
}
