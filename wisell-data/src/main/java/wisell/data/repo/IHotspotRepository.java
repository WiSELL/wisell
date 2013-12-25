/*
 * Coders4Africa Senegal copyright2013
 */
package wisell.data.repo;

import wisell.models.Hotspot;
import java.util.List;

/**
 *
 * @author papesdiop
 */
public interface IHotspotRepository<E, K>  extends org.mongodb.morphia.dao.DAO<E, K>  {
    public List<Hotspot> findAll();
    public Hotspot findByPhone(String phone);
}
