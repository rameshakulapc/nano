// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Time zone details about a region or location to which the seller is willing to
 * ship.
 * 
 */
public class TimeZoneDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TimeZoneID")
	@Order(value=0)
	public String timeZoneID;	
	
	@Element(name = "StandardLabel")
	@Order(value=1)
	public String standardLabel;	
	
	@Element(name = "StandardOffset")
	@Order(value=2)
	public String standardOffset;	
	
	@Element(name = "DaylightSavingsLabel")
	@Order(value=3)
	public String daylightSavingsLabel;	
	
	@Element(name = "DaylightSavingsOffset")
	@Order(value=4)
	public String daylightSavingsOffset;	
	
	@Element(name = "DaylightSavingsInEffect")
	@Order(value=5)
	public Boolean daylightSavingsInEffect;	
	
	@Element(name = "DetailVersion")
	@Order(value=6)
	public String detailVersion;	
	
	@Element(name = "UpdateTime")
	@Order(value=7)
	public Date updateTime;	
	
	@AnyElement
	@Order(value=8)
	public List<Object> any;	
	
    
}