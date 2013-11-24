/**
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.data.repositories;

import com.c4a.wisell.models.Connection;
import com.mongodb.DB;
import java.util.List;

import org.mongodb.morphia.Morphia;

import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.Mongo;
import org.bson.types.ObjectId;

/**
 *
 * @author papesdiop
 */
public class ConnectionDao extends AbstractDao<Connection, ObjectId> {

    public List<Connection> findAll() {
        return ds.find(Connection.class).asList();
    }

}
