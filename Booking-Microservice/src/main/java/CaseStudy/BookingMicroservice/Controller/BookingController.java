package CaseStudy.BookingMicroservice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CaseStudy.BookingMicroservice.Repository.BookingRepository;
import CaseStudy.BookingMicroservice.Services.BookingServiceImpl;
import CaseStudy.BookingMicroservice.Services.BookingServices;
import CaseStudy.BookingMicroservice.entity.BookingDetails;
@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	BookingRepository rp;
	
	@Autowired
	BookingServiceImpl s;
	
		@GetMapping("/book/{name}")
		public String add(@PathVariable String name) {
			
			try {
				BookingDetails ba=s.add(name);
				String fid=ba.getFid();
				BookingDetails b2=rp.get(fid, name);
				if(b2==null) {
					rp.insert(ba);
					return "ticket is booked."+"\nname:"+name+"\nclass:"+ba.getFlightClass()+"\npayment:"+ba.getPaymentStatus();
				}
				else
					if(b2.getFid().contentEquals(fid)&&b2.getName().contentEquals(name)) {
						return "dear user a ticket is booked already with same name in same flight.check credentials to avoid financial loss";
					}
					else
						return "unusual exit";

				
			}catch(Exception e) {
				return e.getMessage();
			}	
		}
		
	@GetMapping("/cancel/{fid}/{name}")
		public String cancel(@PathVariable String fid,@PathVariable String name){
			try
		  	{  
		  	rp.delete(fid, name);
		  	return "booking canceled"; 
		  }catch(Exception e) { 
			  return e.getMessage();
			  }
		}
		 
		 @GetMapping("/mybookings/{name}")
		 public List<BookingDetails>getdata(@PathVariable String name){
			 return rp.get(name);
		 }		
	/*
	 * @PostMapping("/flights/book") public String addFlight(@RequestBody
	 * BookingDetails f1) { this.bookingService.addBooking(f1); return
	 * "Added Flight with id: " + f1.getbid(); }
	 * 
	 * @DeleteMapping("/myBookings/delete/{fid}") public String
	 * deleteFlight(@PathVariable String bid) { bookingService.deleteBooking(bid);
	 * return "Deleted Flight with id " + bid; }
	 * 
	 * @GetMapping("/myBookings/{fid}") public Optional<BookingDetails>
	 * getBookingById(@PathVariable String bid){ return
	 * bookingService.getBookingById(bid); }
	 */
}
