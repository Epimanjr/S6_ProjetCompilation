package fr.ul.miage.log;

import java.util.*;

public class Sessions {

    //A chaque ip, on associe une liste de sessions
    //La dernière session de cette liste est celle en cours (pas encore terminée)
	private HashMap<String,ArrayList<Session>> map;

	/**
	 * Seuil en secondes pour l'expiration d'une session.
	 */
	private int seuil = 1200;
	
	/**
	 * Constructeur qui initialise la liste des Sessions.
	 */
	public Sessions() {
		this.map = new HashMap<>();
	}
	
	/**
	 * Temporaire le tempsde débugger le reste 
	 */
	public boolean append() {
		return true;
	}

	public boolean append(String ip, String d){
		System.out.println(ip);
		System.out.println(d);
		try {
		// Conversion du String en date
			// Récupération de toutes les valeurs nécessaires
			d = d.substring(1,21);
			String[] array = d.split(":");
			int hours = new Integer(array[1]), minutes = new Integer(array[2]), seconds = new Integer(array[3]);
			String[] array2 = array[0].split("/");
			int day = new Integer(array2[0]), month = getMonthInt(array[1]), year = new Integer(array[2]);
			Date date = new Date(year, month, day);
			date.setHours(hours);
			date.setMinutes(minutes);
			date.setSeconds(seconds);
			
		// Récupération de la liste des sessions
		ArrayList<Session> listSessions;
		if(map.containsKey(ip)) {
			listSessions = map.get(ip);
		} else {
			listSessions = new ArrayList<>();
			this.map.put(ip, listSessions);
		}
		// On prend la dernière session ou bien une nouvelle
		Session lastSession;
		if(listSessions.isEmpty()) {
			lastSession = new Session(ip);
			listSessions.add(lastSession);
		} else {
			lastSession = listSessions.get(listSessions.size() - 1);
		}
		// Test sur la dernière session
		if(lastSession.getTimes().isEmpty()) {
			lastSession.append(date);
		} else {
			// Est-ce que la session est terminée ?
			// On récupère le dernier temps
			Date lastTime = lastSession.getTimes().get(lastSession.getTimes().size() - 1);
			// Calcul de la différence (en secondes)
			long diff = (date.getTime() - lastTime.getTime()) / 1000; // Normalement > 0
			// Si différence >= seuil
			if(diff > this.seuil) {
				// Calcul de la moyenne de durée de la dernière session
				lastSession.calculDuree();
				// Création d'une nouvelle session
				Session newSession = new Session(ip);
				newSession.append(date);
				listSessions.add(newSession);
			} else {
				// Ajout du temps à la session
				lastSession.append(date);
			}
		}
		} catch(NullPointerException ex) {
			ex.printStackTrace();
		}
	    return true;
	}
	
	/**
	 * Get month int with specific String.
	 * 
	 * @param month String month
	 * @return int
	 */
	public int getMonthInt(String month) {
		switch(month) {
			case "Jan": return 1;
			case "Feb": return 2;
			case "Mar": return 3;
			case "Apr": return 4;
			case "May": return 5;
			case "Jun": return 6;
			case "Jul": return 7;
			case "Aug": return 8;
			case "Sep": return 9;
			case "Oct": return 10;
			case "Nov": return 11;
			default:
				return 12;
		}
	}
	
	/**
	 * Calcule le temps moyen d'une session.
	 * 
	 * @return la moyenne, type long
	 */
	public int getAvgTime(){
		// Initialisation moyenne
		int avg = 0, nb = 0;
		// Parcours HashMap
	    Set set = map.keySet();
	    Iterator it = set.iterator();
	    while(it.hasNext()) {
	    	String key = (String)it.next();
	    	ArrayList<Session> list = map.get(key);
	    	for(Session s : list) {
	    		avg += s.duree;
	    		nb++;
	    	}
	    }
	    return (avg / nb);
	}
	
	/**
	 * Récupère le nombre de sessions.
	 * 
	 * @return int : le nombre
	 */
	public int getNbSessions(){
	    return 0;
	}
	
	public long getFirst(){
	    return 0;
	}
	
	public long getLast(){
	    return 0;
	}

}