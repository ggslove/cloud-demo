package yu.seataorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yu.seataorder.jpa.Order;
import yu.seataorder.repository.OrderRepository;

import javax.transaction.Transactional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public Order createOrder(Integer orderId, Integer memberId, Integer goodsId, Integer points, Integer quantity) {
        return orderRepository.save(new Order(orderId, memberId, goodsId, points, quantity));
    }
}
