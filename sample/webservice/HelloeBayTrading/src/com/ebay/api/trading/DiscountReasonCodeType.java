// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * The nature of the discount.
 * 
 */
public enum DiscountReasonCodeType {

    /**
     * 
   * An offer that applies to a limited number of listings during the offering
   * period. Example:  "There is no insertion fee for up to 5 auctions when
   * listing between 12/1 and 12/10."
   * 
     */
    SPECIAL_OFFER("SpecialOffer"),
  

    /**
     * 
   * An offer that applies to an unlimited number of listings during the offering
   * period. Example:  "Get subtitle for $0.10 in Tech category when listing between
   * 12/25 and 12/28.  No limit to the number of items listed during this period."
   * 
     */
    PROMOTION("Promotion"),
  

    /**
     * 
   * Reserved for future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DiscountReasonCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DiscountReasonCodeType fromValue(String v) {
        if (v != null) {
            for (DiscountReasonCodeType c: DiscountReasonCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}