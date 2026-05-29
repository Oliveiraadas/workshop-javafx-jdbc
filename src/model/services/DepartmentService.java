package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
		List<Department> List = new ArrayList<>();
		List.add(new Department(1, "Books"));
		List.add(new Department(2, "Computers"));
		List.add(new Department(3, "Electronics"));
		return List;
	}
}
