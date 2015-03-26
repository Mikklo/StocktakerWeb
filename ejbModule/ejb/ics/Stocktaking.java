package ejb.ics;

import java.beans.Transient;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="stocktaking")
public class Stocktaking implements Serializable {
private int stocktakingId;
private Timestamp date;
private float amount;
private User user;
private Beverage beverage;


@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="stocktakingId")
public int getStocktakingId() {
	return stocktakingId;
}
public void setStocktakingId(int stocktakingId) {
	this.stocktakingId = stocktakingId;
} 
@Column(name="date")
public Timestamp getDate() {
	return date;
}
public void setDate(Timestamp date) {
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
@JoinColumn(name="userid", referencedColumnName = "userid")
public User getUser(){
	return user;
}
public void setUser(User user){
	this.user = user;
}
@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="name", referencedColumnName = "name")
public Beverage getBeverage(){
	return beverage;
}
public void setBeverage(Beverage beverage) {
	this.beverage = beverage;
}
}
