
public class RoomTester {
	public static void main(String[] args) {
		
		Room class1 = new Classroom(198);
		Room class2 = new Classroom(349, 40);
		
		Room elevator = new Elevator(50);
		
		((Classroom) class1).setChairs(200);
		
		((Elevator) elevator).up(10);
		((Elevator) elevator).down(5);
		((Elevator) elevator).down(1);
		((Elevator) elevator).up(6);

		System.out.println(((Classroom) class2).getChairs());
		System.out.println(class1.getCapacity());
		System.out.println(class2.getCapacity());
		System.out.println(class1.getSquareFeet());
		System.out.println(class2.getSquareFeet());
		System.out.println(elevator.getSquareFeet());
		
		System.out.println(class1);
		System.out.println(class2);
		System.out.println(elevator);
		
	}
}
