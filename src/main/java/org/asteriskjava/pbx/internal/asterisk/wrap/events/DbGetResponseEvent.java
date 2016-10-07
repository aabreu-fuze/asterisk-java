package org.asteriskjava.pbx.internal.asterisk.wrap.events;

import org.apache.log4j.Logger;

public class DbGetResponseEvent extends ManagerEvent
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(DbGetResponseEvent.class);

	private final String family;
	private final String key;
	private final String val;

	DbGetResponseEvent(final org.asteriskjava.manager.event.DbGetResponseEvent event)
	{
		super(event);
		this.family = event.getFamily();
		this.key = event.getKey();
		this.val = event.getVal();
	}

	public String getVal()
	{
		return this.val;
	}

	public String getFamily()
	{
		return this.family;
	}

	public String getKey()
	{
		return this.key;
	}

}
