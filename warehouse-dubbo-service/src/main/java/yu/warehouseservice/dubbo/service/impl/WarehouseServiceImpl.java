package yu.warehouseservice.dubbo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import yu.warehouseservice.dubbo.dto.Stock;
import yu.warehouseservice.dubbo.service.WarehouseService;

import java.util.HashMap;
import java.util.Map;

@DubboService
public class WarehouseServiceImpl implements WarehouseService {
    @Override
    public Stock getStock(Long skuId) {
        Map result = new HashMap();
        Stock stock = null;
        if(skuId == 1101l){
            //模拟有库存商品
            stock = new Stock(1101l, "Apple iPhone 11 128GB 紫色", 32, "台","Apple 11 紫色版对应商品描述");
        }else if(skuId == 1102l){
            //模拟无库存商品
            stock = new Stock(1102l, "Apple iPhone 11 256GB 白色", 0, "台","Apple 11 白色版对应商品描述");
        }else{
            //演示案例，暂不考虑无对应skuId的情况
        }
        return stock;
    }
}
