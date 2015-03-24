package facade.ics;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import eao.ics.StocktakerEAOLocal;
import ejb.ics.Beverage;
import ejb.ics.Stocktaking;
import ejb.ics.User;

/**
 * Session Bean implementation class Facade
 */
@Stateless
public class Facade implements FacadeLocal {
	@EJB
	private StocktakerEAOLocal StocktakerEAO;
    /**
     * Default constructor. 
     */
    public Facade() {
        // TODO Auto-generated constructor stub
    }
    public Beverage findByName(String name){
    	 return StocktakerEAO.findByName(name);	
    }
    public Beverage updateBeverage(Beverage beverage) {
    	 return StocktakerEAO.updateBeverage(beverage);
    	 }
    public Stocktaking createStocktaking(Stocktaking stocktaking) {
    	 return StocktakerEAO.createStocktaking(stocktaking);
    }
    public User findByUserId(int userid) {
    	 return StocktakerEAO.findByUserId(userid);
    }
}
