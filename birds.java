/*
     Author : Vinit Patel.
  - Define an interface bird having the methods of food() and voice().
  - Define two classes sparrow and peacock to implement the interface bird.
  - Write a program to test the sparrow and peacock classes. 
 */
interface bird 
{
   public void food();
   public void voice();
}
class sparrow implements bird
{
   public void food()
    {
        System.out.println("This is Sparrow Food");
    }
    public void voice()
    {
        System.out.println("This is Sparrow Voice");
    } 
}
class peacock implements bird
{
   public void food()
    {
        System.out.println("This is Peacock Food");
    }
    public void voice()
    {
        System.out.println("This is Peacock Voice");
    } 
}
class birds
{
     public static void main(String[] args) 
    {
        sparrow s = new sparrow();
        s.food();
        s.voice();
        peacock p = new peacock();
        p.food();
        p.voice();
    }
}