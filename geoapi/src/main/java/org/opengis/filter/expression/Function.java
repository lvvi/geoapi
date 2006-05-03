/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $URL$
 **
 ** Copyright (C) 2005 Open GIS Consortium, Inc.
 ** All Rights Reserved. http://www.opengis.org/legal/
 **
 *************************************************************************************************/
package org.opengis.filter.expression;

// Annotations
import java.util.List;

import org.opengis.annotation.XmlElement;


/**
 * Instances of this class represent a function call into some implementation-specific
 * function.  This is included for completeness with respect to the
 * OGC Filter specification.  However, no functions are required to be supported
 * by that specification.
 *
 * @version <A HREF="http://www.opengis.org/docs/02-059.pdf">Implementation specification 1.0</A>
 * @author Chris Dillard (SYS Technologies)
 * @since GeoAPI 2.0
 */
@XmlElement("Function")
public interface Function extends Expression {
    /**
     * Returns the name of the function to be called.  For example, this might
     * be "{@code cos}" or "{@code atan2}".
     */
    String getName();
    
    /**
     * The name of the function to be called.
     * <p>
     * For example, this might be "{@code cos}" or "{@code atan2}".
     * 
     * @param name The name of the function to be called
     */
    void setName( String name );

    /**
     * Returns the list subexpressions that will be evaluated to provide the
     * parameters to the function.
     */
    List<Expression> getParameters();
    
    /**
     * Returns the subexpressions that will be evaluated to provide the
     * parameters to the function.
     * @param parameters List of subexpression to evaulate as parameters to this function.
     */
    void setParameters(List<Expression> parameters);
}