package fr.ul.miage.log;

import java.util.*;

public class Session {

	/**
	 * L'adresse IP de la session.
	 */
	private String ip;
	
	/**
	 * Liste des Timestamp.
	 */
	private ArrayList<Date> times;
	
	/**
	 * Durée de la session.
	 */
	public long duree;

	/**
	 * Constructeur d'une session, en fonction de l'adresse IP.
	 * 
	 * @param i l'adresse IP
	 */
	public Session(String ip){
	    this.ip = ip;
	}

	/**
	 * Ajoute une date à la liste des Timestamp.
	 *
	 * @param d la nouvelle Timestamp.
	 */
	public boolean append(Date d){
	    this.times.add(d);
	    return true;
	}

	/**
	 * Get list of timestamp
	 * 
	 * @return list
	 */
	public ArrayList<Date> getTimes() {
		return this.times;
	}
	
	/**
	 * Calcul la durée de la session
	 */
	public void calculDuree() {
		long diff = this.times.get(this.times.size() - 1 ).getTime() - this.times.get(0).getTime();
		diff /= 1000;
		this.duree = diff;
	}
}