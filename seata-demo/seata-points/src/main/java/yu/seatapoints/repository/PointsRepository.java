package yu.seatapoints.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yu.seatapoints.jpa.Points;

public interface PointsRepository extends JpaRepository<Points, Integer> {


}
