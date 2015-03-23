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
@Table(name="beverages")

public class Beverage implements Serializable{
private String name;
private String type;
private float exclVAT;
private float inclVAT;
private float amount;
private Set<Stocktaking> stocktakings;

@Id
@Column(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name="type")
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Column(name="exclVAT")
public float getExclVAT() {
	return exclVAT;
}
public void setExclVAT(float exclVAT) {
	this.exclVAT = exclVAT;
}
@Column(name="inclVAT")
public float getInclVAT() {
	return inclVAT;
}
public void setInclVAT(float inclVAT) {
	this.inclVAT = inclVAT;
}
@Column(name="amount")
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
@OneToMany(mappedBy="beverage", fetch=FetchType.EAGER)
public Set<Stocktaking> getStocktakings(){
	return stocktakings;
}
public void setStocktakings(Set<Stocktaking> stocktakings){
	this.stocktakings = stocktakings;
}
}
