package CaseStudy.BookingMicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bookings")
public class BookingDetails {
	
	@Id
	private String fid;
	
	//private String ticketNo;
	//private String flightNumber;
	private String fare;	
    private	String flightClass;
    private String status;
	private String name;
    public String getPaymentStatus() {
	return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	private String paymentStatus;
    
	/*
	 * public String getTicketNo() { return ticketNo; } public void
	 * setTicketNo(String ticketNo) { this.ticketNo = ticketNo; } public String
	 * getFlightNumber() { return flightNumber; } public void setFlightNumber(String
	 * flightNumber) { this.flightNumber = flightNumber; } public String getbid() {
	 * return bid; } public void setbid(String fid) { this.bid = bid; }
	 */
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	
	public BookingDetails(String fid, String fare, String flightClass, String status, String name,
			String paymentStatus) {
		super();
		this.fid = fid;
		this.fare = fare;
		this.flightClass = flightClass;
		this.status = status;
		this.name = name;
		this.paymentStatus = paymentStatus;
	}
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookingDetails [fid=" + fid + ", fare=" + fare + ", flightClass=" + flightClass + ", status=" + status
				+ ", name=" + name + ", paymentStatus=" + paymentStatus + "]";
	}
	
	

	/*
	 * public String getPaymentStatus() { return paymentStatus; } public void
	 * setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus;
	 * }
	 */
	/*
	 * public BookingDetails(String ticketNo, String bid, String flightNumber,
	 * String fare, String flightClass, String status, String name, String
	 * paymentStatus) { super(); this.ticketNo = ticketNo; this.bid = bid;
	 * this.flightNumber = flightNumber; this.fare = fare; this.flightClass =
	 * flightClass; this.status = status; this.name = name; this.paymentStatus =
	 * paymentStatus; } public BookingDetails() { super(); // TODO Auto-generated
	 * constructor stub }
	 * 
	 * @Override public String toString() { return "BookingDetails [ticketNo=" +
	 * ticketNo + ", bid=" + bid + ", flightNumber=" + flightNumber + ", fare=" +
	 * fare + ", flightClass=" + flightClass + ", status=" + status + ", name=" +
	 * name + ", paymentStatus=" + paymentStatus + "]"; }
	 */
	
}
