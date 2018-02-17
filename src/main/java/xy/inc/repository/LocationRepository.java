package xy.inc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import xy.inc.model.Location;
 
public interface LocationRepository extends CrudRepository<Location, Integer>
{
    @Query("select l from Location l where SQRT(POW((?1 - l.coordinate_x), 2) + POW((?2 - l.coordinate_y), 2)) <= ?3")
	List<Location> findByDistance(Integer coordinate_x, Integer coordinate_y, Double distance);
}