package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CPTE",
discriminatorType=DiscriminatorType.STRING,length=4)
public class Compte implements Serializable {
	@Id
   private String codeCompte;
   private Date dateCreation;
   private double solde;
   @ManyToOne
   @JoinColumn(name="CODE_CLI")
   private Client client;
   @ManyToOne
   @JoinColumn(name="CODE_EMP")
   private Employe employe;
   @OneToMany(mappedBy="compte")
   private Collection<Operation> operations;
public String getCodeCompte() {
	return codeCompte;
}
public void setCodeCompte(String codeCompte) {
	this.codeCompte = codeCompte;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public Collection<Operation> getOperations() {
	return operations;
}
public void setOperations(Collection<Operation> operations) {
	this.operations = operations;
}
public Compte() {
	super();
	// TODO Auto-generated constructor stub
}
public Compte(String codeCompte, Date dateCreation, double solde) {
	super();
	this.codeCompte = codeCompte;
	this.dateCreation = dateCreation;
	this.solde = solde;
}
   
   
}
