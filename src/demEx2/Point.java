package demEx2;

class Point
{
    private double x, y ;
    public Point (double x, double y) { this.x = x ; this.y = y ;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void deplace (double dx, double dy) { x += dx ; y += dy
    ; }

    public void affiche ()
    { System.out.println ("coordonnees = " + x + " " + y ) ; }

}
