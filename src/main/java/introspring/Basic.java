package introspring;

import java.util.List;

public class Basic {

	private int rollno;
	private String name;
	private List<String> list;
	private Language l;
	public Language getL() {
		return l;
	}
	public void setL(Language l) {
		this.l = l;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Basic [rollno=" + rollno + ", name=" + name + ", list=" + list + ", l=" + l + "]";
	}
	
	
	
	
}
