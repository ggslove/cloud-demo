package yu.warehouseservice.dubbo.service;


import yu.warehouseservice.dubbo.dto.Stock;

// Provider接口
public interface WarehouseService {
    // 查询库存
    public Stock getStock(Long skuId);
}
