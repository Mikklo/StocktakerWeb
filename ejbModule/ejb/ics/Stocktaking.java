package ejb.ics;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stocktaking")
public class Stocktaking implements Serializable {
private int stocktakingId;
private int userId;
private String name;
private ZonedDateTime date;
private float amount;
private User user;
private Beverage beverage;
@Id
@Column(name="stocktakingId")
public int getStocktakingId() {
	return stocktakingId;
}
public void setStocktakingId(int stocktakingId) {
	this.stocktakingId = stocktakingId;
}
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
@Column(name="date")
public ZonedDateTime getDate() {
	return date;
}
public void setDate(ZonedDateTime date) {
	this.date = date;
}
@Column(name="amount")
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
@ManyToOne
@JoinColumn(name="userid", referencedColumnName="userid")
public User getUser(){
	return user;
}
public void setUser(User user){
	this.user = user;
}
@ManyToOne
@JoinColumn(name="name", referencedColumnName="name")
public Beverage getBeverage(){
	return beverage;
}
public void setBeverage(Beverage beverage) {
	this.beverage = beverage;
}
}
