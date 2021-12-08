package CaseStudy.FareMicroservice.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import CaseStudy.FareMicroservice.entity.FareDetails;


@Repository
public interface FareRepository extends MongoRepository<FareDetails,String> {
	
	@Query("{'fid':?0}")
	public List<FareDetails>getinfo(String fid);
	@Query("{'fid':?0}")
	public FareDetails getobj(String fid);


}
