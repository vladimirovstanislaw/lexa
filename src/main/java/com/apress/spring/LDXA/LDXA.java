package com.apress.spring.LDXA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lexa")
public class LDXA {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String title2;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	public LDXA() {
	}

	public LDXA(String ti, String petux) {
		this.title = ti;
		this.title2 = petux;
	}
	public String toString() {
		StringBuilder value = new StringBuilder("JournalEntry(");
		value.append("Id: ");
		value.append(id);
		value.append(",Title: ");
		value.append(title);
		value.append(",Title2: ");
		value.append(title2);
		return value.toString();
	}

}
