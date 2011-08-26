/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.anim;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.smil.OdfCalcmodeType;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.smil.OdfAccumulateType;
import org.odftoolkit.odfdom.dom.type.smil.OdfAdditiveType;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.smil.OdfRestartType;
import org.odftoolkit.odfdom.dom.type.smil.OdfRestartdefaultType;
import org.odftoolkit.odfdom.dom.type.smil.OdfFillType;
import org.odftoolkit.odfdom.dom.type.smil.OdfFilldefaultType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;

;

/**
 * ODF DOM Element implementation for element "<anim:animateMotion>".
 */
public abstract class OdfAnimatemotionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.ANIM, "animateMotion" );

    public OdfAnimatemotionElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aAttributename)
    {
        setAttributename( _aAttributename );
    }

    /**
     * Get value of attribute "svg:path".
     */
    public String getPath()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "path" ) );
    }

    /**
     * Set value of attribute "svg:path".
     */
    public void setPath( String _aPath )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "path" ), _aPath );
    }

    /**
     * Get value of attribute "svg:origin".
     */
    public String getOrigin()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "origin" ) );
    }

    /**
     * Set value of attribute "svg:origin".
     */
    public void setOrigin( String _aOrigin )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "origin" ), _aOrigin );
    }

    /**
     * Get value of attribute "smil:calcMode".
     */
    public OdfCalcmodeType getCalcmode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "calcMode" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "paced";
        }

        return OdfCalcmodeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:calcMode".
     */
    public void setCalcmode( OdfCalcmodeType _aCalcmode )
    {                    
        String aStringVal = OdfCalcmodeType.toString( _aCalcmode );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "calcMode" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:targetElement".
     */
    public String getTargetelement()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "targetElement" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:targetElement".
     */
    public void setTargetelement( String _aTargetelement )
    {                    
        String aStringVal = OdfId.toString( _aTargetelement );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "targetElement" ), aStringVal );
    }

    /**
     * Get value of attribute "anim:sub-item".
     */
    public String getSubItem()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "sub-item" ) );
    }

    /**
     * Set value of attribute "anim:sub-item".
     */
    public void setSubItem( String _aSubItem )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "sub-item" ), _aSubItem );
    }

    /**
     * Get value of attribute "smil:attributeName".
     */
    public String getAttributename()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "attributeName" ) );
    }

    /**
     * Set value of attribute "smil:attributeName".
     */
    public void setAttributename( String _aAttributename )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "attributeName" ), _aAttributename );
    }

    /**
     * Get value of attribute "smil:accumulate".
     */
    public OdfAccumulateType getAccumulate()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "accumulate" ) );
        return OdfAccumulateType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:accumulate".
     */
    public void setAccumulate( OdfAccumulateType _aAccumulate )
    {                    
        String aStringVal = OdfAccumulateType.toString( _aAccumulate );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "accumulate" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:additive".
     */
    public OdfAdditiveType getAdditive()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "additive" ) );
        return OdfAdditiveType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:additive".
     */
    public void setAdditive( OdfAdditiveType _aAdditive )
    {                    
        String aStringVal = OdfAdditiveType.toString( _aAdditive );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "additive" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:values".
     */
    public String getValues()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "values" ) );
    }

    /**
     * Set value of attribute "smil:values".
     */
    public void setValues( String _aValues )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "values" ), _aValues );
    }

    /**
     * Get value of attribute "anim:formula".
     */
    public String getFormula()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "formula" ) );
    }

    /**
     * Set value of attribute "anim:formula".
     */
    public void setFormula( String _aFormula )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "formula" ), _aFormula );
    }

    /**
     * Get value of attribute "smil:to".
     */
    public String getTo()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "to" ) );
    }

    /**
     * Set value of attribute "smil:to".
     */
    public void setTo( String _aTo )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "to" ), _aTo );
    }

    /**
     * Get value of attribute "smil:from".
     */
    public String getFrom()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "from" ) );
    }

    /**
     * Set value of attribute "smil:from".
     */
    public void setFrom( String _aFrom )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "from" ), _aFrom );
    }

    /**
     * Get value of attribute "smil:by".
     */
    public String getBy()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "by" ) );
    }

    /**
     * Set value of attribute "smil:by".
     */
    public void setBy( String _aBy )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "by" ), _aBy );
    }

    /**
     * Get value of attribute "smil:begin".
     */
    public String getBegin()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "begin" ) );
    }

    /**
     * Set value of attribute "smil:begin".
     */
    public void setBegin( String _aBegin )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "begin" ), _aBegin );
    }

    /**
     * Get value of attribute "smil:end".
     */
    public String getEnd()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "end" ) );
    }

    /**
     * Set value of attribute "smil:end".
     */
    public void setEnd( String _aEnd )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "end" ), _aEnd );
    }

    /**
     * Get value of attribute "smil:dur".
     */
    public String getDur()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "dur" ) );
    }

    /**
     * Set value of attribute "smil:dur".
     */
    public void setDur( String _aDur )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "dur" ), _aDur );
    }

    /**
     * Get value of attribute "smil:repeatDur".
     */
    public String getRepeatdur()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatDur" ) );
    }

    /**
     * Set value of attribute "smil:repeatDur".
     */
    public void setRepeatdur( String _aRepeatdur )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatDur" ), _aRepeatdur );
    }

    /**
     * Get value of attribute "smil:repeatCount".
     */
    public Integer getRepeatcount()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatCount" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:repeatCount".
     */
    public void setRepeatcount( Integer _aRepeatcount )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aRepeatcount );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatCount" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:restart".
     */
    public OdfRestartType getRestart()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restart" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "default";
        }

        return OdfRestartType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:restart".
     */
    public void setRestart( OdfRestartType _aRestart )
    {                    
        String aStringVal = OdfRestartType.toString( _aRestart );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restart" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:restartDefault".
     */
    public OdfRestartdefaultType getRestartdefault()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restartDefault" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "inherit";
        }

        return OdfRestartdefaultType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:restartDefault".
     */
    public void setRestartdefault( OdfRestartdefaultType _aRestartdefault )
    {                    
        String aStringVal = OdfRestartdefaultType.toString( _aRestartdefault );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restartDefault" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:fill".
     */
    public OdfFillType getFill()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fill" ) );
        return OdfFillType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:fill".
     */
    public void setFill( OdfFillType _aFill )
    {                    
        String aStringVal = OdfFillType.toString( _aFill );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fill" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:fillDefault".
     */
    public OdfFilldefaultType getFilldefault()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fillDefault" ) );
        return OdfFilldefaultType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:fillDefault".
     */
    public void setFilldefault( OdfFilldefaultType _aFilldefault )
    {                    
        String aStringVal = OdfFilldefaultType.toString( _aFilldefault );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fillDefault" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:accelerate".
     */
    public Double getAccelerate()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "accelerate" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0.0";
        }

        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:accelerate".
     */
    public void setAccelerate( Double _aAccelerate )
    {                    
        String aStringVal = Double.toString( _aAccelerate );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "accelerate" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:decelerate".
     */
    public Double getDecelerate()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "decelerate" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0.0";
        }

        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:decelerate".
     */
    public void setDecelerate( Double _aDecelerate )
    {                    
        String aStringVal = Double.toString( _aDecelerate );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "decelerate" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:autoReverse".
     */
    public Boolean getAutoreverse()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "autoReverse" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:autoReverse".
     */
    public void setAutoreverse( Boolean _aAutoreverse )
    {                    
        String aStringVal = OdfBoolean.toString( _aAutoreverse );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "autoReverse" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:keyTimes".
     */
    public String getKeytimes()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "keyTimes" ) );
    }

    /**
     * Set value of attribute "smil:keyTimes".
     */
    public void setKeytimes( String _aKeytimes )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "keyTimes" ), _aKeytimes );
    }

    /**
     * Get value of attribute "smil:keySplines".
     */
    public String getKeysplines()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "keySplines" ) );
    }

    /**
     * Set value of attribute "smil:keySplines".
     */
    public void setKeysplines( String _aKeysplines )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "keySplines" ), _aKeysplines );
    }

}
