package CaseStudy.SearchMicroservice.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import CaseStudy.SearchMicroservice.Entity.SearchDetails;
import CaseStudy.SearchMicroservice.Repository.SearchRepository;
import CaseStudy.SearchMicroservice.Service.SearchService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private SearchRepository searchRepo;

	@Autowired
	private SearchService searchService;

	// Method name: getAllFlightsDetails
	// Description: This method finds the all flight details available.
	@GetMapping("/findAll")
	@ApiOperation(value = "Get all Flight details")
	public List<SearchDetails> getAllFlightsDetails() {
		return searchService.getAllSearch();
	}

	// Method name: getFlightByStartPointAndEndPointAndFlightDate
	// Description: This method finds the all flights available with respect to
	// startPoint,endPoint and date.
	@GetMapping("/find/")
	@ApiOperation(value = "Get Flight details by StartPoint ,EndPoint,FlightDate")
	public List<SearchDetails> getFlightByStartPointAndEndPointAndFlightDate(
			@RequestParam(value = "startPoint") String startPoint, @RequestParam(value = "endPoint") String endPoint,
			@RequestParam(value = "flightDate") String flightDate) {
		return searchRepo.findByStartPointAndEndPointAndFlightDate(startPoint, endPoint, flightDate);
	}

}
