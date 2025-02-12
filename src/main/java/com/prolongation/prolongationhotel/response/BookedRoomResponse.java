package com.prolongation.prolongationhotel.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookedRoomResponse {

    private Long id;
     private LocalDate checkInDate;
     private LocalDate checkOutDate;
     private String guestName;
     private String email;
     private int numOfAdult;
     private int  numOfChildreen;
     private int totalNumOfGuest;
     private String bookingConfirmationCode;
     private RoomResponse room;

    public BookedRoomResponse(Long id, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmationCode) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
