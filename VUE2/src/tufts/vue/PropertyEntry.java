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
 * PropertyEntry.java
 *
 * Created on February 5, 2004, 6:39 PM
 */

package tufts.vue;

/**
 * Class to save and restore properties
 * @author  akumar03
 */
public class PropertyEntry {
    
    /** Creates a new instance of PropertyEntry */
    public PropertyEntry() {
    }
    
    Object entryKey;
    Object entryValue;
    
    public Object getEntryKey() {
        return this.entryKey;
    }
    
    public void setEntryKey(Object entryKey) {
        this.entryKey = entryKey;
    }
    
     public Object getEntryValue() {
        return this.entryValue;
    }
    
    public void setEntryValue(Object entryValue) {
        this.entryValue = entryValue;
    }

    public String toString() {
        return "PropertyEntry[" + entryKey + " val=" + entryValue + "]";
    }
    
    
    
}
