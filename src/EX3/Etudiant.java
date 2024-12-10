package EX3;

public class Etudiant {

    private int id;
    private String matricule;
    private String prenom;
    private String nom;
    private String departement;
    private static int cont=1;

    public Etudiant(String matricule, String prenom,String nom ,String departement){
        this.id=cont;
        this.matricule=matricule;
        this.prenom=prenom;
        this.nom=nom;
        this.departement=departement;
        cont ++;
    }
    public int getId(){
        return this.id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void afficher(){
        System.out.println("ID : "+id+ "; matricule : "+matricule+"; prenom : "+prenom+"; nom : "+nom+"; dep : "+departement);
    }
}
