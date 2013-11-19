/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.c4a.wisell.data;

import com.c4a.wisell.models.Client;
import java.util.List;

import org.mongodb.morphia.Morphia;

import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.Mongo;
import org.bson.types.ObjectId;
/**
 *
 * @author papesdiop
 */
public class ClientDao extends BasicDAO<Client, ObjectId> {

       public ClientDao(Mongo mongo, Morphia morphia) {
              super(mongo, morphia, "elk");
       }
       
       public ClientDao(Mongo mongo, Morphia morphia, String dbName) {
              super(mongo, morphia, dbName);
       }
       
       public List<Client> findAll() {
              return ds.find(Client.class).asList();
       }

       public List<Client> findByPhone(String phone) {
              return ds.find(Client.class).filter("phone = ", phone)
                           .order("phone").asList();
       }

}
