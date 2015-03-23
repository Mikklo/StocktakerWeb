package ejb.ics;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable{
private int userId;
private String name;
@Id
@Column(name="userid")
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
@Column(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
