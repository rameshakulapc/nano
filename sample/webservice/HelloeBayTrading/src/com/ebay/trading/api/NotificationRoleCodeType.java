// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Defines roles for platform notifications.
 * 
 */
public enum NotificationRoleCodeType {

    /**
     * 
   * (in) Specifies that you want to set or return application-level
   * preferences. Default value.
   * 
     */
    APPLICATION("Application"),
  

    /**
     * 
   * (in) Specifies that you want to set or return user-level preferences.
   * 
     */
    USER("User"),
  

    /**
     * 
   * (in) Specifies that you want to set or return user data-level preferences.
   * 
     */
    USER_DATA("UserData"),
  

    /**
     * 
   * (in) Specifies that you want to set or return event-level preferences.
   * 
     */
    EVENT("Event"),
  

    /**
     * 
   * Reserved for future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    NotificationRoleCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static NotificationRoleCodeType fromValue(String v) {
        if (v != null) {
            for (NotificationRoleCodeType c: NotificationRoleCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}