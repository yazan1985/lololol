import java.util.ArrayList;

public class Professeurs extends HumainEcole {

    private int id;

    public Professeurs(String nom, String prenom, ArrayList<String> matieres, int id) {
        super(nom, prenom, matieres, true);
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
