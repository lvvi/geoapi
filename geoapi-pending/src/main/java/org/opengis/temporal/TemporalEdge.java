/*
 *    GeoAPI - Java interfaces for OGC/ISO standards
 *    http://www.geoapi.org
 *
 *    Copyright (C) 2006-2016 Open Geospatial Consortium, Inc.
 *    All Rights Reserved. http://www.opengeospatial.org/ogc/legal
 *
 *    Permission to use, copy, and modify this software and its documentation, with
 *    or without modification, for any purpose and without fee or royalty is hereby
 *    granted, provided that you include the following on ALL copies of the software
 *    and documentation or portions thereof, including modifications, that you make:
 *
 *    1. The full text of this NOTICE in a location viewable to users of the
 *       redistributed or derivative work.
 *    2. Notice of any changes or modifications to the OGC files, including the
 *       date changes were made.
 *
 *    THIS SOFTWARE AND DOCUMENTATION IS PROVIDED "AS IS," AND COPYRIGHT HOLDERS MAKE
 *    NO REPRESENTATIONS OR WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 *    TO, WARRANTIES OF MERCHANTABILITY OR FITNESS FOR ANY PARTICULAR PURPOSE OR THAT
 *    THE USE OF THE SOFTWARE OR DOCUMENTATION WILL NOT INFRINGE ANY THIRD PARTY
 *    PATENTS, COPYRIGHTS, TRADEMARKS OR OTHER RIGHTS.
 *
 *    COPYRIGHT HOLDERS WILL NOT BE LIABLE FOR ANY DIRECT, INDIRECT, SPECIAL OR
 *    CONSEQUENTIAL DAMAGES ARISING OUT OF ANY USE OF THE SOFTWARE OR DOCUMENTATION.
 *
 *    The name and trademarks of copyright holders may NOT be used in advertising or
 *    publicity pertaining to the software without specific, written prior permission.
 *    Title to copyright in this software and any associated documentation will at all
 *    times remain with copyright holders.
 */
package org.opengis.temporal;

import org.opengis.annotation.UML;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * One-dimensional topological primitive in time.
 *
 * @author Alexander Petkov
 * @since   2.3
 * @version 4.0
 */
@UML(identifier="TM_Edge", specification=ISO_19108)
public interface TemporalEdge extends TemporalTopologicalPrimitive {
    
    /**
     * Returns an optional association that links this {@link TemporalEdge} to the corresponding {@link Period}.
     * 
     * @return an optional association that links this {@link TemporalEdge} to the corresponding {@link Period}.
     */
    @UML(identifier="Realization", obligation=OPTIONAL, specification=ISO_19108)
    Period getRealization();

    /**
     * Returns association that links this {@link TemporalEdge} to the {@link TemporalNode} that is its start.
     * The {@link TemporalEdge} 
     * 
     * @return association that links this {@link TemporalEdge} to the {@link TemporalNode} that is its start.
     */
    @UML(identifier="start", obligation=MANDATORY, specification=ISO_19108)
    TemporalNode getStart();

    /**
     * Returns association that links this {@link TemporalEdge} to the {@link TemporalNode} that is its ends.
     * 
     * @return association that links this {@link TemporalEdge} to the {@link TemporalNode} that is its ends.
     */
    @UML(identifier="end", obligation=MANDATORY, specification=ISO_19108)
    TemporalNode getEnd();
}
