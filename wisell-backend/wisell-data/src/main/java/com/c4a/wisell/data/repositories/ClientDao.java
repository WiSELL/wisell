/**
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.data.repositories;

import com.c4a.wisell.models.Client;
import java.util.List;

import org.bson.types.ObjectId;

/**
 *
 * @author papesdiop
 */
public class ClientDao extends AbstractDao<Client, ObjectId> {

    public List<Client> findAll() {
        return ds.find(Client.class).asList();
    }

    public List<Client> findByPhone(String phone) {
        return ds.find(Client.class).filter("phone = ", phone)
                .order("phone").asList();
    }

}
