package demEx2;

public class Segment {
    private Point or;
    private Point ext;

//    le constricteur Segment (on donne deux point )
    public Segment(Point origine,Point extrimite){
        this.or=origine;
        this.ext=extrimite;
    }
//    le constricteur Segment (on donne les cordonnes des points
    public Segment(double xOr, double yOr, double xExt, double yExt){
        this.or= new Point(xOr,yOr);
        this.ext= new Point(xExt,yExt);
    }
//    distnace
    public double longuer(){
        double d=(this.ext.getX()-this.or.getX())*(this.ext.getX()-this.or.getX());
        d+=(this.ext.getY()-this.or.getY())*(this.ext.getY()-this.or.getY());

        return Math.sqrt(d);
    }
    public void deplaceOrigine (double dx, double dy){
     this.or.deplace(dx,dy);
    }

    public void deplaceExtremite (double dx, double dy){
        this.ext.deplace(dx,dy);
    }
    public void affiche(){
        System.out.print ("Or :");
        or.affiche();
        System.out.print("Ext :");
        ext.affiche();
    }
}
