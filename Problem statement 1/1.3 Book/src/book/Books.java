package book;
class Book{

	public String title;
    public double price;

    public Book(String title,double price)

    { 
    	this.title=title;
       this.price=price;

    }


	public void getTitle() {
        System.out.println("Title of Book: "+title);
    }

   

    public void getPrice(){
         System.out.println("Price of Book: "+price);
}

    public void setTitle(String title)  {
     this.title=title;
  }

    public void setCost(double price)
  {
     this.price=price;
   }    

    public void show()

    {
        getTitle();
        getPrice();

    }    

}

public class Books {

public static void main(String args[]) {

Book b1=new Book("java Programmimg",350.50);

b1.show();

Book b2=new Book("Let us C",200.00);

b2.show();

}

}