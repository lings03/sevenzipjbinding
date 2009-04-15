package net.sf.sevenzip;

/**
 * Container for property information attributes.
 * 
 * @author Boris Brodski
 * 
 */
public class PropertyInfo {
	/**
	 * Name of property. <code>null</code> for some archive types.
	 */
	public String name;

	/**
	 * Native property index
	 */
	public PropID propID;

	/**
	 * Type of the property values
	 */
	public Class<?> varType;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "name=" + name + "; propID=" + propID + "; varType="
				+ varType.getCanonicalName();
	}
}
