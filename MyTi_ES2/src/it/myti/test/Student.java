package it.myti.test;

import java.time.LocalDate;
import java.time.Period;

/**
 * Questa classe descrive un oggetto Student con specifiche proprietà
 * @author Francesco Palberti
 */


public class Student {
	private static final String lineSeparator = "\n";
	private String firstname;	//nome
	private String lastname;	//cognome
	private String birthdate;	//compleanno
	private String grades;	//voti
	 
	public Student(String firstname, String lastname, String birthdate, String grades) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.grades = grades;
	}
	
	
	/**
	 * Questo metodo calcola l'età dello studente
	 * @return età dello student
	 */
	public int calculateAge() {
		//Data corrente
		LocalDate currentDate = LocalDate.now();
		//Converte una data stringa in formato AAAA-MM-GG in LocalDate
		LocalDate birthDate = LocalDate.parse(birthdate);
        return Period.between(birthDate, currentDate).getYears();
    }
	
	/**
	 * Questo metodo calcola le votazioni medie dello studente
	 * @return votazione media
	 */
	public int calculateAvgGrade() {
		int totale=0;
		String [ ] voti = new String [grades.length()-1];
		voti=grades.split("-");
		for (int i = 0; i < voti.length; i++) {
			totale=totale+ Integer.valueOf(voti[i]);
		}
		return totale/voti.length;
    }


	/**
	 * Questo metodo costruice la carta d'identità dello studente
	 * @return string rappresentativa dello studente
	 */
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("Nome: "+ firstname);
		s.append(lineSeparator);
		s.append("Cognome: "+ lastname);
		s.append(lineSeparator);
		s.append("Età: "+ calculateAge());
		s.append(lineSeparator);
		s.append("Media Voti: "+ calculateAvgGrade());
		return s.toString();
	}
	
	
	
}
