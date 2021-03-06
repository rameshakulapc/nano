// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * PayPal account type.
 * 
 */
public enum PayPalAccountTypeCodeType {

    /**
     * 
   * Personal account.
   * 
     */
    PERSONAL("Personal"),
  

    /**
     * 
   * Premier account.
   * 
     */
    PREMIER("Premier"),
  

    /**
     * 
   * Business account.
   * 
     */
    BUSINESS("Business"),
  

    UNKNOWN("Unknown"),
  

    INVALID("Invalid"),
  

    /**
     * 
   *  Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PayPalAccountTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PayPalAccountTypeCodeType fromValue(String v) {
        if (v != null) {
            for (PayPalAccountTypeCodeType c: PayPalAccountTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}