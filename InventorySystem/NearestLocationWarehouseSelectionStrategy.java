package InventorySystem;

import java.util.List;

public class NearestLocationWarehouseSelectionStrategy implements WarehouseSelectionStrategy {

    @Override
    public Warehouse selectWarehouse(List<Warehouse> warehouseList) {
        return warehouseList.get(0);
    }
}
