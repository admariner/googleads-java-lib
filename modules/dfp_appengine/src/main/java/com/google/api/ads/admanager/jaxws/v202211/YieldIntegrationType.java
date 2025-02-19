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
 * <p>Java class for YieldIntegrationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YieldIntegrationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CUSTOM_EVENT"/>
 *     &lt;enumeration value="SDK"/>
 *     &lt;enumeration value="OPEN_BIDDING"/>
 *     &lt;enumeration value="NETWORK_BIDDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YieldIntegrationType")
@XmlEnum
public enum YieldIntegrationType {

    UNKNOWN,
    CUSTOM_EVENT,
    SDK,
    OPEN_BIDDING,
    NETWORK_BIDDING;

    public String value() {
        return name();
    }

    public static YieldIntegrationType fromValue(String v) {
        return valueOf(v);
    }

}
