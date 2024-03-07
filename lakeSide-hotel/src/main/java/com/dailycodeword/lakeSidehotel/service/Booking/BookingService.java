package com.dailycodeword.lakeSidehotel.service.Booking;

import com.dailycodeword.lakeSidehotel.model.BookedRoom;

import java.util.List;

public interface BookingService {

    List<BookedRoom> getAllBookings();

    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    List<BookedRoom> getBookingsByUserEmail(String email);
}
