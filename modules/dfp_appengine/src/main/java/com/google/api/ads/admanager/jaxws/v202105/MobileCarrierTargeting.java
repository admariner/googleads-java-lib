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


package com.google.api.ads.admanager.jaxws.v202105;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents mobile carriers that are being targeted or excluded by the {@link LineItem}.
 *           
 * 
 * <p>Java class for MobileCarrierTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileCarrierTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isTargeted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mobileCarriers" type="{https://www.google.com/apis/ads/publisher/v202105}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileCarrierTargeting", propOrder = {
    "isTargeted",
    "mobileCarriers"
})
public class MobileCarrierTargeting {

    protected Boolean isTargeted;
    protected List<Technology> mobileCarriers;

    /**
     * Gets the value of the isTargeted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTargeted() {
        return isTargeted;
    }

    /**
     * Sets the value of the isTargeted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTargeted(Boolean value) {
        this.isTargeted = value;
    }

    /**
     * Gets the value of the mobileCarriers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileCarriers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileCarriers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getMobileCarriers() {
        if (mobileCarriers == null) {
            mobileCarriers = new ArrayList<Technology>();
        }
        return this.mobileCarriers;
    }

}
