package data;

public class ProductQuantityPair {
	private Product mProduct;
	private int mQuantity;
	
	public ProductQuantityPair(){
		this.mProduct = new Product();
		this.mQuantity = 0;
	}
	
	public ProductQuantityPair(Product product,int quantity){
		this.mProduct = product;
		this.mQuantity = quantity;
	}

	public Product getProduct() {
		return mProduct;
	}

	public void setProduct(Product product) {
		this.mProduct = product;
	}

	public int getQuantity() {
		return mQuantity;
	}

	public void setQuantity(int quantity) {
		this.mQuantity = quantity;
	}
	
	
}
