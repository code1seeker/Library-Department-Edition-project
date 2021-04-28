package ru.tpu.javaEElabs;


public class Lab8 {
	public static void main(String[] args) {
		Library mylibrary = new Library();
		mylibrary.setName("Pushkino");
		Department Dep1 =  new Department();
		Dep1.setGenreName("Dep1");
		Department Dep2 =  new Department();
		Dep2.setGenreName("Dep2");
		Department Dep3 =  new Department();
		Dep3.setGenreName("Dep3");
		Department Dep4 =  new Department();
		Dep4.setGenreName("Dep4");
		System.out.println(mylibrary.getName());
		mylibrary.addDepartment(Dep1);
		mylibrary.addDepartment(Dep2);
		mylibrary.addDepartment(Dep3);
		mylibrary.addDepartment(Dep4);
		System.out.println(mylibrary.getDepartment());
		mylibrary.removeDepartment(Dep2);
		System.out.println(mylibrary.getDepartment());
		System.out.println(Dep3.getLibrary());
		System.out.println(Dep2.getLibrary());
		System.out.println(mylibrary.getNumberOfDepartments());
		
		System.out.print("\n");
		
		Edition Ed1 = new Edition();
		Ed1.setName("Ed1");
		Edition Ed2 = new Edition();
		Ed2.setName("Ed2");
		Edition Ed3 = new Edition();
		Ed3.setName("Ed3");
		Edition Ed4 = new Edition();
		Ed4.setName("Ed4");
		Edition Ed5 = new Edition();
		Ed5.setName("Ed5");
		Dep1.addEdition(Ed1);
		Dep1.addEdition(Ed2);
		System.out.println(Dep1.getEdition());
		Dep3.addEdition(Ed3);
		System.out.println(Dep3.getEdition());
		Dep4.addEdition(Ed4);
		Dep4.addEdition(Ed5);
		System.out.println(Dep4.getEdition());
		Dep4.removeEdition(Ed5);
		System.out.println(Dep4.getEdition());
		System.out.println(Dep1.getNumberOfEditions());
		System.out.println(Dep3.getNumberOfEditions());
		System.out.println(Dep4.getNumberOfEditions());
	}

}
