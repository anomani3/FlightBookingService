package CaseStudy.BookingMicroservice.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import CaseStudy.BookingMicroservice.entity.BookingDetails;

@FeignClient(name="demo",url="http://localhost:8091/fare/")
public interface BookingServices {
	/*
	 * public void deleteBooking(String fId); public void addBooking(BookingDetails
	 * f1); public Optional<BookingDetails> getBookingById(String fId);
	 */
	
	@GetMapping("/id")
	public String getid() ;
	@GetMapping("/class")
	public String getclass();
	@GetMapping("/fare")
	public String fare();
}
