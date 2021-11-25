public class Test {
    public static void main(String[] args)
    {
        Car car = new Car("yellow", 140);
        try {
            checkColor(car);
        }
        catch (ColorException excp)
        {
            System.out.println(excp.getMessage());
        }
        catch (SpeedException excp)
        {
            System.out.println(excp.getMessage());
        }
        catch (Exception excp)
        {
            System.out.println(excp.getMessage());
        }
        finally{
            System.out.println("End of program");
        }
    }

    public static void checkColor(Car car) throws ColorException,
            SpeedException
    {
            if (car.getColor().equals("yellow"))
            {
                throw new ColorException("The car can't be yellow");
            }
            else
            {
                System.out.println("The car is not yellow!");
            }
        if (car.getSpeed() >= 120)
        {
            throw new SpeedException("The speed is too high!");
        }
        else
        {
            System.out.println("Speed is normal!");
        }

    }
}
