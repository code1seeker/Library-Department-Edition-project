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
		System.out.println("������� "+edition.getName()+" ���� �������� � ����� "+genreName);}
	public void removeEdition(Edition edition){ 		 		 		 
		editions.remove(edition.getName()); 
		edition.deleteDepartment();
		System.out.println("������� "+edition.getName()+" ���� ������ �� ������ "+genreName);}
	public String getEdition() { 		
		System.out.print("� ������ "+genreName+" ������ �������: ");
		String answer = "";
		for(int i = 0; i < editions.size(); i++) 
			answer = answer + editions.get(i).toString() + " ";
		return answer; }
	public String getNumberOfEditions() {
		return "������ ��������� ������� � ������ "+genreName+" �����: "+Integer.toString(editions.size());}
	public void setLibrary(String library) { 	
		this.library = library;}
	public void deleteLibrary() { 		 		 		 
		this.library = null;}
	public String getLibrary() { 
		//System.out.print("�����"+genreName+" ��������� � ����������: ");
		if(library != null)
		return "����� "+genreName+" ��������� � ����������: "+library;
		else return "����� "+genreName+" �� ��������� � �����-���� ����������";}
	public void setGenreName(String new_genreName) { 		 		 		 
		genreName = new_genreName;}
	public void setnumberOfEditions(int new_number) { 		 		 		 
		numberOfEditions = new_number;}
	public String getGenreName() { 		 		 		 
		return genreName;}

}
