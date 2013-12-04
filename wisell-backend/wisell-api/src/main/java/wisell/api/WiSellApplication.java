/*
 * Coders4Africa Senegal copyright2013
 */


package wisell.api;

/**
 *
 * @author papesdiop
 */

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class WiSellApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(ClientRest.class);

        return classes;
    }
}