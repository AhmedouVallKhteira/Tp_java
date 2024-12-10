package EX2;

public class Segment {

    private Point or;
    private Point ext;

    public Segment (double xOr, double yOr, double xExt, double yExt) {
        this.or.setX(xOr);
        this.or.setY(yOr);
        this.ext.setX(xExt);
        this.ext.setX(yExt);
    }
    public Segment(Point or, Point ext) {
        this.or=or;
        this.ext=ext;
    }

    public double longueur(){
        double d=(this.or.getX()-this.ext.getX())*(this.or.getX()-this.ext.getX());
        d+=(this.or.getY()-this.ext.getY())*(this.or.getY()-this.ext.getY());
        d=Math.sqrt(d);
        return d;
    }

    public void deplaceOrigine (double dx, double dy) {
        double x=this.or.getX();
        double y=this.or.getY();
        this.or.setX(x+dx);
        this.or.setY(y+dy);
    }

    public void deplaceExtremite (double dx, double dy) {
        double x=this.ext.getX();
        double y=this.ext.getY();
        this.ext.setX(x+dx);
        this.ext.setY(y+dy);
    }

    public void affiche(){
        System.out.println("Or");
        or.affiche();
        System.out.println("Ext");
        ext.affiche();
    }
}