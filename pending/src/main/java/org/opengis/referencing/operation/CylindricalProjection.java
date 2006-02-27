/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003-2005 Open GIS Consortium, Inc.
 ** All Rights Reserved. http://www.opengis.org/legal/
 **
 *************************************************************************************************/
package org.opengis.referencing.operation;

// Annotations
import org.opengis.annotation.Extension;


/**
 * Base interface for cylindrical map projections.
 *
 * <p>&nbsp;</p>
 * <p align="center"><img src="../doc-files/CylindricalProjection.png"></p>
 *
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 *
 * @see org.opengis.referencing.crs.ProjectedCRS
 * @see <A HREF="http://mathworld.wolfram.com/CylindricalProjection.html">Cylindrical projection on MathWorld</A>
 */
@Extension
public interface CylindricalProjection extends Projection {
}