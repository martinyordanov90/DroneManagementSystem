package data;

public class Location {
	private double mXCoordinate;
	private double mYCoordinate;
	
	public Location(){
		this.mXCoordinate = 0;
		this.mYCoordinate = 0;
	}
	
	public Location(double xCoordinate,double yCoordinate){
		this.mXCoordinate = xCoordinate;
		this.mYCoordinate = yCoordinate;
	}

	public double getxCoordinate() {
		return mXCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.mXCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return mYCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.mYCoordinate = yCoordinate;
	}
	
}
