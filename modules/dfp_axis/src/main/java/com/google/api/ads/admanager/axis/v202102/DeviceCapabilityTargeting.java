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

/**
 * DeviceCapabilityTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202102;


/**
 * Represents device capabilities that are being targeted or excluded
 * by the {@link LineItem}.
 */
public class DeviceCapabilityTargeting  implements java.io.Serializable {
    /* Device capabilities that are being targeted by the {@link LineItem}. */
    private com.google.api.ads.admanager.axis.v202102.Technology[] targetedDeviceCapabilities;

    /* Device capabilities that are being excluded by the {@link LineItem}. */
    private com.google.api.ads.admanager.axis.v202102.Technology[] excludedDeviceCapabilities;

    public DeviceCapabilityTargeting() {
    }

    public DeviceCapabilityTargeting(
           com.google.api.ads.admanager.axis.v202102.Technology[] targetedDeviceCapabilities,
           com.google.api.ads.admanager.axis.v202102.Technology[] excludedDeviceCapabilities) {
           this.targetedDeviceCapabilities = targetedDeviceCapabilities;
           this.excludedDeviceCapabilities = excludedDeviceCapabilities;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excludedDeviceCapabilities", getExcludedDeviceCapabilities())
            .add("targetedDeviceCapabilities", getTargetedDeviceCapabilities())
            .toString();
    }

    /**
     * Gets the targetedDeviceCapabilities value for this DeviceCapabilityTargeting.
     * 
     * @return targetedDeviceCapabilities   * Device capabilities that are being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.admanager.axis.v202102.Technology[] getTargetedDeviceCapabilities() {
        return targetedDeviceCapabilities;
    }


    /**
     * Sets the targetedDeviceCapabilities value for this DeviceCapabilityTargeting.
     * 
     * @param targetedDeviceCapabilities   * Device capabilities that are being targeted by the {@link LineItem}.
     */
    public void setTargetedDeviceCapabilities(com.google.api.ads.admanager.axis.v202102.Technology[] targetedDeviceCapabilities) {
        this.targetedDeviceCapabilities = targetedDeviceCapabilities;
    }

    public com.google.api.ads.admanager.axis.v202102.Technology getTargetedDeviceCapabilities(int i) {
        return this.targetedDeviceCapabilities[i];
    }

    public void setTargetedDeviceCapabilities(int i, com.google.api.ads.admanager.axis.v202102.Technology _value) {
        this.targetedDeviceCapabilities[i] = _value;
    }


    /**
     * Gets the excludedDeviceCapabilities value for this DeviceCapabilityTargeting.
     * 
     * @return excludedDeviceCapabilities   * Device capabilities that are being excluded by the {@link LineItem}.
     */
    public com.google.api.ads.admanager.axis.v202102.Technology[] getExcludedDeviceCapabilities() {
        return excludedDeviceCapabilities;
    }


    /**
     * Sets the excludedDeviceCapabilities value for this DeviceCapabilityTargeting.
     * 
     * @param excludedDeviceCapabilities   * Device capabilities that are being excluded by the {@link LineItem}.
     */
    public void setExcludedDeviceCapabilities(com.google.api.ads.admanager.axis.v202102.Technology[] excludedDeviceCapabilities) {
        this.excludedDeviceCapabilities = excludedDeviceCapabilities;
    }

    public com.google.api.ads.admanager.axis.v202102.Technology getExcludedDeviceCapabilities(int i) {
        return this.excludedDeviceCapabilities[i];
    }

    public void setExcludedDeviceCapabilities(int i, com.google.api.ads.admanager.axis.v202102.Technology _value) {
        this.excludedDeviceCapabilities[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceCapabilityTargeting)) return false;
        DeviceCapabilityTargeting other = (DeviceCapabilityTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedDeviceCapabilities==null && other.getTargetedDeviceCapabilities()==null) || 
             (this.targetedDeviceCapabilities!=null &&
              java.util.Arrays.equals(this.targetedDeviceCapabilities, other.getTargetedDeviceCapabilities()))) &&
            ((this.excludedDeviceCapabilities==null && other.getExcludedDeviceCapabilities()==null) || 
             (this.excludedDeviceCapabilities!=null &&
              java.util.Arrays.equals(this.excludedDeviceCapabilities, other.getExcludedDeviceCapabilities())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTargetedDeviceCapabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedDeviceCapabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedDeviceCapabilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedDeviceCapabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedDeviceCapabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedDeviceCapabilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceCapabilityTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "DeviceCapabilityTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedDeviceCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "targetedDeviceCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedDeviceCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "excludedDeviceCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
