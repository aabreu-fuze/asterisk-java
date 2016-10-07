package org.asteriskjava.pbx;

import org.asteriskjava.pbx.internal.core.TechType;

/**
 * Provides an abstract interface for entities which can be dialed.
 * 
 * This encompasses entities such as: Phone extensions SIPPeers Asterisk
 * extensions External phone numbers
 * 
 * @author bsutton
 * 
 */
public interface EndPoint extends Comparable<EndPoint>
{
	public boolean isSame(EndPoint rhs);

	public boolean isLocal();

	public boolean isSIP();

	/**
	 * Returns the fully qualified name of the EndPoint including the tech. e.g.
	 * SIP/100
	 * 
	 * @return
	 */
	public String getFullyQualifiedName();

	/**
	 * Returns the simple name of the EndPoint sans the tech. e.g. SIP/100 would
	 * be returned as 100.
	 * 
	 * @return
	 */
	public String getSimpleName();

	/**
	 * Returns the simple name of a SIP EndPoint sans the tech. e.g. SIP/100
	 * would be returned as 100. If the endpoint is not actually a SIP end point
	 * then this method returns the full end point name.
	 *
	 * 
	 * @return
	 */
	public String getSIPSimpleName();

	/**
	 * Returns true if the tech is not know for this end point.
	 * 
	 * @return
	 */
	public boolean isUnknown();

	/**
	 * Returns the Tech that is used to reach this endpoint.
	 * 
	 * @return
	 */
	public TechType getTech();

	public boolean isEmpty();

	/**
	 * Sets the tech on the end point to the specified tech.
	 * 
	 * @param sip
	 */
	// public void setTech(Tech tech);

}
