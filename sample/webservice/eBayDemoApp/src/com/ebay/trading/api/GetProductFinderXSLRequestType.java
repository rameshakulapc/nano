// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated as the call is no longer available.
 * 
 * 
 */
@RootElement(name = "GetProductFinderXSLRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetProductFinderXSLRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FileName")
	@Order(value=0)
	public String fileName;	
	
	@Element(name = "FileVersion")
	@Order(value=1)
	public String fileVersion;	
	
    
}