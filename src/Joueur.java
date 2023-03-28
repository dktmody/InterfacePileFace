public class Joueur implements IJoueur, IScore {
    private String nom;
    private int score;
    private String choix;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }
    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean estGagnant() {
        return false;
    }

    @Override
    public int vaut() {
        return 0;
    }
}
