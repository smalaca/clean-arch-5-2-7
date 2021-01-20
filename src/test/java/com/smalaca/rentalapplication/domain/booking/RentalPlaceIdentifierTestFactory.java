package com.smalaca.rentalapplication.domain.booking;

import static com.smalaca.rentalapplication.domain.booking.RentalType.APARTMENT;
import static com.smalaca.rentalapplication.domain.booking.RentalType.HOTEL_ROOM;

public class RentalPlaceIdentifierTestFactory {

    public static RentalPlaceIdentifier hotelRoom(String rentalPlaceId) {
        return new RentalPlaceIdentifier(HOTEL_ROOM, rentalPlaceId);
    }

    public static RentalPlaceIdentifier apartment(String apartmentId) {
        return new RentalPlaceIdentifier(APARTMENT, apartmentId);
    }
}