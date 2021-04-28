package ru.tpu.javaEElabs;
import java.util.ArrayList;



public class Library {
	private String Name;	
	ArrayList<String> departments = new ArrayList<String>();
	public void setName(String new_name) { 		 		 		 
	Name = new_name;}
	public String getName() { 		 		 		 
	return Name;}
	public void addDepartment(Department department){ 		 		 		 
		departments.add(department.getGenreName()); 
		department.setLibrary(Name);
		System.out.println("����� "+department.getGenreName()+" ��� �������� � ���������� "+Name);}
	public void removeDepartment(Department department){ 		 		 		 
		departments.remove(department.getGenreName()); 
		department.deleteLibrary();
		System.out.println("����� "+department.getGenreName()+" ��� ����� �� ���������� "+Name);}
	public String getDepartment() { 	
		System.out.print("� ���������� "+Name+" ������ ������: ");
		String answer = "";
		for(int i = 0; i < departments.size(); i++) 
			answer = answer + departments.get(i).toString() + " ";
		return answer; }
	public String getNumberOfDepartments() {
		return "������ ��������� ������� � ���������� "+Name+" �����: "+Integer.toString(departments.size());}
		
}
