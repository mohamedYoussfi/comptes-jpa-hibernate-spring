package test;

import java.util.Date;

import org.gestion.bp.entities.Client;
import org.gestion.bp.entities.CompteCourant;
import org.gestion.bp.entities.CompteEpargne;
import org.gestion.bp.entities.Employe;
import org.gestion.bp.entities.Groupe;
import org.gestion.bp.metier.IBanqueMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IBanqueMetier metier=(IBanqueMetier) context.getBean("metier");
		metier.addClient(new Client("C1", "AD1"));
		metier.addClient(new Client("C2", "AD2"));
		metier.addEmploye(new Employe("E1"), null);
		metier.addEmploye(new Employe("E2"), 1L);
		metier.addEmploye(new Employe("E3"), 1L);
		metier.addGroupe(new Groupe("G1"));
		metier.addGroupe(new Groupe("G2"));
		metier.addEmployeToGroupe(1L, 1L);
		metier.addEmployeToGroupe(2L, 2L);
		metier.addEmployeToGroupe(3L, 2L);
		
		metier.addCompte(new CompteCourant("CC1", new Date(), 9000, 8000), 1L, 2L);
		metier.addCompte(new CompteEpargne("CE1", new Date(), 40000, 5.5), 2L, 2L);
		
		metier.verser(5000, "CC1", 2L);
		metier.retirer(6000, "CC1", 2L);
		
		metier.virement(4000, "CC1", "CE1", 1L);
		
		
		
	}

}
