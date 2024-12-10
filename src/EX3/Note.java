package EX3;

public class Note {
    private Etudiant etudiant;
    private ElementModul elementModul;
    private double moyenne ;

    public Note(Etudiant etudiant,ElementModul elementModul, double moyenne){
        this.etudiant=etudiant;
        this.elementModul=elementModul;
        this.moyenne=moyenne;
    }

    public void affiche() {
        System.out.println("Matricule: " + this.etudiant.getMatricule() + " ; Element de Module : " + this.elementModul.getCode() + " ; Moyenne : " + this.moyenne);
    }
}
