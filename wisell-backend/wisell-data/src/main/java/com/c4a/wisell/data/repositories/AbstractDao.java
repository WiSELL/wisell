/*
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.data.repositories;

import org.mongodb.morphia.dao.BasicDAO;


public abstract class AbstractDao<E, K> extends BasicDAO<E, K> {
   static DBParams db = DBParams.getInstance();
   protected AbstractDao() {
       super(db.getMongo(), db.getMorphia(), db.getDb().getName());
    }

}
