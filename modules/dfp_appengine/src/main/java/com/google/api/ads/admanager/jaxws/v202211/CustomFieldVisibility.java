// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="API_ONLY"/>
 *     &lt;enumeration value="READ_ONLY"/>
 *     &lt;enumeration value="FULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldVisibility")
@XmlEnum
public enum CustomFieldVisibility {


    /**
     * 
     *                 Only visible through the API.
     *               
     * 
     */
    API_ONLY,

    /**
     * 
     *                 Visible in the UI, but only editable through the API
     *               
     * 
     */
    READ_ONLY,

    /**
     * 
     *                 Visible and editable both in the API and the UI.
     *               
     * 
     */
    FULL;

    public String value() {
        return name();
    }

    public static CustomFieldVisibility fromValue(String v) {
        return valueOf(v);
    }

}
