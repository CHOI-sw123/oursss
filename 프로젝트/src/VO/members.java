package VO;

public class members {
	private String id;
	private String pw;
	private String name;
	private String university_name;
	private String department;
	private int point;
	private int reliability;

	public members(String id, String pw, String name, String university_name, String department, int point,
			int reliability) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.university_name = university_name;
		this.department = department;
		this.point = point;
		this.reliability = reliability;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getReliability() {
		return reliability;
	}

	public void setReliability(int reliability) {
		this.reliability = reliability;
	}
}
