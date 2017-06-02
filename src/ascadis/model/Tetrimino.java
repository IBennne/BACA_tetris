package ascadis.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;


//@Entity
public class Tetrimino implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nom;
	private String couleur;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	public Tetrimino() {
		this.id = UUID.randomUUID().toString();
	}
	
	public Tetrimino(String nom, String couleur) {
		super();
		this.nom = nom;
		this.couleur = couleur;
	}
}