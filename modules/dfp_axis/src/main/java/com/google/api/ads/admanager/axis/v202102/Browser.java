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
 * Browser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202102;


/**
 * Represents an internet browser.
 */
public class Browser  extends com.google.api.ads.admanager.axis.v202102.Technology  implements java.io.Serializable {
    /* Browser major version. */
    private java.lang.String majorVersion;

    /* Browser minor version. */
    private java.lang.String minorVersion;

    public Browser() {
    }

    public Browser(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String majorVersion,
           java.lang.String minorVersion) {
        super(
            id,
            name);
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("majorVersion", getMajorVersion())
            .add("minorVersion", getMinorVersion())
            .add("name", getName())
            .toString();
    }

    /**
     * Gets the majorVersion value for this Browser.
     * 
     * @return majorVersion   * Browser major version.
     */
    public java.lang.String getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this Browser.
     * 
     * @param majorVersion   * Browser major version.
     */
    public void setMajorVersion(java.lang.String majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this Browser.
     * 
     * @return minorVersion   * Browser minor version.
     */
    public java.lang.String getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this Browser.
     * 
     * @param minorVersion   * Browser minor version.
     */
    public void setMinorVersion(java.lang.String minorVersion) {
        this.minorVersion = minorVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Browser)) return false;
        Browser other = (Browser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.majorVersion==null && other.getMajorVersion()==null) || 
             (this.majorVersion!=null &&
              this.majorVersion.equals(other.getMajorVersion()))) &&
            ((this.minorVersion==null && other.getMinorVersion()==null) || 
             (this.minorVersion!=null &&
              this.minorVersion.equals(other.getMinorVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMajorVersion() != null) {
            _hashCode += getMajorVersion().hashCode();
        }
        if (getMinorVersion() != null) {
            _hashCode += getMinorVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Browser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "Browser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "minorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
