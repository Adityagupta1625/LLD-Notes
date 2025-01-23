package InventorySystem;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    private List<Warehouse> warehouses;
    private WarehouseSelectionStrategy warehouseSelectionStrategy;

    public WarehouseController(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        warehouses = new ArrayList<Warehouse>();
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public void removeWarehouse(Warehouse warehouse) {
        warehouses.remove(warehouse);
    }

    public Warehouse selectWarehouse(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
        return this.warehouseSelectionStrategy.selectWarehouse(this.warehouses);
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }
}
