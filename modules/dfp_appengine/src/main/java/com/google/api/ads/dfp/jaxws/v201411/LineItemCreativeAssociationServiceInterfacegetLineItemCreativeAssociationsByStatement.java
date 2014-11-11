
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link LineItemCreativeAssociationPage} of
 *             {@link LineItemCreativeAssociation} objects that satisfy the given
 *             {@link Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code creativeId}</td>
 *             <td>{@link LineItemCreativeAssociation#creativeId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code manualCreativeRotationWeight}</td>
 *             <td>{@link LineItemCreativeAssociation#manualCreativeRotationWeight}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code destinationUrl}</td>
 *             <td>{@link LineItemCreativeAssociation#destinationUrl}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lineItemId}</td>
 *             <td>{@link LineItemCreativeAssociation#lineItemId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link LineItemCreativeAssociation#status}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lastModifiedDateTime}</td>
 *             <td>{@link LineItemCreativeAssociation#lastModifiedDateTime}</td>
 *             </tr>
 *             </table>
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of line item creative associations
 *             @return the line item creative associations that match the given filter
 *           
 * 
 * <p>Java class for getLineItemCreativeAssociationsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getLineItemCreativeAssociationsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201411}Statement" minOccurs="0"/>
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
    "filterStatement"
})
@XmlRootElement(name = "getLineItemCreativeAssociationsByStatement")
public class LineItemCreativeAssociationServiceInterfacegetLineItemCreativeAssociationsByStatement {

    protected Statement filterStatement;

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
