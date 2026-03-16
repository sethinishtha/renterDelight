package com.renterDelight.dao;

public class RenterDelightEnums {

    public enum USER_ROLE {
        RENTER,
        LANDLORD
    }
    public enum LISTING_STATUS {
        AVAILABLE,
        RENTED,
        PENDING
    }
    public enum VERIFICATION_STATUS {
        PENDING,
        VERIFIED,
        REJECTED
    }
    public enum PAYMENT_STATUS {
        PENDING,
        COMPLETED,
        FAILED
    }
    public enum MAINTENANCE_STATUS {
        OPEN,
        IN_PROGRESS,
        CLOSED
    }


}
