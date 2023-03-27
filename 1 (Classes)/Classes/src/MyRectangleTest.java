public class MyRectangleTest
{
    public static void main(String[] args)
    {
        OurRectangle r1 = new OurRectangle(1,2,8,6);
        OurRectangle r2 = new OurRectangle(1,4,9,3);


        System.out.println("toString Test: " + (r1.toString().equals("base: (1,2) w:8 h:6")? "Passed" : "Failed"));

        System.out.println("Area Test: " + (r1.area()==48 ? "Passed" : "Failed"));

        System.out.println("Perimeter Test: " + (r1.perimeter()==28 ? "Passed" : "Failed"));

        System.out.println(OurRectangle.intersection(r1,r2).toString());

        System.out.println("Intersection Test: " + (OurRectangle.intersection(r1,r2).toString().equals("base: (6,4) w:3 h:3")?"Passed":"Failed"));

        System.out.println(OurRectangle.totalPerimeter(r1, r2));

        System.out.println("contains: " + r1.contains(r2));

    }
}