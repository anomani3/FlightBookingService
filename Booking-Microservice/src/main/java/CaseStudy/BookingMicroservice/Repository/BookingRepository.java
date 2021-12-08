package CaseStudy.BookingMicroservice.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import CaseStudy.BookingMicroservice.entity.BookingDetails;

@Repository
public interface BookingRepository  extends MongoRepository<BookingDetails,String> {
	
	@Query("{'name':?0}")
	public List<BookingDetails> get(String name);
	
	@Query("{'fid':?0,'name':?1}")
	public BookingDetails get(String fid,String name);
	
    @Query(value="{'fid' : ?0,'name':?1}", delete = true)
    public BookingDetails delete(String fid,String name);
}
