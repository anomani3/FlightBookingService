package CaseStudy.SearchMicroservice.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import CaseStudy.SearchMicroservice.Entity.SearchDetails;

public interface SearchRepository extends MongoRepository<SearchDetails, String> {

	public List<SearchDetails> findByStartPointAndEndPointAndFlightDate(String startPoint, String endPoint,String flightDate);

}
