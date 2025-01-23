package InventorySystem;

import java.util.List;

public class CheapestPriceWarehouseSelectionStrategy implements WarehouseSelectionStrategy {

    @Override
    public Warehouse selectWarehouse(List<Warehouse> warehouseList) {
        return warehouseList.get(0);
    }
}
