package com.equinix.ecp.config.crossConnect;

interface CrossConnectCommon {

    int QUANTITY_REQUESTED = 1;

    boolean CUSTOMER_FOLLOW_UP_REQUIRED = false;

    String CUSTOMER_REFERENCE_NUMBER = "<<refNo>>";

    String NUMBER = "<<number>>";

    String PURCHASE_ORDER_TYPE = "<<purchaseordertype>>";

    // *************************************************************************

    String ORDERING_USERNAME = "<<username>>";

    String ORDERING_NAME = "<<firstName_lastName>>";

    String ORDERING_EMAIL = "<<email_address>>";

    String ORDERING_WORK_PHONE = "<<workphone_number>>";

    String ORDERING_WORK_PHONE_COUNTRY_CODE = "<<workphone_country_code>>";

    String ORDERING_MOBILE_PHONE = "<<mobile_number>>";

    String ORDERING_MOBILE_PHONE_COUNTRY_CODE = "<<mobilephone_country_code>>";

    // *************************************************************************

    String TECHNICAL_USERNAME = "<<username>>";

    String TECHNICAL_NAME = "<<firstName_lastName>>";

    String TECHNICAL_EMAIL = "<<email_address>>";

    String TECHNICAL_WORK_PHONE = "<<workphone_number>>";

    String TECHNICAL_WORK_PHONE_COUNTRY_CODE = "<<workphone_country_code>>";

    String TECHNICAL_WORK_PHONE_PREF_TO_CALL = "<<work_pref_to_call>>";

    String TECHNICAL_MOBILE_PHONE_COUNTRY_CODE = "<<mobile_phone_country_code>>";

    String TECHNICAL_MOBILE_PHONE = "<<mobile_number>>";

    String TECHNICAL_MOBILE_PHONE_PREF_TO_CALL = "<<work_pref_to_call>>";

    // **************************************************************************

    String NOTIFICATION_USERNAME = "<<username>>";

    String NOTIFICATION_NAME = "<<firstName_lastName>>";

    String NOTIFICATION_EMAIL = "<<email_address>>";

    // *************************************************************************

    String IBX_TIMEZONE = "<<ibxtimezone>>";

    String SCHEDULE_TYPE = "<<scheduletype>>";

    String REQUESTED_START_DATE = "<<requestedStartDate>>";

    String REQUESTED_COMPLETION_DATE = "<<requestedCompletionDate>>";

    // *************************************************************************

    String ASIDE_IBX = "<<aside_ibx>>";

    String ASIDE_CAGE = "<<aside_cage>>";

    String ASIDE_ACCOUNTNUMBER = "<<aside_accountnumber>>";

    String ASIDE_CABINETS = "<<aside_cabinets>>";

    String ASIDE_CONNECTIONSERVICE = "<<aside_connectionservice>>";

    String ASIDE_MEDIATYPE = "<<aside_mediatype>>";

    boolean ASIDE_PROCEEDIFMEDIACOVERTERISREQUIRED = false;

    String ASIDE_PROTOCOLTYPE = "<<aside_protocoltype>>";

    String ASIDE_CONNECTORTYPE = "<<aside_connectortype>>";

    String ASIDE_PATCHPANEL_NAME = "<<aside_patchpanel_name>>";

    String ASIDE_PORTA = "<<aside_porta>>";

    String ASIDE_PORTB = "<<aside_portb>>";

    String ZSIDE_CUSTOMER = "<<zside_customer>>";

    String ZSIDE_CUSTOMERACCOUNT = "<<zside_customeraccount>>";

    String ZSIDE_IBX = "<<zside_ibx>>";

    String ZSIDE_CAGE = "<<zside_cage>>";

    String ZSIDE_CABINET = "<<zside_cabinet>>";

    String ZSIDE_ACCOUNT_NUMBER = "<<zside_account_number>>";

    String ZSIDE_CONNECTIONSERVICE = "<<zside_connectionservice>>";

    String ZSIDE_CONNECTORTYPE = "<<zside_connectortype>>";

    String ZSIDE_PATCHPANEL_NAME = "<<zside_patchpanel_name>>";

    String ZSIDE_PORTA = "<<zside_porta>>";

    String ZSIDE_PORTB = "<<zside_portb>>";

    String ZSIDE_CIRCUITID = "<<zside_circuitid>>";

    String ZSIDE_CONTACT_EMAIL = null;

    boolean PATCH_EQUIPMENT = false;

    String CABINET = "<<cabinet>>";

    String CONNECTOR_TYPE = "<<connectortype>>";

    String DETAILS = "<<details>>";

    String PORT = "<<port>>";

    Boolean LIGHT_LINK_VERIFICATION_REQUIRED=false;

    Boolean NOTIFY_Z_SIDE_UPON_COMPLETION=false;

}

