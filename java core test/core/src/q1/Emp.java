package q1;
//Q1

//701532
class Emp {
    String name = "Prasad";
    double sal = 250000;
    String add = "Mumbai";
    String dept = "IT";

    void display() {
        System.out.println(name);
        System.out.println(sal);
        System.out.println(add);
        System.out.println(dept);
    }

    public String toString() {
        return name + " " + sal + " " + add + " " + dept;
    }

    public static void main(String[] args) {
        Emp e = new Emp();
        e.display();
        System.out.println(e.toString());
    }
}
