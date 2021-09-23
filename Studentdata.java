package geekster;

public class Studentdata {
	
	public static void main(String []args) {
	
	Student st1=new Student();
	Student st2=new Student();
	Student st3=new Student();
	Student st4=new Student();
	Student st5=new Student();
	
	st1.setrollno(1);
	st1.setrname("Nauman Ansari");
	st1.setemail("485naumanansari@gmai.com");
	st1.setphnumber(740830248);
	
	st2.setrollno(2);
	st2.setrname("Afzal");
	st2.setemail("afzal@gmai.com");
	st2.setphnumber(639324895);
	
	st3.setrollno(3);
	st3.setrname("Faisal");
	st3.setemail("faisali@gmai.com");
	st3.setphnumber(454878189);
	
	st4.setrollno(4);
	st4.setrname("Shoaib");
	st4.setemail("shoaib@gmai.com");
	st4.setphnumber(1689461255);
	
	st5.setrollno(5);
	st5.setrname("Diwakar");
	st5.setemail("diwakar@gmai.com");
	st5.setphnumber(787855255);
	
	System.out.println(st1.getrollno());
	System.out.println(st1.getname());
	System.out.println(st1.getemail());
	System.out.println(st1.getphnumber());
	System.out.println();
	
	System.out.println(st2.getrollno());
	System.out.println(st2.getname());
	System.out.println(st2.getemail());
	System.out.println(st2.getphnumber());
	System.out.println();
	
	System.out.println(st3.getrollno());
	System.out.println(st3.getname());
	System.out.println(st3.getemail());
	System.out.println(st3.getphnumber());
	System.out.println();
	
	System.out.println(st4.getrollno());
	System.out.println(st4.getname());
	System.out.println(st4.getemail());
	System.out.println(st4.getphnumber());
	System.out.println();
	
	System.out.println(st5.getrollno());
	System.out.println(st5.getname());
	System.out.println(st5.getemail());
	System.out.println(st5.getphnumber());
	System.out.println();

	}
}   