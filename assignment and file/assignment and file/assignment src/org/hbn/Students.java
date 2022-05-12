package org.hbn;

import javax.persistence.*;


@Entity
@Table(name = "Students")

public class Students {

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	private int id;
	private String name;
	private double per;
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", per=" + per + "]";
	}

	
	
}
