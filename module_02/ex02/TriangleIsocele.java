import java.util.Scanner;

public class TriangleIsocele {
    private int hauteur;
    
    public TriangleIsocele(int hauteur) {
        if (hauteur <= 0) {
            throw new IllegalArgumentException("La hauteur doit être positive");
        }
        this.hauteur = hauteur;
    }
    
    public void afficher() {
        for (int ligne = 1; ligne <= hauteur; ligne++){
            int nbEspaces = hauteur - ligne;
            for (int i = 0; i < nbEspaces; i++)
                System.out.print(" ");
            int nbEtoiles = 2 * ligne - 1;
            for (int i = 0; i < nbEtoiles; i++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la hauteur du triangle : ");
        int hauteur = scanner.nextInt();
        if (hauteur <= 0) {
            System.out.println("Erreur : la hauteur doit être positive.");
            scanner.close();
            return;
        }
        TriangleIsocele triangle = new TriangleIsocele(hauteur);
        System.out.println();
        triangle.afficher();
        scanner.close();
    }
}