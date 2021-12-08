package CaseStudy.SearchMicroservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CaseStudy.SearchMicroservice.Entity.SearchDetails;
import CaseStudy.SearchMicroservice.Repository.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchRepository searchRepo;

	@Override
	public List<SearchDetails> getAllSearch() {
		return searchRepo.findAll();
	}

	public List<SearchDetails> findByStartPointAndEndPointAndFlightDate(String startPoint, String endPoint,String flightDate) {
		return searchRepo.findByStartPointAndEndPointAndFlightDate(startPoint, endPoint, flightDate);
	}

}
