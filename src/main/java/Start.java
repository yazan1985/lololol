import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> matiereJeremie = new ArrayList<String>();
        matiereJeremie.add("JAVA");
        matiereJeremie.add("POO");
        Professeurs professeur1 = new Professeurs("DERUETTE", "Jérémie", matiereJeremie, 1);

        ArrayList<String> matiereThierry = new ArrayList<String>();
        matiereThierry.add("C++");
        matiereThierry.add("C#");
        Professeurs professeur2 = new Professeurs("LAGNIET", "Thierry", matiereThierry, 2);

        ArrayList<Professeurs> professeurs = new ArrayList<Professeurs>();
        professeurs.add(professeur1);
        professeurs.add(professeur2);
        Etudiants etudiant1 = new Etudiants("TOTO", "toto", matiereJeremie, 1);
        Etudiants etudiant2 = new Etudiants("TATA", "tata", matiereJeremie, 2);
        Etudiants etudiant3 = new Etudiants("TITI", "titi", matiereThierry, 3);
        Etudiants etudiant4 = new Etudiants("MOMO", "momo", matiereThierry, 4);
        Etudiants etudiant5 = new Etudiants("MAMA", "mama", matiereThierry, 5);
        ArrayList<Etudiants> etudiants = new ArrayList<Etudiants>();

        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        etudiants.add(etudiant3);
        etudiants.add(etudiant4);
        etudiants.add(etudiant5);

        for (Professeurs prof : professeurs) {
            if (prof.getMatieres().contains("JAVA")) {

                for (Integer i = 0; i < prof.getMatieres().size(); i++) {
                    String currentMatiere = prof.getMatieres().get(i);
                    if ("JAVA".contentEquals(currentMatiere)) {
                        System.out.print(currentMatiere + " (");

                        System.out.print(" " + prof.getNom() + " " + prof.getPrenom());
                        for (Etudiants etud : etudiants) {
                            if (etud.getMatieres().contains("JAVA")) {
                                // recherche le PROF
                                System.out.print(" " + etud.getNom());
                            }
                            //System.out.println(" Nom: " + etud.getNom() + " Id: " + etud.getId() + " Prénom: " + etud.getPrenom());

                        }
                    } else {
                        System.out.print(" )");
                    }
                }
                System.out.print("  ");
                System.out.println("");
            }
        }

    }
}
