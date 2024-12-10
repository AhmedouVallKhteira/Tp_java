package EX3;

public class util {
    public static void main(String [] args ){
        Etudiant e1 =new Etudiant("23010","Ahmed","Med","dsi");
        Etudiant e2 =new Etudiant("23010","Ahmed","Med","dsi");
        e1.afficher();
        e2.afficher();
        ElementModul em1= new ElementModul("DSI12","OOP JAVA",3,4,3);
        ElementModul em2= new ElementModul("DSI13","Python",3,3,2);
        Note n1=new Note(e1,em1,12);
        n1.affiche();




    }

}
