// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A container node that identifies a category that has one of the features
 * specified in FeatureID (in GetCategoryFeaturesRequest).
 * 
 */
public class CategoryFeatureType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	@Order(value=0)
	public String categoryID;	
	
	@Element(name = "ListingDuration")
	@Order(value=1)
	public List<ListingDurationReferenceType> listingDuration;	
	
	@Element(name = "ShippingTermsRequired")
	@Order(value=2)
	public Boolean shippingTermsRequired;	
	
	@Element(name = "BestOfferEnabled")
	@Order(value=3)
	public Boolean bestOfferEnabled;	
	
	@Element(name = "DutchBINEnabled")
	@Order(value=4)
	public Boolean dutchBINEnabled;	
	
	@Element(name = "UserConsentRequired")
	@Order(value=5)
	public Boolean userConsentRequired;	
	
	@Element(name = "HomePageFeaturedEnabled")
	@Order(value=6)
	public Boolean homePageFeaturedEnabled;	
	
	@Element(name = "ProPackEnabled")
	@Order(value=7)
	public Boolean proPackEnabled;	
	
	@Element(name = "BasicUpgradePackEnabled")
	@Order(value=8)
	public Boolean basicUpgradePackEnabled;	
	
	@Element(name = "ValuePackEnabled")
	@Order(value=9)
	public Boolean valuePackEnabled;	
	
	@Element(name = "ProPackPlusEnabled")
	@Order(value=10)
	public Boolean proPackPlusEnabled;	
	
	@Element(name = "AdFormatEnabled")
	@Order(value=11)
	public AdFormatEnabledCodeType adFormatEnabled;	
	
	@Element(name = "BestOfferCounterEnabled")
	@Order(value=12)
	public Boolean bestOfferCounterEnabled;	
	
	@Element(name = "BestOfferAutoDeclineEnabled")
	@Order(value=13)
	public Boolean bestOfferAutoDeclineEnabled;	
	
	@Element(name = "LocalMarketSpecialitySubscription")
	@Order(value=14)
	public Boolean localMarketSpecialitySubscription;	
	
	@Element(name = "LocalMarketRegularSubscription")
	@Order(value=15)
	public Boolean localMarketRegularSubscription;	
	
	@Element(name = "LocalMarketPremiumSubscription")
	@Order(value=16)
	public Boolean localMarketPremiumSubscription;	
	
	@Element(name = "LocalMarketNonSubscription")
	@Order(value=17)
	public Boolean localMarketNonSubscription;	
	
	@Element(name = "ExpressEnabled")
	@Order(value=18)
	public Boolean expressEnabled;	
	
	@Element(name = "ExpressPicturesRequired")
	@Order(value=19)
	public Boolean expressPicturesRequired;	
	
	@Element(name = "ExpressConditionRequired")
	@Order(value=20)
	public Boolean expressConditionRequired;	
	
	@Element(name = "MinimumReservePrice")
	@Order(value=21)
	public Double minimumReservePrice;	
	
	@Element(name = "SellerContactDetailsEnabled")
	@Order(value=22)
	public Boolean sellerContactDetailsEnabled;	
	
	@Element(name = "TransactionConfirmationRequestEnabled")
	@Order(value=23)
	public Boolean transactionConfirmationRequestEnabled;	
	
	@Element(name = "StoreInventoryEnabled")
	@Order(value=24)
	public Boolean storeInventoryEnabled;	
	
	@Element(name = "SkypeMeTransactionalEnabled")
	@Order(value=25)
	public Boolean skypeMeTransactionalEnabled;	
	
	@Element(name = "SkypeMeNonTransactionalEnabled")
	@Order(value=26)
	public Boolean skypeMeNonTransactionalEnabled;	
	
	@Element(name = "ClassifiedAdPaymentMethodEnabled")
	@Order(value=27)
	public ClassifiedAdPaymentMethodEnabledCodeType classifiedAdPaymentMethodEnabled;	
	
	@Element(name = "ClassifiedAdShippingMethodEnabled")
	@Order(value=28)
	public Boolean classifiedAdShippingMethodEnabled;	
	
	@Element(name = "ClassifiedAdBestOfferEnabled")
	@Order(value=29)
	public ClassifiedAdBestOfferEnabledCodeType classifiedAdBestOfferEnabled;	
	
	@Element(name = "ClassifiedAdCounterOfferEnabled")
	@Order(value=30)
	public Boolean classifiedAdCounterOfferEnabled;	
	
	@Element(name = "ClassifiedAdAutoDeclineEnabled")
	@Order(value=31)
	public Boolean classifiedAdAutoDeclineEnabled;	
	
	@Element(name = "ClassifiedAdContactByPhoneEnabled")
	@Order(value=32)
	public Boolean classifiedAdContactByPhoneEnabled;	
	
	@Element(name = "ClassifiedAdContactByEmailEnabled")
	@Order(value=33)
	public Boolean classifiedAdContactByEmailEnabled;	
	
	@Element(name = "SafePaymentRequired")
	@Order(value=34)
	public Boolean safePaymentRequired;	
	
	@Element(name = "ClassifiedAdPayPerLeadEnabled")
	@Order(value=35)
	public Boolean classifiedAdPayPerLeadEnabled;	
	
	@Element(name = "ItemSpecificsEnabled")
	@Order(value=36)
	public ItemSpecificsEnabledCodeType itemSpecificsEnabled;	
	
	@Element(name = "PaisaPayFullEscrowEnabled")
	@Order(value=37)
	public Boolean paisaPayFullEscrowEnabled;	
	
	@Element(name = "UPCIdentifierEnabled")
	@Order(value=38)
	public Boolean upcIdentifierEnabled;	
	
	@Element(name = "EANIdentifierEnabled")
	@Order(value=39)
	public Boolean eanIdentifierEnabled;	
	
	@Element(name = "ISBNIdentifierEnabled")
	@Order(value=40)
	public Boolean isbnIdentifierEnabled;	
	
	@Element(name = "BrandMPNIdentifierEnabled")
	@Order(value=41)
	public Boolean brandMPNIdentifierEnabled;	
	
	@Element(name = "ClassifiedAdAutoAcceptEnabled")
	@Order(value=42)
	public Boolean classifiedAdAutoAcceptEnabled;	
	
	@Element(name = "BestOfferAutoAcceptEnabled")
	@Order(value=43)
	public Boolean bestOfferAutoAcceptEnabled;	
	
	@Element(name = "CrossBorderTradeNorthAmericaEnabled")
	@Order(value=44)
	public Boolean crossBorderTradeNorthAmericaEnabled;	
	
	@Element(name = "CrossBorderTradeGBEnabled")
	@Order(value=45)
	public Boolean crossBorderTradeGBEnabled;	
	
	@Element(name = "CrossBorderTradeAustraliaEnabled")
	@Order(value=46)
	public Boolean crossBorderTradeAustraliaEnabled;	
	
	@Element(name = "PayPalBuyerProtectionEnabled")
	@Order(value=47)
	public Boolean payPalBuyerProtectionEnabled;	
	
	@Element(name = "BuyerGuaranteeEnabled")
	@Order(value=48)
	public Boolean buyerGuaranteeEnabled;	
	
	@Element(name = "CombinedFixedPriceTreatmentEnabled")
	@Order(value=49)
	public Boolean combinedFixedPriceTreatmentEnabled;	
	
	@Element(name = "GalleryFeaturedDurations")
	@Order(value=50)
	public ListingEnhancementDurationReferenceType galleryFeaturedDurations;	
	
	@Element(name = "PayPalRequired")
	@Order(value=51)
	public Boolean payPalRequired;	
	
	@Element
	@Order(value=52)
	public AdFormatEnabledCodeType eBayMotorsProAdFormatEnabled;	
	
	@Element
	@Order(value=53)
	public Boolean eBayMotorsProContactByPhoneEnabled;	
	
	@Element
	@Order(value=54)
	public Integer eBayMotorsProPhoneCount;	
	
	@Element
	@Order(value=55)
	public Boolean eBayMotorsProContactByAddressEnabled;	
	
	@Element
	@Order(value=56)
	public Integer eBayMotorsProStreetCount;	
	
	@Element
	@Order(value=57)
	public Boolean eBayMotorsProCompanyNameEnabled;	
	
	@Element
	@Order(value=58)
	public Boolean eBayMotorsProContactByEmailEnabled;	
	
	@Element
	@Order(value=59)
	public ClassifiedAdBestOfferEnabledCodeType eBayMotorsProBestOfferEnabled;	
	
	@Element
	@Order(value=60)
	public Boolean eBayMotorsProAutoAcceptEnabled;	
	
	@Element
	@Order(value=61)
	public Boolean eBayMotorsProAutoDeclineEnabled;	
	
	@Element
	@Order(value=62)
	public ClassifiedAdPaymentMethodEnabledCodeType eBayMotorsProPaymentMethodCheckOutEnabled;	
	
	@Element
	@Order(value=63)
	public Boolean eBayMotorsProShippingMethodEnabled;	
	
	@Element
	@Order(value=64)
	public Boolean eBayMotorsProCounterOfferEnabled;	
	
	@Element
	@Order(value=65)
	public Boolean eBayMotorsProSellerContactDetailsEnabled;	
	
	@Element(name = "LocalMarketAdFormatEnabled")
	@Order(value=66)
	public AdFormatEnabledCodeType localMarketAdFormatEnabled;	
	
	@Element(name = "LocalMarketContactByPhoneEnabled")
	@Order(value=67)
	public Boolean localMarketContactByPhoneEnabled;	
	
	@Element(name = "LocalMarketPhoneCount")
	@Order(value=68)
	public Integer localMarketPhoneCount;	
	
	@Element(name = "LocalMarketContactByAddressEnabled")
	@Order(value=69)
	public Boolean localMarketContactByAddressEnabled;	
	
	@Element(name = "LocalMarketStreetCount")
	@Order(value=70)
	public Integer localMarketStreetCount;	
	
	@Element(name = "LocalMarketCompanyNameEnabled")
	@Order(value=71)
	public Boolean localMarketCompanyNameEnabled;	
	
	@Element(name = "LocalMarketContactByEmailEnabled")
	@Order(value=72)
	public Boolean localMarketContactByEmailEnabled;	
	
	@Element(name = "LocalMarketBestOfferEnabled")
	@Order(value=73)
	public ClassifiedAdBestOfferEnabledCodeType localMarketBestOfferEnabled;	
	
	@Element(name = "LocalMarketAutoAcceptEnabled")
	@Order(value=74)
	public Boolean localMarketAutoAcceptEnabled;	
	
	@Element(name = "LocalMarketAutoDeclineEnabled")
	@Order(value=75)
	public Boolean localMarketAutoDeclineEnabled;	
	
	@Element(name = "LocalMarketPaymentMethodCheckOutEnabled")
	@Order(value=76)
	public ClassifiedAdPaymentMethodEnabledCodeType localMarketPaymentMethodCheckOutEnabled;	
	
	@Element(name = "LocalMarketShippingMethodEnabled")
	@Order(value=77)
	public Boolean localMarketShippingMethodEnabled;	
	
	@Element(name = "LocalMarketCounterOfferEnabled")
	@Order(value=78)
	public Boolean localMarketCounterOfferEnabled;	
	
	@Element(name = "LocalMarketSellerContactDetailsEnabled")
	@Order(value=79)
	public Boolean localMarketSellerContactDetailsEnabled;	
	
	@Element(name = "ClassifiedAdPhoneCount")
	@Order(value=80)
	public Integer classifiedAdPhoneCount;	
	
	@Element(name = "ClassifiedAdContactByAddressEnabled")
	@Order(value=81)
	public Boolean classifiedAdContactByAddressEnabled;	
	
	@Element(name = "ClassifiedAdStreetCount")
	@Order(value=82)
	public Integer classifiedAdStreetCount;	
	
	@Element(name = "ClassifiedAdCompanyNameEnabled")
	@Order(value=83)
	public Boolean classifiedAdCompanyNameEnabled;	
	
	@Element(name = "SpecialitySubscription")
	@Order(value=84)
	public GeographicExposureCodeType specialitySubscription;	
	
	@Element(name = "RegularSubscription")
	@Order(value=85)
	public GeographicExposureCodeType regularSubscription;	
	
	@Element(name = "PremiumSubscription")
	@Order(value=86)
	public GeographicExposureCodeType premiumSubscription;	
	
	@Element(name = "NonSubscription")
	@Order(value=87)
	public GeographicExposureCodeType nonSubscription;	
	
	@Element(name = "INEscrowWorkflowTimeline")
	@Order(value=88)
	public INEscrowWorkflowTimelineCodeType inEscrowWorkflowTimeline;	
	
	@Element(name = "PayPalRequiredForStoreOwner")
	@Order(value=89)
	public Boolean payPalRequiredForStoreOwner;	
	
	@Element(name = "ReviseQuantityAllowed")
	@Order(value=90)
	public Boolean reviseQuantityAllowed;	
	
	@Element(name = "RevisePriceAllowed")
	@Order(value=91)
	public Boolean revisePriceAllowed;	
	
	@Element(name = "StoreOwnerExtendedListingDurationsEnabled")
	@Order(value=92)
	public Boolean storeOwnerExtendedListingDurationsEnabled;	
	
	@Element(name = "StoreOwnerExtendedListingDurations")
	@Order(value=93)
	public StoreOwnerExtendedListingDurationsType storeOwnerExtendedListingDurations;	
	
	@Element(name = "ReturnPolicyEnabled")
	@Order(value=94)
	public Boolean returnPolicyEnabled;	
	
	@Element(name = "HandlingTimeEnabled")
	@Order(value=95)
	public Boolean handlingTimeEnabled;	
	
	@Element(name = "MaxFlatShippingCost")
	@Order(value=96)
	public AmountType maxFlatShippingCost;	
	
	@Element(name = "Group1MaxFlatShippingCost")
	@Order(value=97)
	public AmountType group1MaxFlatShippingCost;	
	
	@Element(name = "Group2MaxFlatShippingCost")
	@Order(value=98)
	public AmountType group2MaxFlatShippingCost;	
	
	@Element(name = "Group3MaxFlatShippingCost")
	@Order(value=99)
	public AmountType group3MaxFlatShippingCost;	
	
	@Element(name = "PaymentMethod")
	@Order(value=100)
	public List<BuyerPaymentMethodCodeType> paymentMethod;	
	
	@Element(name = "VariationsEnabled")
	@Order(value=101)
	public Boolean variationsEnabled;	
	
	@Element(name = "AttributeConversionEnabled")
	@Order(value=102)
	public AttributeConversionEnabledCodeType attributeConversionEnabled;	
	
	@Element(name = "FreeGalleryPlusEnabled")
	@Order(value=103)
	public Boolean freeGalleryPlusEnabled;	
	
	@Element(name = "FreePicturePackEnabled")
	@Order(value=104)
	public Boolean freePicturePackEnabled;	
	
	@Element(name = "ItemCompatibilityEnabled")
	@Order(value=105)
	public ItemCompatibilityEnabledCodeType itemCompatibilityEnabled;	
	
	@Element(name = "MinItemCompatibility")
	@Order(value=106)
	public Integer minItemCompatibility;	
	
	@Element(name = "MaxItemCompatibility")
	@Order(value=107)
	public Integer maxItemCompatibility;	
	
	@Element(name = "ConditionEnabled")
	@Order(value=108)
	public ConditionEnabledCodeType conditionEnabled;	
	
	@Element(name = "ConditionValues")
	@Order(value=109)
	public ConditionValuesType conditionValues;	
	
	@Element(name = "ValueCategory")
	@Order(value=110)
	public Boolean valueCategory;	
	
	@Element(name = "ProductCreationEnabled")
	@Order(value=111)
	public ProductCreationEnabledCodeType productCreationEnabled;	
	
	@Element(name = "MaxGranularFitmentCount")
	@Order(value=112)
	public Integer maxGranularFitmentCount;	
	
	@Element(name = "CompatibleVehicleType")
	@Order(value=113)
	public String compatibleVehicleType;	
	
	@Element(name = "PaymentOptionsGroup")
	@Order(value=114)
	public PaymentOptionsGroupEnabledCodeType paymentOptionsGroup;	
	
	@Element(name = "ShippingProfileCategoryGroup")
	@Order(value=115)
	public ProfileCategoryGroupCodeType shippingProfileCategoryGroup;	
	
	@Element(name = "PaymentProfileCategoryGroup")
	@Order(value=116)
	public ProfileCategoryGroupCodeType paymentProfileCategoryGroup;	
	
	@Element(name = "ReturnPolicyProfileCategoryGroup")
	@Order(value=117)
	public ProfileCategoryGroupCodeType returnPolicyProfileCategoryGroup;	
	
	@Element(name = "VINSupported")
	@Order(value=118)
	public Boolean vinSupported;	
	
	@Element(name = "VRMSupported")
	@Order(value=119)
	public Boolean vrmSupported;	
	
	@Element(name = "SellerProvidedTitleSupported")
	@Order(value=120)
	public Boolean sellerProvidedTitleSupported;	
	
	@Element(name = "DepositSupported")
	@Order(value=121)
	public Boolean depositSupported;	
	
	@Element(name = "GlobalShippingEnabled")
	@Order(value=122)
	public Boolean globalShippingEnabled;	
	
	@AnyElement
	@Order(value=123)
	public List<Object> any;	
	
    
}