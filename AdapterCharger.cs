using System;

public class ChargerAdapter : ICharger
{
    IPhone ip = new IPhone();

    public void Power(string str)
    {
        ip.Display(str);
    }
}

public class Charging
{
    private ICharger ch;

    public ICharger Ch
    {
        get { return ch; }
        set { ch = value; }
    }

    public void Charge(string str)
    {
        ch.Power(str);
    }
}

public interface ICharger
{
    void Power(string str);
}

public class IPhone
{
    public void Display(string str)
    {
        Console.WriteLine(str);
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        ICharger ch = new ChargerAdapter();
        Charging charging = new Charging();
        charging.Ch = ch;
        charging.Charge("58 Charging");
    }
}
