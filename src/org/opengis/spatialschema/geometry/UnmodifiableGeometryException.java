/**************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.spatialschema.geometry;


/**
 * Indicates that an operation is not allowed on a {@linkplain Geometry geometry} object
 * because it is unmodifiable. Note that unmodifiable geometries are not necessarily immutable;
 * they are just not allowed to be modified through the <code>setFoo(...)</code> method that
 * raised this exception. Whatever an unmodifiable geometry is immutable or not is
 * implementation dependent.
 *
 * @version 1.0
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 */
public class UnmodifiableGeometryException extends UnsupportedOperationException {
    /**
     * Serial number for interoperability with different versions.
     */
    private static final long serialVersionUID = 8679047625299612669L;

    /**
     * Creates an exception with no message.
     */
    public UnmodifiableGeometryException() {
        super();
    }
    
    /**
     * Creates an exception with the specified message.
     *
     * @param  message The detail message. The detail message is saved for 
     *         later retrieval by the {@link #getMessage()} method.
     */
    public UnmodifiableGeometryException(final String message) {
        super(message);
    }    
}