package com.mhmdrf.mobilestore.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhmdrf.mobilestore.Constants.Constants;
import com.mhmdrf.mobilestore.Dao.MobileStore;
import com.mhmdrf.mobilestore.Entity.Mobile;

@Service
public class MobileService {
	
	@Autowired
	MobileStore ms;
	
	@Autowired
	Constants constants;

	public String addMobile(Mobile mobile) {
		Optional<Mobile> tempMobile = ms.findByNameAndBrandAndSize(mobile.getName(), mobile.getBrand(),
																mobile.getSize());
		int quantity;
		int id;
		if(tempMobile.isPresent()) {
			quantity = tempMobile.get().getQuantity();
			id = tempMobile.get().getId();
			mobile.setQuantity(mobile.getQuantity()+quantity);
			ms.updateQuantity(id, quantity);
			return "Phone already exist. Increased the Quantity with"+quantity;
		}else{
			ms.save(mobile);
			return "Phone added Successfully";
		}
		
	}
	
	public List<Mobile> getMobiles(){
		return ms.findAll();
	}
	
	public Optional<List<Mobile>> searchMobile(String keyword,String catagory){
		if (catagory.equals(constants.NAME))
			return Optional.of(ms.findByName(keyword));
		if (catagory.equals(constants.BRAND))
			return Optional.of(ms.findByBrand(keyword));
		if (catagory.equals(constants.COLOR))
			return Optional.of(ms.findByColor(keyword));
		if (catagory.equals(constants.SIZE))
			return Optional.of(ms.findBySize(Integer.parseInt(keyword)));
		else
			return null;
	}
	


	
}
