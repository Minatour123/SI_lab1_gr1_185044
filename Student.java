import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student{
	String index, fName, lName;
	List<Integer> listaPoeni;
	boolean potpis;

	public Student(){
		index=fName=lName="";
		potpis=false;
	}

	public Student(String index, String fName, String lName, boolean potpis){
		this.index = index;
		this.fName = fName;
		this.lName = lName;
		this.listaPoeni = new ArrayList<>();
		this.potpis = potpis;
	}

	public String getIndex(){
		return index;
	}

	public void setIndex(String index){
		this.index = index;
	}

	public String getfName(){
		return fName;
	}

	public void setfName(String fName){
		this.fName = fName;
	}

	public String getlName(){
		return lName;
	}

	public void setlName(String lName){
		this.lName = lName;
	}

	double getAverage(){
		return listaPoeni.stream().mapToDouble(x->x).sum()/listaPoeni.size();
	}

	boolean hasSignature(){
		return potpis;
	}

	void addPoeni(int poeni){
		listaPoeni.add(poeni);
	}

	void dajPotpis(){
		potpis=true;
	}

	@Override
	public String toString(){
		return "Student{" +
				"index='" + index + '\'' +
				", fName='" + fName + '\'' +
				", lName='" + lName + '\'' +
				", listaPoeni=" + listaPoeni +
				", potpis=" + potpis +
				'}';
	}
}

class Course{
	List<Student> studentList;

	public Course(){
		this.studentList = new ArrayList<>();
	}

	void addStudent(Student student){
		studentList.add(student);
	}

	void listStudents(){
		System.out.println("\n========================\n");
		for(Student student : studentList){
			System.out.println(student);
		}
		System.out.println("\n========================\n");
	}

	void addPoeni(String index, int poeni){
		for(Student student:studentList){
			if(student.getIndex().equals(index)){
				student.addPoeni(poeni);
			}
		}
	}

	void dajPotpis(String index){
		for(Student student:studentList){
			if(student.getIndex().equals(index)){
				student.dajPotpis();
			}
		}
	}

	void izbrisiStudent(String index){
		studentList.removeIf(student -> student.getIndex().equals(index));
	}
}

public class Tester{
	public static void main(String[] args) throws IOException{
		Course course = new Course();

		BufferedReader br = new BufferedReader(new FileReader("src/students.csv"));

		String line=br.readLine();
		while(line!=null){
			String[] split = line.split(";");
			Student temp = new Student(split[0], split[1], split[2], false);
			course.addStudent(temp);
			line=br.readLine();
		}

		course.listStudents();

		course.addPoeni("182017", 10);
		course.addPoeni("185044", 5);
		course.dajPotpis("182025");

		course.listStudents();

		course.izbrisiStudent("169420");

		course.listStudents();
	}
}
