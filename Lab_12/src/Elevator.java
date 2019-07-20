
public class Elevator extends Room{
	
	private int floor = 0;
	
	public Elevator (int area) {
		super(area);
	}
	
	public void up (int floor) {
		this.floor += floor;
	}
	
	public void down (int floor) {
		this.floor -= floor;
	}
	
	public String toString() {
		return "Square feet: " + getSquareFeet() + " capacity: " + getCapacity() + " current floor: " + floor;
	}

}
