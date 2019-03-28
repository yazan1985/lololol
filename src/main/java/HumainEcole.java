import java.util.ArrayList;

public class HumainEcole {

    private String nom;
    private String prenom;
    private ArrayList<String> matieres = new ArrayList<String>();
    private boolean role;

    public HumainEcole(String nom, String prenom, ArrayList<String> matieres, boolean role) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.matieres = matieres;
        this.role = role;
    }

    public boolean EcrireAuTableau() {

        return (true);
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the matieres
     */
    public ArrayList<String> getMatieres() {
        return matieres;
    }

    /**
     * @param matieres the matieres to set
     */
    public void setMatieres(ArrayList matieres) {
        this.matieres = matieres;
    }

    /**
     * @return the role
     */
    public boolean isRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(boolean role) {
        this.role = role;
    }

}
