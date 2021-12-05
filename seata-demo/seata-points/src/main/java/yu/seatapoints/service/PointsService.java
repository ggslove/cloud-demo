package yu.seatapoints.service;

import org.springframework.stereotype.Service;
import yu.seatapoints.jpa.Points;
import yu.seatapoints.repository.PointsRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class PointsService {

    @Resource
    private PointsRepository orderRepository;

    @Transactional
    public Points addPoints(Integer memberId, Integer points) {
        Points entity = orderRepository.findById(memberId).get();
        entity.setPoints(entity.getPoints() + points);
        return orderRepository.save(new Points(memberId, entity.getPoints()));
    }
}
