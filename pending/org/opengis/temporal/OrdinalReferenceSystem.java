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

// J2SE direct dependencies
import java.util.Collection;

// OpenGIS direct dependencies
import org.opengis.util.InternationalString;

// Annotations
import org.opengis.annotation.UML;
import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * Provides only the attributes inherited from temporal reference system.
 * 
 * @author Alexander Petkov
 *
 * @revisit The javadoc doesn't seem accurate.
 * @revisit Missing UML annotations.
 */
public interface OrdinalReferenceSystem extends TemporalReferenceSystem {
	/**
     * Get the set of ordinal eras of which this ordinal reference system consists of.
     *
     * @return A hierarchically-structured collection of ordinal eras.
     *
     * @revisit What the structure is exactly?
     */
    @UML(identifier="structure", obligation=MANDATORY,specification=ISO_19108)
    Collection<OrdinalEra> getOrdinalEraSequence();
}