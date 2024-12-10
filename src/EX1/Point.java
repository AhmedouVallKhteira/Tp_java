package EX1;
public class Point {
    private char nom;
    private double x;

    public Point(char nom,double x){
        this.nom=nom;
        this.x=x;
    }
    public void affiche() {
        System.out.println("nom : "+nom +"\nabs= "+x);
    }
    public void translate(double x) {
        this.x+=x;
    }
}