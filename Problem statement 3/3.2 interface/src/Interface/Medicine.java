package Interface;

public class Medicine 
{
    public void displayLabel()
{
    System.out.println("Company : Cadila Healthcare");
    System.out.println("Address : Kanchipuram,Tamilnadu");
}
}
class Tablet extends Medicine
{
     public void displayLabel()
{
     System.out.println("store in a cool dry place");
}
}
class Syrup extends Medicine
{
public void displayLabel()
{
     System.out.println("Consumption as directed by the physician");
}
}
class Ointment extends Medicine
{
     public void displayLabel()
{
     System.out.println("for external use only");
}}

