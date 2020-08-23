package oops_and_Inheritance;
class Author
{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email, char gender)
	{
		this.name=name;
		this.setEmail(email);
		this.setGender(gender);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void showAuthorDetails() {
		System.out.println("Author Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Gender: "+gender);
		
	}
}
class Books
{
	private String name;
	private String author;
	private double price;
	private int qtyinstock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyinstock() {
		return qtyinstock;
	}
	public void setQtyinstock(int qtyinstock) {
		this.qtyinstock = qtyinstock;
	}
}

public class Book {

	public static void main(String[] args) {
		Books b=new Books();
		b.setName("Nivedha");
		System.out.println("Name: "+b.getName());
		Author a=new Author("Swetha","nivesasi.2000@gmail.com",'F');
		a.showAuthorDetails();
		b.setPrice(240.5);
		System.out.println("Price:Rs."+b.getPrice());
		b.setQtyinstock(20);
		System.out.print("Quantity in Stock: "+b.getQtyinstock());

		
		
		
	}

}
