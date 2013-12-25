/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data;

import wisell.models.Hotspot;

/**
 *
 * @author papesdiop
 */
public interface IHotspot {
    /**
     * Register a hotspot to wisell
     * @param hotspot 
     */
    public void register(Hotspot hotspot);
    /**
     * Unregister a hotspot from wisell
     * @param hotspot 
     */
    public void unregister(Hotspot hotspot);
    /**
     * Starting a hotspot, Hotspot have to obtain an available pass before starting
     * @param hotspot 
     */
    public void start(Hotspot hotspot);
    public void stop(Hotspot hotspot);
    
    public void start(String hotspot);
    public void stop(String hotspot);
    /**
     * Updating hotspot settings (share bandwith, maximal simultaneous connections, etc.)
     * @param hotspot 
     */
    public void update(Hotspot hotspot);
    
}
