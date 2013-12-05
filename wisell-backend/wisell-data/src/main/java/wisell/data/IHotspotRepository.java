package wisell.data;

import java.util.List;

import wisell.model.Hotspot;

public interface IHotspotRepository {
	public String register(Hotspot hotspot);
	public Hotspot get(String id);
	public Hotspot findByPhoneNumber(String phoneNumber);
	public void update(Hotspot hotspot);
	public void lockHotspot(String id);
	public void lockHotspot(Hotspot hotspot);
	public void unlockHotspot(String id);
	public void unlockHotspot(Hotspot hotspot);
	public List<Hotspot> findAll(int offset, int limit);
	
}
