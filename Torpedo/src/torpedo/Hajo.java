package torpedo;
public class Hajo
{
    private int[] pozicio = new int[3];
    
    Hajo(int[] poz)
    {
        this.pozicio = poz;
    }
    
    String talalat(int poz)
    {
        for (int p : pozicio)
        {
            if(p == poz)
                return "találat";
        }
        return "nem talált";
    }
}