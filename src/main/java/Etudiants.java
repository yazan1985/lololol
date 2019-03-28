import java.util.ArrayList;

public class Etudiants extends HumainEcole {

    private int id;

    public Etudiants(String nom, String prenom, ArrayList<String> matieres, int id) {
        super(nom, prenom, matieres, false);
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
