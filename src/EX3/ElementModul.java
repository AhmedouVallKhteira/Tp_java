package EX3;

public class ElementModul {
    private String code;
    private String titre;
    private int semestre;
    private int credis;
    private float coef;

    ElementModul(String code, String titre, int semestre,int credis,float coef ) {
        if (1 <= semestre && semestre <= 6) {
            this.code = code;
            this.titre = titre;
            this.semestre = semestre;
            this.credis=credis;
            this.coef=coef;
        } else {
            System.out.println("semestre de 1 à 6");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getSemestre() {
        return semestre;
    }


}