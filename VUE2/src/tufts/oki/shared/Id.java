/*
 * -----------------------------------------------------------------------------
 *
 * <p><b>License and Copyright: </b>The contents of this file are subject to the
 * Mozilla Public License Version 1.1 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at <a href="http://www.mozilla.org/MPL">http://www.mozilla.org/MPL/.</a></p>
 *
 * <p>Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.</p>
 *
 * <p>The entire file consists of original code.  Copyright &copy; 2003, 2004 
 * Tufts University. All rights reserved.</p>
 *
 * -----------------------------------------------------------------------------
 */

/*
 * Id.java
 *
 * Created on October 21, 2003, 4:36 PM
 */

package tufts.oki.shared;
import java.lang.*;


/**
 *  This is a complete implementation of the osid.shared.Id object.  It uses a constant
 *  called IdSource to hold a string which idenfies this particular source of Identifiers.
 *  This makes the Id strings less likely to collide with other systems which use this
 *  implementation.
 *  <p>
 *  The identifier is a string consisting of the IdSource constant concatenated with
 *  the current time (in milliseconds) epxressed as a hex string.
 *
 *  @author  Mark Norton
 */
public class Id implements osid.shared.Id {
    private static int counter = 0;
    private String id_str;
    private String IdSource = "tufts.edu";

    
    /**
     *  Uses current time in milliseconds converted to a hex string as the basis for
     *  a unique identifier.  This is appended to an IdSource string.
     *
     *  @author Mark Norton
     */
    public Id() throws osid.shared.SharedException {
        long now = System.currentTimeMillis();

        id_str = IdSource + "-" + java.lang.Long.toHexString(now) + "-" + tufts.oki.shared.Id.counter++;
    }
    
    /**
     *  This was taken from the OKI Implementation examples as another way to 
     *  create an Id object.  There are certain objects in OKI, such as Cabinet and ByteStore
     *  which might use a file name as an idenfiier.  This constructor is provided
     *  for that kind of operation, but isn't garaunteed to be globally unique.
     *
     *  @author OkiImpl_1_0_rc05
     *
     */
    public Id(String idString) throws osid.shared.SharedException {
        if (idString == null) {
            throw new osid.shared.SharedException(osid.shared.SharedException.NULL_ARGUMENT);
        }

        this.id_str = idString;
    }

    /**
     *  Get the ID string for this ID object.
     *
     *  @author Mark Norton
     *
     *  @return The string form of the id.
     */
    public String getIdString() throws osid.shared.SharedException {
        return id_str;
    }
    
    /**
     *  Check to see if this ID equals the one passed.
     *
     *  @author Mark Norton
     *
     *  @return True if this Id is equal to the one passed.
     */
    public boolean isEqual(osid.shared.Id id)  throws osid.shared.SharedException {
        return id_str.equals(id.getIdString());
    }

    public String toString() {
        return "Id[" + id_str + "]";
    }
    
}
