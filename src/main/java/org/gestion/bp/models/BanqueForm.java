package org.gestion.bp.models;

import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import org.gestion.bp.entities.Compte;
import org.gestion.bp.entities.Operation;
import org.hibernate.validator.constraints.NotEmpty;

public class BanqueForm {
	@NotEmpty
	@Size(min=3,max=10)
   private String code;
   private Compte compte;
   private String typeCompte;
   private String exception;
   private List<Operation> operations;
   private String typeOperation;
   @DecimalMin(value="50")
   private double montant=50;
    @NotEmpty
	@Size(min=3,max=10)
   private String code2="XXX";
   private String action;
   
   private int page=0;
   private int nbLignes=3;
   private int nombrePages;
   
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}
public String getTypeCompte() {
	return typeCompte;
}
public void setTypeCompte(String typeCompte) {
	this.typeCompte = typeCompte;
}
public String getException() {
	return exception;
}
public void setException(String exception) {
	this.exception = exception;
}
public List<Operation> getOperations() {
	return operations;
}
public void setOperations(List<Operation> operations) {
	this.operations = operations;
}
public String getTypeOperation() {
	return typeOperation;
}
public void setTypeOperation(String typeOperation) {
	this.typeOperation = typeOperation;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public String getCode2() {
	return code2;
}
public void setCode2(String code2) {
	this.code2 = code2;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public int getNbLignes() {
	return nbLignes;
}
public void setNbLignes(int nbLignes) {
	this.nbLignes = nbLignes;
}
public int getNombrePages() {
	return nombrePages;
}
public void setNombrePages(int nombrePages) {
	this.nombrePages = nombrePages;
}

   
   
}
