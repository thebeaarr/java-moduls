import java.util.Scanner;

public class Harmo {
    private int n;
    
    public Harmo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n doit être positif ou nul");
        }
        this.n = n;
    }
    
    public double somme() {
        double somme = 0.0;
        
        if (this.n == 0) {
            return somme;
        }
        
        for (int i = 1; i <= n; i++) {
            somme += 1.0 / i;
        }
        
        return somme;
    }
    
    public void afficherSerie() {
        System.out.print("Série harmonique H(" + n + ") = ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez la valeur de n : ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Erreur : n doit être positif ou nul.");
            scanner.close();
            return;
        }
        Harmo h = new Harmo(n);
        
        if (n <= 20) {
            h.afficherSerie();
        }
        
        double somme = h.somme();
        System.out.println("H(" + n + ") = " + somme);
        
        scanner.close();
    }
}