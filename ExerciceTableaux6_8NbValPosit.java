package variablestableauxboucles;
import java.util.Scanner;


public class ExerciceTableaux6_8NbValPosit extends Exercice {
	private int nb_elem_tableau;
	
// constructeurs 
	/**
	 * @param lg_tableau
	 */
	public ExerciceTableaux6_8NbValPosit(int lg_tableau){
		this.nb_elem_tableau = lg_tableau;
		initialisation_type_exercice();
		
	}
	
	public ExerciceTableaux6_8NbValPosit(){
		this.nb_elem_tableau = 3;
		initialisation_type_exercice();
		initialisation_specifique();
	}

	
// execution 
public void doit(){
	
	int tab[] = new int[nb_elem_tableau];
	int indice_mini = 0;
	int indice_maxi = indice_mini + nb_elem_tableau - 1 ;
	int indice_actuel = indice_mini;
	int nbsaisi = 0;
	int accu_neg = 0;
	
	Scanner sc = new Scanner(System.in);
	
	for ( ; indice_actuel <= indice_maxi; indice_actuel++){
		
		System.out.println("saisissez un nombre " 
				+ String.valueOf(indice_actuel + 1)
				+"/"
				+ String.valueOf(indice_maxi + 1));
		nbsaisi = sc.nextInt();
		sc.nextLine();  // 
		tab[indice_actuel] = nbsaisi;
		if (nbsaisi < 0){
			accu_neg = accu_neg + 1;
		}
		tab[indice_actuel] = nbsaisi + 1;
		
	}
	sc.close();
	System.out.println("nombres negatifs: " 
						+ String.valueOf(accu_neg) 
						+ " nombres positifs (ou nuls): " 
						+ String.valueOf(nb_elem_tableau - accu_neg) );
	}

@Override
public void initialisation_type_exercice() {
	// TODO Auto-generated method stub
	this.setEnnonce_exo("Ecrivez un algorithme permettant � l�utilisateur de saisir un nombre quelconque de valeurs, qui devront �tre stock�es dans un tableau. L�utilisateur doit donc commencer par entrer le nombre de valeurs qu�il compte saisir. Il effectuera ensuite cette saisie. Enfin, une fois la saisie termin�e, le programme affichera le nombre de valeurs n�gatives et le nombre de valeurs positives.");
	this.numero_exercice = num;
	
	this.commentaire_algo = algo;
	this.interet_exo = interet;
}



private static String num = "(tableaux, 6.8)";
private static String ennonce = "Ecrivez un algorithme permettant � l�utilisateur\n"
		+ "de saisir un nombre quelconque de valeurs,\n"
		+ "qui devront �tre stock�es dans un tableau.\n"
		+ "L�utilisateur doit donc commencer par entrer le nombre de valeurs\n"
		+ "qu�il compte saisir.\n "
		+ "Il effectuera ensuite cette saisie. \n"
		+ "Enfin, une fois la saisie termin�e, \n"
		+ "le programme affichera le nombre de valeurs n�gatives\n"
		+ "et le nombre de valeurs positives. ";
private static String algo = "algo : tiers exclus: ce qui n est pas negatif est positif ou nul\n"
		+ "donc un seul compteur";
private static String interet = "interet: affectation taille tableau � l execution\n"
		+ "boucle sur tableau avec taille connue\n"
		+ "sans d�border du tableau";

@Override
public void initialisation_specifique() {
	// TODO Auto-generated method stub
	
}
}

