package q1;
// public private protected default 
 class q2 {
	 public int a = 10;
	 private int b = 25;
	 protected int c = 90;
	 int d = 40; //default
	 
	 void show() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		 
	 }
	 public static void main(String[]args) {
		q2 obj = new q2();
		obj.show();
	}
}
