package InventorySystem;

import java.util.List;

public interface WarehouseSelectionStrategy {

    public Warehouse selectWarehouse(List<Warehouse> warehouseList);
}
