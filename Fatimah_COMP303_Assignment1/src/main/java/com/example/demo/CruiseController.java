package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CruiseController {

	@GetMapping("/booking")
    public String showBookingPage() {
        return "booking"; // assuming "booking.html" is your booking page
    }

	@RequestMapping("/bookNow")
	public String bookNow(@ModelAttribute("bookingForm") Cruise cruise, Model m) {
		double initialPrice = cruise.calculatePrice();
		double price = initialPrice * cruise.getStaterooms();
		double discount = cruise.calculateDiscount();
		double tax = cruise.calculateTax();
    
		double totalPrice = (price - discount) + tax;
		
		m.addAttribute("firstName", cruise.getFirstName());
		m.addAttribute("lastName", cruise.getLastName());
		m.addAttribute("areaCode", cruise.getAreaCode());
		m.addAttribute("phoneNumber", cruise.getPhoneNumber());
		m.addAttribute("address1", cruise.getAddress1());
		m.addAttribute("city", cruise.getCity());
		m.addAttribute("province", cruise.getProvince());
		m.addAttribute("country", cruise.getCountry());
		m.addAttribute("email", cruise.getEmail());
		m.addAttribute("staterooms", cruise.getStaterooms());
		m.addAttribute("stateroomType", cruise.getStateroomType());
		m.addAttribute("guests", cruise.getGuests());
		m.addAttribute("price", initialPrice);
		m.addAttribute("totalPrice", totalPrice);
		m.addAttribute("discount", discount);
		m.addAttribute("tax", tax);
		
		return "show-cruise";
	}
}
