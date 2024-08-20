



class Book {
	
	int cost;//member variable//global variable//non static variable
	
	
	void printCost() {
		
		int cost=56;
		this.cost=34;
		System.out.println("Local cost :"+cost);
		System.out.println("Global cost :"+this.cost);
		
	}
	
	public static void main(String[] args) {
		
		Book b=new Book();
		b.printCost();
		
	}
	
	
}
