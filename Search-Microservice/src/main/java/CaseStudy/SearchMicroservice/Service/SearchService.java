package CaseStudy.SearchMicroservice.Service;


import java.util.List;


import org.springframework.stereotype.Service;

import CaseStudy.SearchMicroservice.Entity.SearchDetails;

@Service
public interface SearchService {

	public List<SearchDetails> getAllSearch();

}
