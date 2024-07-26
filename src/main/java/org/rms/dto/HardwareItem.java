package org.rms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HardwareItem {
    private long itemId;
    private String Availability;
    private String FinePerDay;
    private String RentalPerDay;
    private String Name;


}



