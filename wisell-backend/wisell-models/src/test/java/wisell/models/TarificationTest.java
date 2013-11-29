/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.models;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mongodb.morphia.Key;
import wisell.models.enums.TarificationMode;

/**
 *
 * @author papesdiop
 */
public class TarificationTest extends TestBase {
    
    public TarificationTest() {
        super();
        cleanAfter = false;
    }

    @Test
    public void testCreateTarification() {
        Key<Tarification> id =  getDs().save(new Tarification(TarificationMode.bySize,12d,100d));
        assertNotNull("Error creating tarification", id); 
    }
    
}
