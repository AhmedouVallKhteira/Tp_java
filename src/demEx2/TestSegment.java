package demEx2;

public class TestSegment {
    public static  void main(String [] args){
        Point p1= new Point(2,3);
        Point p2= new Point(-1,5);
        Segment s1= new Segment(p1,p2);
        System.out.println("S1 ");
        s1.affiche();
        System.out.println("distance : "+s1.longuer());
        Segment s2= new Segment(2,4,5,1);



    }
}
