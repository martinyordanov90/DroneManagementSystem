package logic;

import java.sql.Timestamp;

import data.Location;

public class DeliveryRequest {
	private int mDeliveryRequestID;
	private Timestamp mDeliveryRequestTimestamp;
	private Location mDeliveryLocation;
	private String[] mProductName;
	private int[] mDeliveryQuantity;

	public DeliveryRequest(int deliveryRequestID, Timestamp deliveryRequestTimestamp, Location deliveryLocation,
			String[] productName, int[] deliveryQuantity) {
		this.mDeliveryRequestID = deliveryRequestID;
		this.mDeliveryRequestTimestamp = deliveryRequestTimestamp;
		this.mDeliveryLocation = deliveryLocation;
		this.mProductName = productName;
		this.mDeliveryQuantity = deliveryQuantity;
	}

	public int getDeliveryRequestID() {
		return mDeliveryRequestID;
	}

	public Timestamp getDeliveryRequestTimestamp() {
		return mDeliveryRequestTimestamp;
	}

	public Location getDeliveryLocation() {
		return mDeliveryLocation;
	}

	public String[] getProductName() {
		return mProductName;
	}

	public int[] getDeliveryQuantity() {
		return mDeliveryQuantity;
	}

}
