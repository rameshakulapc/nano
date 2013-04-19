// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Fields in this type provide IDs and values for item conditions
 * (in GetCategoryFeatures).
 * 
 */
public class ConditionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ID")
	@Order(value=0)
	public Integer id;	
	
	@Element(name = "DisplayName")
	@Order(value=1)
	public String displayName;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}