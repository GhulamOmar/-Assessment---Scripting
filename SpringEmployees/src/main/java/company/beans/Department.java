package company.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Department {
	
	private String salary;
	private String department_name;
	private String job_title;
	
	public Department() {
		super();
		
	}

	public Department(String salary, String department_name, String job_title) {
		super();
		this.salary = salary;
		this.department_name = department_name;
		this.job_title = job_title;
		
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	@Override
	public String toString() {
		return "Department [salary=" + salary + ", department_name=" + department_name + ", job_title=" + job_title
				+ "]";
	}
}