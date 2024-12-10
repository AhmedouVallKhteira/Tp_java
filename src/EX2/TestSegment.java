package EX2;

public class TestSegment {

    public static void main(String[] args) {
        Point p1=new Point(1,4);
        Point p2=new Point(2,3);

        System.out.println("p1 et p2");
        p1.affiche();
        p2.affiche();

        Segment s1=new Segment(p1,p2);
        System.out.println("Segment Initial");
        s1.affiche();
        System.out.println("distance : "+s1.longueur());
        System.out.println("on deplace Extrimite");
        s1.deplaceExtremite(1, 1);
        s1.affiche();
        System.out.println("distance : "+s1.longueur());
        System.out.println("on deplace Origine");
        s1.deplaceOrigine(1, 1);
        s1.affiche();
        System.out.println("distance : "+s1.longueur());
        System.out.println("p1 et p2");
        p1.affiche();
        p2.affiche();
    }

}