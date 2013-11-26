/**
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo.impl;

import wisell.models.Hotspot;
import java.util.List;

import org.bson.types.ObjectId;
import wisell.data.repo.IHotspotRepository;

/**
 *
 * @author papesdiop
 */
public class HotspotRepository extends AbstractRepository<Hotspot, ObjectId> implements IHotspotRepository<Hotspot, ObjectId>{

    public List<Hotspot> findAll() {
        return ds.find(Hotspot.class).asList();
    }

    public Hotspot findByPhone(String phone) {
        return ds.find(Hotspot.class)
                .filter("phone = ", phone)
                .get();
    }

}
