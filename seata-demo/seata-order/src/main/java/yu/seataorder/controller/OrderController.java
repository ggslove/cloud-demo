package yu.seataorder.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yu.seataorder.jpa.Order;
import yu.seataorder.service.OrderService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/create_order")
    public String createOrder(Integer orderId, Integer memberId, Integer goodsId, Integer points, Integer quantity) throws JsonProcessingException {
        Map result = new HashMap<>();
        Order order = orderService.createOrder(orderId, memberId, goodsId, points, quantity);
        result.put("code", "0");
        result.put("message", "create order success");
        return new ObjectMapper().writeValueAsString(result);
    }
}
