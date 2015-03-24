package eao.ics;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejb.ics.Beverage;
import ejb.ics.Stocktaking;
import ejb.ics.User;

/**
 * Session Bean implementation class StocktakerEAO
 */
@Stateless
public class StocktakerEAO implements StocktakerEAOLocal {
	@PersistenceContext(unitName="LabEJBSql")
	private EntityManager em;
	
	public Beverage findByName(String name) {
		 return em.find(Beverage.class, name);
		 }
	public Beverage updateBeverage(Beverage beverage) {
		 em.merge(beverage);
		 return beverage;
		 }
	public Stocktaking createStocktaking(Stocktaking stocktaking) {
		em.persist(stocktaking);
		return stocktaking;
	}
	public User findByUserId(int userid) {
		return em.find(User.class, userid);
	}
    public StocktakerEAO() {
        // TODO Auto-generated constructor stub
    	
    }

}
