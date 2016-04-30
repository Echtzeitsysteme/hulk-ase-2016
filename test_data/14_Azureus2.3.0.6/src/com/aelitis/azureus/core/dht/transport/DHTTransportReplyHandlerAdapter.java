/*
 * Created on 12-Jan-2005
 * Created by Paul Gardner
 * Copyright (C) 2004 Aelitis, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * 
 * AELITIS, SARL au capital de 30,000 euros
 * 8 Allee Lenotre, La Grille Royale, 78600 Le Mesnil le Roi, France.
 *
 */

package com.aelitis.azureus.core.dht.transport;

/**
 * @author parg
 *
 */

public abstract class 
DHTTransportReplyHandlerAdapter
	implements DHTTransportReplyHandler
{
	public void
	pingReply(
		DHTTransportContact contact )
	{
		throw( new RuntimeException( "Not implemented" ));
	}
	
	public void
	statsReply(
		DHTTransportContact 	contact,
		DHTTransportFullStats	stats )
	{
		throw( new RuntimeException( "Not implemented" ));
	}
			
	public void
	storeReply(
		DHTTransportContact contact,
		byte[]				diversifications )
	{
		throw( new RuntimeException( "Not implemented" ));
	}
	
	public void
	findNodeReply(
		DHTTransportContact 	contact,
		DHTTransportContact[]	contacts )
	{
		throw( new RuntimeException( "Not implemented" ));
	}
	
	public void
	findValueReply(
		DHTTransportContact 	contact,
		DHTTransportValue[]		values,
		byte					diversification_type,
		boolean					more_to_come )
	{
		throw( new RuntimeException( "Not implemented" ));
	}
	
	public void
	findValueReply(
		DHTTransportContact 	contact,
		DHTTransportContact[]	contacts )
	{
		throw( new RuntimeException( "Not implemented" ));
	}
	/*
	public void
	failed(
		DHTTransportContact 	contact )
	{
		throw( new RuntimeException( "Not implemented" ));
	}
	*/
}
