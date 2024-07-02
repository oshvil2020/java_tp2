
/**
 * Vos NOMS et CODES PERMANENTS ici :
 *
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Usine {
    /*
     * Caractère utilisé pour faire le contour des cadres pour le toString de la grille.
     */
    private static final String SEP_CHAR = "#";

    /*
     * Va contenir la chaine de caractères qui sera placée entre chaque ligne de la grille pour le toString.
     * Elle sera construite une seule fois par instance, afin d'optimiser le code un peu.
     */
    private String fix;

    /**
     * Matrice qui va contenir l'information sur les tapis roulant.
     * La première dimension est utilisé pour les 'y', la deuxième dimension est utilisé pour les 'x'.
     *
     * Exemple : grille[y][x]
     *
     * Vous devez conserver cette variable tel quel.
     */
    protected TapisRoulant [][] grille;

    /**
     * Indique le nombre de case que contiens une ligne de la matrice.
     * Donc, le nombre de colonnes.
     *
     * Vous devez conserver cette variable tel quel.
     */
    protected int tailleX;
    /**
     * Indique le nombre de lignes de la matrice.
     *
     * Vous devez conserver cette variable tel quel.
     */
    protected int tailleY;

    /**
     * Constructeur.
     *
     * Construit une nouvelle grille vide.
     *
     * Vous devez conserver la signature de ce constructeur.
     * Aussi, vous devez conserver le code présent, par contre, vous pouvez ajouter du code à la fin du constructeur.
     * @param tailleX Contiens le nombre de colonne de la matrice.  Doit être plus grand que 0.
     * @param tailleY Contiens le nombre de lignes de la matrice.  Doit être plus grand que 0.
     */
    public Usine( int tailleX, int tailleY ) {
        assert 0 < tailleX;
        assert 0 < tailleY;

        this.tailleX = tailleX;
        this.tailleY = tailleY;
        this.grille = new TapisRoulant[tailleY][tailleX];

        for( int y = 0; y < tailleY; ++ y ) {
            for( int x = 0; x < tailleX; ++ x ) {
                grille[y][x] = TapisRoulant.VIDE;
            }
        }

        fix = Stream.generate( () -> SEP_CHAR )
                .limit( 4 * tailleX + 1 )
                .collect( Collectors.joining( "", "", "\n" ) );

        // Au besoin, vous pouvez ajouter du code ici :

    }

    /**
     * Place un tapis roulant dans une case de la grille.
     *
     * @param x La position en 'x' de la case à modifier.  Cette valeur doit être entre 0 et TailleX - 1.
     * @param y La position en 'y' de la case à modifier.  Cette valeur doit être entre 0 et TailleY - 1.
     * @param type Le type de tapis roulant à placer dans la case.
     * @exception IndexOutOfBoundsException Lancé si 'x' ou 'y' ne sont pas à l'intérieur de la grille.
     */
    public void setTapis( int x, int y, TapisRoulant type ) {

    }

    /**
     * Retourne le type de tapis roulant dans la grille.
     *
     * @param x La position en 'x' de la case à modifier.  Cette valeur doit être entre 0 et TailleX - 1.
     * @param y La position en 'y' de la case à modifier.  Cette valeur doit être entre 0 et TailleY - 1.
     * @exception IndexOutOfBoundsException Lancé si 'x' ou 'y' ne sont pas à l'intérieur de la grille.
     * @return Le type du tapis roulant dans la grille.
     */
    public TapisRoulant getTapis( int x, int y ) {
        return grille[y][x];
    }

    /**
     * Construit un tapis roulant horizontal (sur une ligne) dans la grille.
     *
     * Place des tapis roulant de la case (x1,y) à la case (x2,y) dans la grille.
     * Si x1 < x2, alors ce sont des TapisRoulant.GAUCHE_DROITE.
     * Si x2 < x1, alors ce sont des TapisRoulant.DROITE_GAUCHE.
     * Si l'extrémité de départ du tapis roulant arrive sur l'extrémité final d'un autre tapis roulant, alors
     * le bon tapis roulant est placé pour connecté les deux.
     * Si l'extrémité final du tapis roulant arrive sur l'extrémité de départ d'un autre tapis roulant, alors
     * le bon tapis roulant est placé pour connecté les deux.
     * Sinon, toutes les cases du nouveau tapis roulant doivent être vide.
     *
     * @param y Le numéro de ligne où construire le tapis roulant.  Doit être entre 0 et TailleY - 1.
     * @param x1 Le numéro de colonne où commence le tapis roulant.  Doit être entre 0 et TailleX - 1.
     * @param x2 Le numéro de colonne où se termine le tapis roulant.  Doit être entre 0 et TailleX - 1.
     * @exception PlacementIncorrectException Lancé s'il est impossible de placer le tapis roulant.
     */
    public void setTapisHorizontal( int y, int x1, int x2 ) {

    }

    /**
     * Construit un tapis roulant vertical (sur une colonne) dans la grille.
     *
     * Place des tapis roulant de la case (x,y1) à la case (x,y2) dans la grille.
     * Si y1 < y2, alors ce sont des TapisRoulant.HAUT_BAS.
     * Si y2 < y1, alors ce sont des TapisRoulant.BAS_HAUT.
     * Si l'extrémité de départ du tapis roulant arrive sur l'extrémité final d'un autre tapis roulant, alors
     * le bon tapis roulant est placé pour connecté les deux.
     * Si l'extrémité final du tapis roulant arrive sur l'extrémité de départ d'un autre tapis roulant, alors
     * le bon tapis roulant est placé pour connecté les deux.
     * Sinon, toutes les cases du nouveau tapis roulant doivent être vide.
     *
     * @param x Le numéro de colonne où construire le tapis roulant.  Doit être entre 0 et TailleX - 1.
     * @param y1 Le numéro de ligne où commence le tapis roulant.  Doit être entre 0 et TailleY - 1.
     * @param y2 Le numéro de ligne où se termine le tapis roulant.  Doit être entre 0 et TailleY - 1.
     * @exception PlacementIncorrectException Lancé s'il est impossible de placer le tapis roulant.
     */
    public void setTapisVertical( int x, int y1, int y2 ) {

    }

    /**
     * Place un item sur le tapis roulant.
     * (Il y a deux lignes de code déjà écrite.  Elles ne doivent pas changer.  Vous pouvez ajouter du code
     *  au besoin.)
     *
     *  L'item est placé sur le tapis roulant présent à la case (x,y).
     * @param x Le numéro de colonne où placer l'item.  Doit être entre 0 et TailleX - 1.
     * @param y Le numéro de ligne où placer l'item.  Doit être entre 0 et TailleY - 1.
     * @param item L'item à placer.  Ne doit pas être null.
     * @exception PlacementIncorrectException Lancé s'il n'y a pas de tapis roulant à la position indiqué.
     */
    public void placerItem( int x, int y, Item item ) {
        item.setX( x );
        item.setY( y );

        // Au besoin, vous pouvez ajouter du code ici.
    }

    /**
     * Indique s'il y a au moins un item dans la case.
     * @param x Le numéro de colonne à vérifier.  Doit être entre 0 et TailleX - 1.
     * @param y Le numéro de ligne à vérifier.  Doit être entre 0 et TailleY - 1.
     * @return true si le tapis roulant contiens au moins un item, false sinon.
     */
    public boolean contiensItem( int x, int y ) {
        return false;
    }

    /**
     * Enlève un item du tapis roulant à la case indiqué.
     *
     * L'item enlevé est retourné.  S'il y a plus d'un item dans la case, alors l'item le plus proche de la
     * fin du tapis roulant est retiré.
     * @param x Le numéro de colonne où enlevé un item.  Doit être entre 0 et TailleX - 1.
     * @param y Le numéro de ligne où enlevé un item.  Doit être entre 0 et TailleY - 1.
     * @return L'item enlevé.  S'il n'y a pas d'item dans cette case, alors null est retourné.
     */
    public Item extraireItem( int x, int y ) {
        return null;
    }

    /**
     * Retourne la liste des Items présent dans la grille.
     * Les items restent dans la grille, c'est seulement pour pouvoir les consulter.
     * @return La liste des items présent dans la grille.  S'il n'y a pas d'item, alors la liste est vide.
     */
    public List< Item > consulterItems() {
        return null;
    }

    /**
     * Fait avancer les Items sur les Tapis Roulants.  Si un item dépasse un tapis roulant, il disparait.
     */
    public void tic() {

    }

    /*****************************************************************************************************************
     * La section suivante contiens des méthodes que vous ne devez pas modifier.
     */

    /**
     * Construit une chaine de caractères pour afficher une ligne de la matrice en utilisant une ligne à l'écran.
     * @param ligne La ligne à afficher
     * @param m La fonction d'extraction pour trouver les caractères qui affiche le tapis roulant.
     * @return La chaine de caractères représentant la ligne de la matrice.
     */
    private String toStringTier( TapisRoulant [] ligne, Function<TapisRoulant, String> m ) {
        return Arrays.stream( ligne )
                .map( m )
                .collect( Collectors.joining( SEP_CHAR, SEP_CHAR, SEP_CHAR + "\n" ) );
    }

    /**
     * Construit une chaine de caractères pour afficher une ligne de la matrice en utilisant 3 lignes à l'écran.
     * @param ligne La ligne à afficher
     * @return La chaine de caractères représentant la ligne de la matrice.
     */
    private String toStringLigne( TapisRoulant [] ligne ) {
        return
                toStringTier( ligne, TapisRoulant::afficheHaut ) +
                toStringTier( ligne, TapisRoulant::afficheMilieu ) +
                toStringTier( ligne, TapisRoulant::afficheBas );
    }

    /**
     * Transforme la matrice de la grille en une chaine de caractères.
     * @return La chaine de caractères représentant les tapis roulant de la matrice.
     */
    @Override
    public String toString() {
       return
                Arrays.stream( grille )
                        .map( this::toStringLigne )
                        .collect( Collectors.joining( fix, fix, fix ) );
    }
}
