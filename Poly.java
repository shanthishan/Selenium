class Vehicle
{
    void colour()
    {
        System.out.println("red");
         }
         void wheel()
         {
             System.out.println("i have wheel");
         }
    }
    class  Car extends Vehicle
    {
        void colour()
        {
            System.out.println("green");
        }

        void capacity()
        {
            System.out.println("seater" );
        }
    }
public class Poly {
    public static void main(String[] args) {
         Vehicle v=new Car();
         v.colour();
         v.wheel();


    }

}
