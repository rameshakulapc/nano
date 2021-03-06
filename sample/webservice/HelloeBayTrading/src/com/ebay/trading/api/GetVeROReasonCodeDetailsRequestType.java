// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves details for VeRO reason codes and their descriptions. You can specify a
 * reason code ID to get details for a specific reason on the site specified in the
 * request header. If ReasonCodeID is not passed in the request, all reason codes are
 * returned. Set ReturnAllSites to true to retrieve reason codes for all sites.
 * You must be a member of the Verified Rights Owner (VeRO) Program to use this call.
 * 
 */
@RootElement(name = "GetVeROReasonCodeDetailsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetVeROReasonCodeDetailsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ReasonCodeID")
	@Order(value=0)
	public Long reasonCodeID;	
	
	@Element(name = "ReturnAllSites")
	@Order(value=1)
	public Boolean returnAllSites;	
	
    
}