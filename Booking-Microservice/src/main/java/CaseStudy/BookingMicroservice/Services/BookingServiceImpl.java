package CaseStudy.BookingMicroservice.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CaseStudy.BookingMicroservice.entity.BookingDetails;
@Service
public class BookingServiceImpl {
	
	@Autowired
	BookingServices bs1;
	
	String fid,fare,fclass,status,name;
	
	public BookingDetails add(String name) {
		this.fid=bs1.getid();
		this.fare=bs1.fare();
		this.fclass=bs1.getclass();
		status="booked";
		this.name=name;
		BookingDetails b1=new BookingDetails(fid,fare,fclass,status,name,"NoPayment");
		return b1;
	}
	
	/*@Autowired
	private BookingRepository bookingRepository;

	@Override
	public void addBooking(BookingDetails f1) {
		bookingRepository.save(f1);
	}
	
	@Override
	public void deleteBooking(String bid) {
		bookingRepository.deleteById(bid);
	}

	@Override
	public Optional<BookingDetails> getBookingById(String bid) {
		return bookingRepository.findById(bid);

	}*/
	
}
