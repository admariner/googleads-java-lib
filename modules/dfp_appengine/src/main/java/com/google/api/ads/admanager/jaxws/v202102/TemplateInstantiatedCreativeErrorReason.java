// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202102;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateInstantiatedCreativeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateInstantiatedCreativeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INACTIVE_CREATIVE_TEMPLATE"/>
 *     &lt;enumeration value="FILE_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemplateInstantiatedCreativeError.Reason")
@XmlEnum
public enum TemplateInstantiatedCreativeErrorReason {


    /**
     * 
     *                 A new creative cannot be created from an inactive creative template.
     *               
     * 
     */
    INACTIVE_CREATIVE_TEMPLATE,

    /**
     * 
     *                 An uploaded file type is not allowed
     *               
     * 
     */
    FILE_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static TemplateInstantiatedCreativeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
