package ejb.ics;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable{
private int userId;
private String name;
private Set<Stocktaking> stocktakings;
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
@OneToMany(mappedBy="users", fetch=FetchType.EAGER)
public Set<Stocktaking> getStocktakings(){
	return stocktakings;
}
public void setStocktakings(Set<Stocktaking> stocktakings){
	this.stocktakings = stocktakings;
}
}
