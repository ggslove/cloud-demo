package yu.seataorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yu.seataorder.jpa.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
