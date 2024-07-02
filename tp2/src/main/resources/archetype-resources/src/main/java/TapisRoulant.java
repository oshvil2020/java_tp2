
/**
 * Ce type énuméré décrit les différentes 'type' de tapis roulant.
 * Un type de tapis roulant décrit la forme et la direction du tapis roulant dans
 * une case de la grille.
 * La forme est décrite en indiquant le côté par lequel le tapis roulant arrive dans la case et
 * le côté par lequel le tapis roulant sort de la case.
 * L'ordre des mots dans le nom des constantes indique la direction du tapis roulant.
 * Par exemple, HAUT_DROITE indique une case où le tapis roulant arrive en haut de la case et tourne vers la
 * droite de la case.
 * Il y a deux constantes spéciales :
 * VIDE : indique une case vide.
 * OCCUPE : indique une case qui contient autre chose qu'un tapis roulant.
 */
public enum TapisRoulant {
    VIDE("   ", " . ", "   " ),
    OCCUPE( "xxx", "x.x", "xxx" ),
    HAUT_DROITE( " | ", " >-", "   "),
    HAUT_BAS( " | ", " \u2228 ", " | "),
    HAUT_GAUCHE( " | ", "-< ", "   "),
    DROITE_BAS( "   ", " \u2228-", " | "),
    DROITE_GAUCHE( "   ", "-<-", "   "),
    DROITE_HAUT( " | ", " \u2227-", "   "),
    BAS_GAUCHE( "   ", "-< ", " | "),
    BAS_HAUT( " | ", " \u2227 ", " | "),
    BAS_DROITE( "   ", " >-", " | "),
    GAUCHE_HAUT( " | ", "-\u2227 ", "   "),
    GAUCHE_DROITE( "   ", "->-", "   "),
    GAUCHE_BAS( "   ", "-\u2228 ", " | "),
    ;
    private String afficheHaut;
    private String afficheMilieu;
    private String afficheBas;

    TapisRoulant( String afficheHaut, String afficheMilieu, String afficheBas ) {
        this.afficheHaut = afficheHaut;
        this.afficheMilieu = afficheMilieu;
        this.afficheBas = afficheBas;
    }

    public String afficheHaut() {
        return afficheHaut;
    }

    public String afficheMilieu() {
        return afficheMilieu;
    }

    public String afficheBas() {
        return afficheBas;
    }
}
