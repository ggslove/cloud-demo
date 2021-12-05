package yu.seatastorage.service;

import org.springframework.stereotype.Service;
import yu.seatastorage.jpa.Storage;
import yu.seatastorage.repository.StorageRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class StorageService {

    @Resource
    private StorageRepository storageRepository;

    @Transactional
    public Storage reduceStorage(Integer goodsId, Integer quantity) {
        Storage storage = storageRepository.findById(goodsId).get();
        if (storage.getQuantity() < quantity) {
            throw new IllegalStateException(goodsId + "商品库存不足");
        }
        storage.setQuantity(storage.getQuantity() - quantity);
        return storageRepository.save(storage);
    }
}
