/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2005 Open GIS Consortium, Inc.
 ** All Rights Reserved. http://www.opengis.org/legal/
 **
 *************************************************************************************************/
package org.opengis.temporal;

// OpenGIS direct dependencies
import org.opengis.util.InternationalString;

// J2SE direct dependencies
import java.util.Collection;

// Annotations
import org.opengis.annotation.UML;
import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * A temporal coordinate system to simplify  the computation of temporal distances
 * between points and the functional description of temporal operations.
 *
 * @author Stephane Fellah (Image Matters)
 * @author Alexander Petkov
 *
 * @revisit Retrofit in {@link org.opengis.referencing.cs.TimeCS}.
 */
@UML(identifier="TM_CoordinateSystem", specification=ISO_19108)
public interface TemporalCoordinateSystem extends TemporalReferenceSystem {
    /**
     * Position of the origin of the scale on which the temporal coordinate system is based 
     * expressed as a date in the Gregorian calendar and time of day in UTC.
     */
    @UML(identifier="origin", obligation=MANDATORY, specification=ISO_19108)
    DateAndTime getOrigin();

    /**
     * Identifies the base interval for this temporal coordinate system
     * as a unit of measure specified by ISO 31-1,
     * or a multiple of one of those units, as specified by ISO 1000.
     */
    @UML(identifier="interval", obligation=MANDATORY, specification=ISO_19108)
    InternationalString getInterval();

    /**
     * Transforms a value of a {@linkplain TemporalCoordinate coordinate} within this
     * temporal coordinate system and returns the equivalent {@linkplain DateAndTime date
     * and time} in the Gregorian Calendar and UTC 
     */
    @UML(identifier="transformCoord", obligation=MANDATORY, specification=ISO_19108)
    DateAndTime transformCoord(TemporalCoordinate coordinates);

    /**
     * Transforms a {@linkplain DateAndTime date and time} in the Gregorian Calendar and UTC
     * to an equivalent {@linkplain TemporalCoordinate coordinate} within this temporal 
     * coordinate system.
     */
    @UML(identifier="transformDateTime", obligation=MANDATORY, specification=ISO_19108)
    TemporalCoordinate transformDateTime(DateAndTime datetime);
}