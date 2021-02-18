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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link TrafficForecastSegment} objects.
 *             
 *             @param trafficForecastSegments the traffic forecast segments to create
 *             @return the persisted traffic forecast segments with their IDs populated
 *             @throws ApiException if there is an error creating the traffic forecast segments
 *           
 * 
 * <p>Java class for createTrafficForecastSegments element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createTrafficForecastSegments">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="trafficForecastSegments" type="{https://www.google.com/apis/ads/publisher/v202102}TrafficForecastSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trafficForecastSegments"
})
@XmlRootElement(name = "createTrafficForecastSegments")
public class AdjustmentServiceInterfacecreateTrafficForecastSegments {

    protected List<TrafficForecastSegment> trafficForecastSegments;

    /**
     * Gets the value of the trafficForecastSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficForecastSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficForecastSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficForecastSegment }
     * 
     * 
     */
    public List<TrafficForecastSegment> getTrafficForecastSegments() {
        if (trafficForecastSegments == null) {
            trafficForecastSegments = new ArrayList<TrafficForecastSegment>();
        }
        return this.trafficForecastSegments;
    }

}
