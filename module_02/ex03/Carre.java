import java.util.Scanner;

public class Carre {
    private int nums;
    private int[] carres;

    public Carre(int nums) {
        this.nums = nums;
        this.carres = new int[nums];
        calculerCarres();
    }
    
    private void calculerCarres() {
        int nombreImpair = 1; 
        for (int i = 0; i < nums; i++) {
            carres[i] = nombreImpair * nombreImpair;
            nombreImpair += 2;
        }
    }
    
    public void afficher() {
        int nombreImpair = 1;
        for (int i = 0; i < nums; i++) {
            System.out.println(nombreImpair + " a pour carre " + carres[i]);
            nombreImpair += 2;
        }
    }
    public int[] getCarres() {
        return carres;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Combien de valeurs : ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Erreur : le nombre doit être positif.");
            sc.close();
            return;
        }
        
        Carre c = new Carre(num);
        System.out.println();
        c.afficher();
        
        sc.close();
    }
}