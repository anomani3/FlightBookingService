package CaseStudy.FareMicroservice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import CaseStudy.FareMicroservice.Repository.FareRepository;
import CaseStudy.FareMicroservice.Services.FareService;
import CaseStudy.FareMicroservice.Services.FareServiceImpl;
import CaseStudy.FareMicroservice.entity.FareDetails;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/fare")
public class FareController {

	@Autowired
	private FareServiceImpl fareService;
	
	@Autowired
	private  FareRepository rp;

	// Method name: getAllFlightsDetails
	// Description: This method finds the all flight details available.
	@GetMapping("/findAll")
	@ApiOperation(value = "Get all Flight details")
	public List<FareDetails> getAllFlightsDetails() {
		return fareService.getAllFlights();
	}

	// Method name: addNewFlight
	// Description: This method adds the new flight details.
	@PostMapping("/flight/add")
	@ApiOperation(value = "Add Flight details")
	public String addNewFlight(@RequestBody FareDetails f1) {
		try {
			this.fareService.addFlight(f1);
			return "Added Flight with id: " + f1.getfId();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Operation Failed";
	}

	// Method name: removeFlight
	// Description: This method deletes the flight by gives fId.
	@DeleteMapping("delete/{fId}")
	@ApiOperation(value = "Delete Flight details")
	public String removeFlight(@PathVariable String fId) {
		fareService.deleteFlight(fId);
		return "Deleted Flight with id " + fId;
	}

	// Method name: updateExistingFlight
	// Description: This method updates the existing flight with new updates.
	@PutMapping("/update/{fId}")
	@ApiOperation(value = "Upadate Flight details")
	public String updateExistingFlight(@PathVariable String fId, @RequestBody FareDetails fareDetails) {
		fareService.updateFlight(fId, fareDetails);
		return "Updated Flight with id: " + fId;
	}

	// Method name: getFlightById
	// Description: This method finds the flight with fId.
	@GetMapping("/find/{fId}")
	@ApiOperation(value = "Get Flight details by id")
	public Optional<FareDetails> getFlightById(@PathVariable String fId) {
		return this.fareService.getFlightById(fId);
	}
	
	@GetMapping("/{id}/{type}")
	public String getfare(@PathVariable String id,@PathVariable String type) {
		FareDetails f1=rp.getobj(id);
		if(fareService.getdata(f1, type).contentEquals("na")) {
			return "sorry given class is not available in this flight";
		}
		else
		return "your seat is selected.please confirm.\nformat:class,fare\n"+fareService.getdata(f1, type)+","+fareService.fr();
	}
	
	@GetMapping("/{id}/{type}/confirm")
	public String getcon() {
		return "flight id:"+fareService.fid();
	}
	@GetMapping("/id")
	public String getid() {
		return fareService.fid();
	}
	@GetMapping("/class")
	public String getclass() {
		return fareService.fcl();
	}
	@GetMapping("/fare")
	public String fare() {
		return fareService.fr();
	}
}
