/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo.impl;

import org.mongodb.morphia.dao.BasicDAO;


public abstract class AbstractRepository<E, K> extends BasicDAO<E, K> {
   static DBParams db = DBParams.getInstance();
   protected AbstractRepository() {
       super(db.getMongo(), db.getMorphia(), db.getDb().getName());
    }

}
