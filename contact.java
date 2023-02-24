import java.util.*;
class list
{
  double phoneno;
  String emailid;
  list(double phoneno,String emailid)
  {
    this.phoneno=phoneno;
    this.emailid=emailid;
  }
  public String toString() {
    return "  Phone Number : " + phoneno + " Email ID : " + emailid;
}
}
class contact
{
  public static void main(String args[])
  {
  Scanner sc =new Scanner(System.in);
  Hashtable<String,list> ht=new Hashtable<>();
  System.out.println("WELCOME TO MY CONTACT LIST");
  while(true)
  {
    System.out.println("1.Add Contact    2.Delete Contact     3.Search Contact    4.View Contact    5.Exit");
    System.out.print("Enter your choice:");
    int ch=sc.nextInt();
    switch(ch)
    {
      case 1:
      {
        System.out.print("Enter Name:");
        String name=sc.next();
        System.out.print("Enter Number:");
        double Number=sc.nextDouble();
        System.out.print("Enter E-mail ID:");
        String email=sc.next();
        list ls=new list(Number, email);
        ht.put(name,ls);
        System.out.println("Contact Added successfully!!");
      }break;
      case 2:
      {
        System.out.print("Enter Name:");
        String name=sc.next();
        if(ht.containsKey(name))
        {
        ht.remove(name);
        System.out.println("Contact deleted successfully!!");
        }
        else
        System.out.println("Contact dose NOT Contain!!");
      }break;
      case 3:
      {
        System.out.print("Enter Name:");
        String name=sc.next();
        if(ht.containsKey(name))
        {
          System.out.println(ht.get(name));
          System.out.println("Contact founded!!");
        }
        else
        {
          System.out.println("Contact NOT FOUND!!");
        }
      }break;
      case 4:
      {
        
        System.out.println(ht);

      }break;
      case 5:
      {
        System.exit(0);
      }
      default:
      {
        System.out.println(" Invalid Choice");
      }break;
    }
  }
  }
}