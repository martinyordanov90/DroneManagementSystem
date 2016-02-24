package data;

import java.util.LinkedList;

public class Warehouse {
	private LinkedList<ProductQuantityPair> mProduct;
	private Location mWarehouseLocation;
	
	public Warehouse(){
		this.mProduct = null;
		this.mWarehouseLocation = new Location();
	}
	public Warehouse(ProductQuantityPair product,Location location){
		this.mProduct = new LinkedList<ProductQuantityPair>();
		this.mProduct.add(product);
		this.mWarehouseLocation = location;
	}
	
	public Warehouse(LinkedList<ProductQuantityPair> product,Location location){
		this.mProduct = product;
		this.mWarehouseLocation = location;
	}
	public Location getWarehouseLocation() {
		return mWarehouseLocation;
	}
	public void setWarehouseLocation(Location mWarehouseLocation) {
		this.mWarehouseLocation = mWarehouseLocation;
	}
	public LinkedList<ProductQuantityPair> getProduct() {
		return mProduct;
	}
	
}
