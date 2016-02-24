package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Drone {
	private int mID;
	private double mBattery;
	private double mCapacity;
	private double mChargingRate;
	
	public Drone(){
		this.mBattery = 2000;
		this.mCapacity = 500;
		this.mChargingRate = 5;
	}
	
	public Drone(int id , double battery,double capapacity,double chargingRate){
		this.mID = id;
		this.mBattery = battery;
		this.mCapacity = capapacity;
		this.mChargingRate = chargingRate;
	}

	public int getID() {
		return mID;
	}

	public void setID(int id) {
		mID = id;
	}

	public double getBattery() {
		return mBattery;
	}

	public void setBattery(double battery) {
		this.mBattery = battery;
	}

	public double getCapacity() {
		return mCapacity;
	}

	public void setCapacity(double capacity) {
		this.mCapacity = capacity;
	}

	public double getChargingRate() {
		return mChargingRate;
	}

	public void setChargingRate(double chargingRate) {
		this.mChargingRate = chargingRate;
	}
	
	public void updateDroneData(DatabaseConnectionUtilities connectionUtility) throws SQLException{
		Connection link = connectionUtility.connect();
		PreparedStatement statement = null;
		String query = "UPDATE drones SET battery = ? WHERE id = ? ";
		statement = link.prepareStatement(query);
		statement.setDouble(1, this.mBattery);
		statement.setInt(2,this.mID);
		statement.executeUpdate();
		link.close();
	}
	
}
