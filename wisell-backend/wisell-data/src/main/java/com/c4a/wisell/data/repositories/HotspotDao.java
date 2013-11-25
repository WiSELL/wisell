/**
 * Coders4Africa Senegal copyright2013
 */
package com.c4a.wisell.data.repositories;

import com.c4a.wisell.models.Hotspot;
import java.util.List;

import org.bson.types.ObjectId;

/**
 *
 * @author papesdiop
 */
public class HotspotDao extends AbstractDao<Hotspot, ObjectId> {

    public List<Hotspot> findAll() {
        return ds.find(Hotspot.class).asList();
    }

    public Hotspot findByPhone(String phone) {
        return ds.find(Hotspot.class)
                .filter("phone = ", phone)
                .get();
    }

}
