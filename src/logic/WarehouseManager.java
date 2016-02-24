package logic;

import java.util.LinkedList;

import data.Warehouse;

public class WarehouseManager implements WarehouseManagerInterface{
	private LinkedList<Warehouse> mWarehouses;
	
	public WarehouseManager(Warehouse warehouse){
		this.mWarehouses = new LinkedList<Warehouse>();
	}
	
	public WarehouseManager(LinkedList<Warehouse> warehouses){
		this.mWarehouses = warehouses;
	}
	
	public LinkedList<Warehouse> getWarehousesList(){
		return this.mWarehouses;
	}
	
	@Override
	public void makeSupply(SupplyRequest supplyRequest) {
		// TODO Auto-generated method stub
		
	}

}
