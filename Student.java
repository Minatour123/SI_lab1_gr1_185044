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


