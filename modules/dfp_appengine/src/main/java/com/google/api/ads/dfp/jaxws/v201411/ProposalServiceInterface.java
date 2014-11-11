
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for adding, updating and retrieving {@link Proposal} objects.
 *       <p>
 *       To use this service, you need to have the new sales management solution
 *       enabled on your network. If you do not see a "Sales" tab in
 *       <a href="https://www.google.com/dfp">DoubleClick for Publishers (DFP)</a>,
 *       you will not be able to use this service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ProposalServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProposalServiceInterface {


    /**
     * 
     *         Creates new {@link Proposal} objects.
     *         
     *         For each proposal, the following fields are required:
     *         <ul>
     *         <li>{@link Proposal#name}</li>
     *         </ul>
     *         
     *         @param proposals the proposals to create
     *         @return the created proposals with their IDs filled in
     *       
     * 
     * @param proposals
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.Proposal>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "createProposals", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.ProposalServiceInterfacecreateProposals")
    @ResponseWrapper(localName = "createProposalsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.ProposalServiceInterfacecreateProposalsResponse")
    public List<Proposal> createProposals(
        @WebParam(name = "proposals", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        List<Proposal> proposals)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ProposalPage} of {@link Proposal} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Proposal#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Proposal#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Proposal#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link Proposal#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code approvalStatus}</td>
     *         <td>{@link Proposal#approvalStatus}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Proposal#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code thirdPartyAdServerId}</td>
     *         <td>{@link Proposal#thirdPartyAdServerId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code customThirdPartyAdServerName}</td>
     *         <td>{@link Proposal#customThirdPartyAdServerName}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of proposals
     *         @return the proposals that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201411.ProposalPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "getProposalsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.ProposalServiceInterfacegetProposalsByStatement")
    @ResponseWrapper(localName = "getProposalsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.ProposalServiceInterfacegetProposalsByStatementResponse")
    public ProposalPage getProposalsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Proposal} objects that match the given {@link Statement#query}.
     *         
     *         The following fields are also required when submitting proposals for approval:
     *         <ul>
     *         <li>{@link Proposal#advertiser}</li>
     *         <li>{@link Proposal#primarySalesperson}</li>
     *         <li>{@link Proposal#primaryTraffickerId}</li>
     *         </ul>
     *         
     *         @param proposalAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter a set of proposals
     *         @return the result of the action performed
     *       
     * 
     * @param proposalAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201411.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "performProposalAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.ProposalServiceInterfaceperformProposalAction")
    @ResponseWrapper(localName = "performProposalActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.ProposalServiceInterfaceperformProposalActionResponse")
    public UpdateResult performProposalAction(
        @WebParam(name = "proposalAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        ProposalAction proposalAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Proposal} objects.
     *         
     *         @param proposals the proposals to update
     *         @return the updated proposals
     *       
     * 
     * @param proposals
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.Proposal>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "updateProposals", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.ProposalServiceInterfaceupdateProposals")
    @ResponseWrapper(localName = "updateProposalsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.ProposalServiceInterfaceupdateProposalsResponse")
    public List<Proposal> updateProposals(
        @WebParam(name = "proposals", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        List<Proposal> proposals)
        throws ApiException_Exception
    ;

}
