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


package com.google.api.ads.admanager.jaxws.v202202;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link Order} objects.
 *           
 * 
 * <p>Java class for OrderAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAction")
@XmlSeeAlso({
    UnarchiveOrders.class,
    DeleteOrders.class,
    ResumeOrders.class,
    ArchiveOrders.class,
    DisapproveOrdersWithoutReservationChanges.class,
    RetractOrders.class,
    PauseOrders.class,
    SubmitOrdersForApproval.class,
    ApproveOrdersWithoutReservationChanges.class,
    DisapproveOrders.class,
    ApproveOrders.class,
    SubmitOrdersForApprovalWithoutReservationChanges.class,
    RetractOrdersWithoutReservationChanges.class
})
public abstract class OrderAction {


}
