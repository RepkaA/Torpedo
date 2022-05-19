package torpedo;
public class TorpedoTeszt
{
    public static String tesztLoves(int poz)
    {
        Hajo hajo = new Hajo(new int[] {2, 3, 4});
        String t = hajo.talalat(poz);
        assert t.equals("találat"): "Nem jó a találat ellenőrzése.";
        return "";
    }
    
    public static void main(String[] args)
    {
        tesztLoves(4);
    }
}
