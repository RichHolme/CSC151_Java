
public class Room {
	
	private int area = 0;
	
	public Room (int area) {
		this.area = area;
	}
	
	public int getSquareFeet() {
		return area;
	}
	
	public int getCapacity() {
		return getSquareFeet() / 9;
	}
	
	public String toString() {
		return "Square feet: " + getSquareFeet() + " capacity: " + getCapacity();
	}
	
}
