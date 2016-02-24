package logic;

import java.sql.Timestamp;

public class SupplyRequest {
	private int mRequestID;
	private Timestamp mRequestTimestamp;
	private String []mProductName;
	private double []mProductWeight;
	private int []mProductQuantity;
	
	public SupplyRequest(int requestID,Timestamp requestTimestamp,String []productName,double []productWeight,int []productQuantity){
	this.mRequestID = requestID;
	this.mRequestTimestamp = requestTimestamp;
	this.mProductName = productName;
	this.mProductQuantity = productQuantity;
	this.mProductWeight = productWeight;
	}

	public int getRequestID() {
		return mRequestID;
	}

	public Timestamp getRequestTimestamp() {
		return mRequestTimestamp;
	}

	public String[] getProductName() {
		return mProductName;
	}

	public double[] getProductWeight() {
		return mProductWeight;
	}

	public int[] getProductQuantity() {
		return mProductQuantity;
	}
	
}
