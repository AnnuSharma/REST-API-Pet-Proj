package backend.entity;

import org.springframework.data.annotation.Id;

public class ProjectEntity {
	@Id 
	private long id;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
