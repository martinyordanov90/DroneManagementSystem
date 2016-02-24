package data;

public class Product {
	private String mName;
	private double mProductWeightPerQuantityUnit;
	
	public Product(){
		this.mName = null;
		this.mProductWeightPerQuantityUnit = 0;
	}
	
	public Product (String name , double productWeightPerQuantityUnit){
		this.mName = name;
		this.mProductWeightPerQuantityUnit = productWeightPerQuantityUnit;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public double getProductWeightPerQuantityUnit() {
		return mProductWeightPerQuantityUnit;
	}

	public void setProductWeightPerQuantityUnit(double productWeightPerQuantityUnit) {
		this.mProductWeightPerQuantityUnit = productWeightPerQuantityUnit;
	}
	
}
 