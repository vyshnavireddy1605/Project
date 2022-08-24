
public class Transportation 
{
private String vehicle;
private String place;
private double amount;
public Transportation()
{
	
}
public Transportation(String vehicle, String place, double amount) {
	super();
	this.vehicle = vehicle;
	this.place = place;
	this.amount = amount;
}
public String getVehicle() {
	return vehicle;
}
public void setVehicle(String vehicle) {
	this.vehicle = vehicle;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Transportation [vehicle=" + vehicle + ", place=" + place + ", amount=" + amount + "]";
}

}
