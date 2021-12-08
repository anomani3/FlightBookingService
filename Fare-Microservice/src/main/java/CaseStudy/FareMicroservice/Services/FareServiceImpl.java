package CaseStudy.FareMicroservice.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CaseStudy.FareMicroservice.Repository.FareRepository;
import CaseStudy.FareMicroservice.entity.FareDetails;

@Service
public class FareServiceImpl implements FareService {
	

	@Autowired
	private FareRepository fareRepository;

	@Override
	public List<FareDetails> getAllFlights() {
		 return fareRepository.findAll();
	}

	@Override
	public void updateFlight(String fId, FareDetails updatedFlight) {
	fareRepository.save(updatedFlight);
	}
	
	@Override
	public void addFlight(FareDetails f1) {
		fareRepository.save(f1);	
	}

	@Override
	public void deleteFlight(String fId) {
	 fareRepository.deleteById(fId);
	}
	
	@Override
	public Optional<FareDetails> getFlightById(String fId) {
		return fareRepository.findById(fId);
	}
	
	String id;
	String fin="0";
	String fare;
	public String getdata(FareDetails f1,String type) {
		
		id=f1.getfId();
		String t1="economyClass";
		String t2="premiumEconomy";
		String t3="businessClass";
		if(type.equals(t1)) {
			fare=f1.getEconomyClass();
			this.fin=fare;
			this.fin=t1;
			return fin;
		}
		else
			if(type.contains(t2)) {
				fare=f1.getPremiumEconomy();
				this.fin=fare;
				this.fin=t2;
				return fin;
			}
			else
				if(type.contains(t3)) {
					fare=f1.getBusinessClass();
					this.fin=fare;
					this.fin=t3;
					return fin;
				}
					else
						return "na";		
	}
	public String fid() {
		return id;
	}
	public String fcl() {
		return fin;
	}
	public String fr() {
		return fare;
	}
	

}
