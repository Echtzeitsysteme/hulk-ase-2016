/*
 * Created on 14-Jul-2004
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

package com.aelitis.azureus.core;

/**
 * @author parg
 *
 */

public interface 
AzureusCoreLifecycleListener 
{
	public void
	componentCreated(
		AzureusCore				core,
		AzureusCoreComponent	component );
	
	public void
	started(
		AzureusCore		core );
	
	public void
	stopped(
		AzureusCore		core );
	
		/**
		 * return true if the request has been accepted (and hence the listener will arrange for a stop to occur
		 * @param core
		 * @return
		 */
	
	public boolean
	stopRequested(
		AzureusCore		core )
	
		throws AzureusCoreException;
	
	public boolean
	restartRequested(
		AzureusCore		core )
	
		throws AzureusCoreException;

}