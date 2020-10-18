package com.assignment.url.shortenurl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "urls")
public class Url {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
	@Column(nullable = false)
private String original_url;
private String converted_url;
public Url() {
	super();
}
public Url(Long id, String original_url, String converted_url) {
	super();
	this.id = id;
	this.original_url = original_url;
	this.converted_url = converted_url;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getOriginal_url() {
	return original_url;
}
public void setOriginal_url(String original_url) {
	this.original_url = original_url;
}
public String getConverted_url() {
	return converted_url;
}
public void setConverted_url(String converted_url) {
	this.converted_url = converted_url;
}
@Override
public String toString() {
	return "Url [id=" + id + ", original_url=" + original_url + ", converted_url=" + converted_url + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((converted_url == null) ? 0 : converted_url.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((original_url == null) ? 0 : original_url.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Url other = (Url) obj;
	if (converted_url == null) {
		if (other.converted_url != null)
			return false;
	} else if (!converted_url.equals(other.converted_url))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (original_url == null) {
		if (other.original_url != null)
			return false;
	} else if (!original_url.equals(other.original_url))
		return false;
	return true;
}

}
