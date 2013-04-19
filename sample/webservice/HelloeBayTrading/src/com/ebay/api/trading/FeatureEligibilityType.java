// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Indicates whether the seller making the request can list with certain features.
 * A seller's eligibility is determined by their feedback rating.
 * 
 */
public class FeatureEligibilityType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "QualifiesForBuyItNow")
	@Order(value=0)
	public Boolean qualifiesForBuyItNow;	
	
	@Element(name = "QualifiesForBuyItNowMultiple")
	@Order(value=1)
	public Boolean qualifiesForBuyItNowMultiple;	
	
	@Element(name = "QualifiedForFixedPriceOneDayDuration")
	@Order(value=2)
	public Boolean qualifiedForFixedPriceOneDayDuration;	
	
	@Element(name = "QualifiesForVariations")
	@Order(value=3)
	public Boolean qualifiesForVariations;	
	
	@Element(name = "QualifiedForAuctionOneDayDuration")
	@Order(value=4)
	public Boolean qualifiedForAuctionOneDayDuration;	
	
	@AnyElement
	@Order(value=5)
	public List<Object> any;	
	
    
}