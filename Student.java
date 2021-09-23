package geekster;

public class Student {
	
	private int rollno;
	private String name;
	private String email;
	private long phnumber;
	
	public void setrollno(int rollno) {
		this.rollno=rollno;
	}
	public void setrname(String name) {
		this.name=name;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public void setphnumber(long phnumber) {
		this.phnumber=phnumber;
	}
	
	public int getrollno() {
		return rollno;
	}
	public String getname() {
		return  name;
	}
	public String getemail() {
		return email;
	}
	public long getphnumber() {
		return phnumber;
	}

}
