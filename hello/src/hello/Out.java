package hello;

public class Out {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public class In {
		public In() {
			id = 1;
			name = "cxg";
		}
		public void display() {
			System.out.println(getName()+getId());
		}
	}
	public static void main(String[] args) {
		Out o = new Out();
		Out.In oi = o.new In();
		oi.display();
	}

}
