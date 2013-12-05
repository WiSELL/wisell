package wisell.data.repo;

import java.util.List;

import org.bson.types.ObjectId;

import wisell.data.IHotspotRepository;
import wisell.model.Hotspot;

public class HotspotRepository extends AbstractRepository<Hotspot, ObjectId> implements IHotspotRepository{

	public String register(Hotspot hotspot) {
		// TODO Auto-generated method stub
		return null;
	}

	public Hotspot get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Hotspot findByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Hotspot hotspot) {
		// TODO Auto-generated method stub
		
	}

	public void lockHotspot(String id) {
		// TODO Auto-generated method stub
		
	}

	public void lockHotspot(Hotspot hotspot) {
		// TODO Auto-generated method stub
		
	}

	public void unlockHotspot(String id) {
		// TODO Auto-generated method stub
		
	}

	public void unlockHotspot(Hotspot hotspot) {
		// TODO Auto-generated method stub
		
	}

	public List<Hotspot> findAll(int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
