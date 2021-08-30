package part4.generic;

public class MisutgaruTest {
    public static void main(String[] args) {
        Misutgaru<Milk> misutgaruWithMilk = new Misutgaru<>();
//        var misutgaruWithMilk = new Misutgaru();
        misutgaruWithMilk.setMaterial(new Milk());
        System.out.println(misutgaruWithMilk);

        Misutgaru<Water> misutgaruWithWater = new Misutgaru<>();
        misutgaruWithWater.setMaterial(new Water());
        System.out.println(misutgaruWithWater);

    }
}
