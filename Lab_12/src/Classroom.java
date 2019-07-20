
public class Classroom extends Room{
	
	private int chairs = 0;
	
	public Classroom(int area){
		super(area);
	}
	
	public Classroom(int area, int chairs) {
		super(area);
		this.chairs = chairs;
	}
	
	public int getChairs() {
		return chairs;
	}
	
	public void setChairs(int chairs) {
		this.chairs = chairs;
	}
	
	public int getCapacity() {
		return chairs;
	}
	
	public String toString() {
		return "Square feet: " + getSquareFeet() + " capacity: " + getCapacity() + " chairs: " + getChairs();
	}
	
}
