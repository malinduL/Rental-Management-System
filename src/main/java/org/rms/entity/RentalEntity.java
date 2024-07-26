package org.rms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentalEntity {
        private long id;
        private String RentalDate;
        private Void ReturnDate;
        private Void DueDate;
        private String TotalCost;

    }

