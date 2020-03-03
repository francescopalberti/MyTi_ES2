/**
 * 
 */
package it.myti.test;

/**
 * 
 * @author Francesco Palberti
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Istanzio uno student di prova
		Student aStudent = new Student("Luca", "Rossi", "1997-11-03", "8-4-10");
		//stampo i suoi dati
		System.out.println(aStudent.toString());
	}

}
