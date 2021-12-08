package CaseStudy.SearchMicroservice.Entity;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "fareDetails")
public class SearchDetails {
	private String startPoint;
	private String endPoint;
	private String flightNumber;
	private int economyClass;
	private int premiumEconomy;
	private int businessClass;
	private String flightDate;
	private String timing;

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getEconomyClass() {
		return economyClass;
	}

	public void setEconomyClass(int economyClass) {
		this.economyClass = economyClass;
	}

	public int getPremiumEconomy() {
		return premiumEconomy;
	}

	public void setPremiumEconomy(int premiumEconomy) {
		this.premiumEconomy = premiumEconomy;
	}

	public int getBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(int businessClass) {
		this.businessClass = businessClass;
	}

	public SearchDetails(String flightDate, String startPoint, String endPoint, String flightNumber, int economyClass,
			int premiumEconomy, int businessClass, String timing) {
		super();
		this.flightDate = flightDate;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.flightNumber = flightNumber;
		this.economyClass = economyClass;
		this.premiumEconomy = premiumEconomy;
		this.businessClass = businessClass;
		this.timing = timing;
	}

	public SearchDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SearchDetails [flightDate=" + flightDate + ", startPoint=" + startPoint + ", endPoint=" + endPoint
				+ ", flightNumber=" + flightNumber + ", economyClass=" + economyClass + ", premiumEconomy="
				+ premiumEconomy + ", businessClass=" + businessClass + ", timing=" + timing + "]";
	}

}
