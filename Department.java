package ru.tpu.javaEElabs;
import java.util.ArrayList;

public class Department {
	private String library;
	private String genreName ;
	private int numberOfEditions ;
	ArrayList<String> editions = new ArrayList<String>();
	public void addEdition(Edition edition){ 		 		
		editions.add(edition.getName()); 
		edition.setDepartment(genreName);
		System.out.println("Издание "+edition.getName()+" было добавлен в отдел "+genreName);}
	public void removeEdition(Edition edition){ 		 		 		 
		editions.remove(edition.getName()); 
		edition.deleteDepartment();
		System.out.println("Издание "+edition.getName()+" было удалёно из отдела "+genreName);}
	public String getEdition() { 		
		System.out.print("В отделе "+genreName+" входят издания: ");
		String answer = "";
		for(int i = 0; i < editions.size(); i++) 
			answer = answer + editions.get(i).toString() + " ";
		return answer; }
	public String getNumberOfEditions() {
		return "Размер коллекции изданий в отделе "+genreName+" равен: "+Integer.toString(editions.size());}
	public void setLibrary(String library) { 	
		this.library = library;}
	public void deleteLibrary() { 		 		 		 
		this.library = null;}
	public String getLibrary() { 
		//System.out.print("Отдел"+genreName+" находится в библиотеке: ");
		if(library != null)
		return "Отдел "+genreName+" находится в библиотеке: "+library;
		else return "Отдел "+genreName+" не находится в какой-либо библиотеке";}
	public void setGenreName(String new_genreName) { 		 		 		 
		genreName = new_genreName;}
	public void setnumberOfEditions(int new_number) { 		 		 		 
		numberOfEditions = new_number;}
	public String getGenreName() { 		 		 		 
		return genreName;}

}
