package org.rms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
        private long RentId;
        private String RentalDate;
        private String ReturnDate;
        private String DueDate;
        private String TotalCost;

    }

