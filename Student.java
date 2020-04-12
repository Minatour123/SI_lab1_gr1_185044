import java.util.ArrayList;
import java.util.List;
class Student {
	String index;
	String firstName;
	String lastName;
	public class ListAddPoeni {

		public static void main(int[] args) {

			List<int> poeni = new ArrayList<>();

			poeni.add(25);
			poeni.add(15);
			poeni.add(10);
			poeni.add(30);
			poeni.add(50);
			System.out.println(poeni);
		}
	}
	//TODO constructor

	public Student() {
	}

	//TODO seters & getters


	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAverage() {
		//TODO
	}

	public boolean hasSignature() {
		//TODO
	}
}
