package ru.tpu.javaEElabs;

public class Edition {
	private String department;
	private String name, author;
	private int year;
	public void setDepartment(String department) { 		 		 		 
		this.department = department;}
	public void deleteDepartment() {
		department = null;	}
	public String getDepartment() { 		 		 		 
			return department;}
	public void setName(String new_name) { 		 		 		 
	name = new_name;}
	public void setAuthor(String new_author) { 		 		 		 
	author = new_author;}
	public void setYear(int new_year) { 		 		 		 
	year = new_year;}
	public String getName() { 		 		 		 
	return name;}
	public String getAuthor() { 		 		 		 
	return author;}
	public int getYear() {		 		 		 
	return year;}
}
