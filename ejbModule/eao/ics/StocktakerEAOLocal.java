package eao.ics;

import javax.ejb.Local;

import ejb.ics.Beverage;
import ejb.ics.Stocktaking;
import ejb.ics.User;

@Local
public interface StocktakerEAOLocal {
	public Beverage findByName(String name);
	public Beverage updateBeverage(Beverage beverage);
	public Stocktaking createStocktaking(Stocktaking stocktaking);
	public User findByUserId(int userid);
}
