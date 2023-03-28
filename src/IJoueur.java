interface IJoueur {
 boolean estGagnant();
}
interface IJeu{
    void demarrerJeu();
}

interface IPiece{
    boolean aFacePourCoteVisite();
    boolean aPilePourCoteVisite();
}
interface IScore{
    int vaut();
}