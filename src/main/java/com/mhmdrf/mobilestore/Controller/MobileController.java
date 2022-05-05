package com.mhmdrf.mobilestore.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mhmdrf.mobilestore.Dao.MobileStore;
import com.mhmdrf.mobilestore.Entity.Mobile;
import com.mhmdrf.mobilestore.Entity.User;
import com.mhmdrf.mobilestore.Service.MobileService;
import com.mhmdrf.mobilestore.Service.UserService;

@Controller
@RequestMapping(path = "/mobilestore")
public class MobileController {
		
	@Autowired
	MobileService mobileService;
	
	
	
	@CrossOrigin
	@PostMapping(path="/addmobile")
	public @ResponseBody String AddNewMobile(@RequestBody Mobile mobile) {
		return mobileService.addMobile(mobile);		
	}
	
	@CrossOrigin
	@GetMapping(path= "/getmobiles")
	public @ResponseBody Iterable<Mobile> GetAllMobiles() {
		return mobileService.getAllMobiles();
	}	
	
	@GetMapping(path= "/searchmobile/{keyword},{catagory}")
	public @ResponseBody Optional<List<Mobile>> searchMobile(@PathVariable("keyword") String keyword, @PathVariable("catagory") String catagory) {
		return mobileService.searchMobile(keyword, catagory);
		
	}
	
	@DeleteMapping(path="/deleteMobile/{id}")
	public @ResponseBody String DeleteMobile(@PathVariable ("id") int id){
		mobileService.deleteMobile(id);
		return "Phone Deleted";
	}
	
}
