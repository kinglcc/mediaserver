/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.mobicents.media.server.spi;

/**
 *
 * @author kulikov
 * @author Henrique Rosa (henrique.rosa@telestax.com)
 */
public interface ServerManager {

    /**
     * Gets the control protocol supported by the controller.
     * 
     * @return The control protocol
     */
    ControlProtocol getControlProtocol();

    /**
     * Activates the Media Server Controller.
     * 
     * @throws IllegalStateException If the controller is already active.
     */
    void activate() throws IllegalStateException;

    /**
     * Deactivates the Media Server Controller.
     * 
     * @throws IllegalStateException If the controller is already inactive.
     */
    void deactivate() throws IllegalStateException;

    /**
     * Gets whether the controller is active
     * 
     * @return True if active; otherwise false.
     */
    boolean isActive();

    /**
     * Notifies manager that given endpoint has been started.
     * 
     * @param endpoint the started endpoint.
     */
    public void onStarted(Endpoint endpoint, EndpointInstaller installer);

    /**
     * Notifies manager that given endpoint has been stopped.
     * 
     * @param endpoint the started endpoint.
     */
    public void onStopped(Endpoint endpoint);
}
