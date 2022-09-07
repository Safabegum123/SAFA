package day5;

public class Employee {
    int eid;
    String ename;
    double sal;
    int deptno;
    String job;


    void display() {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(sal);
        System.out.println(deptno);
        System.out.println(job);
    }

    public static void main(String[] args) {
        Employee ep1= new Employee();
        ep1.eid=101;
        ep1.ename="David";
        ep1.sal=2333.33;
        ep1.deptno=10;
        ep1.job="Manager";
        ep1.display();
        
    }
}
