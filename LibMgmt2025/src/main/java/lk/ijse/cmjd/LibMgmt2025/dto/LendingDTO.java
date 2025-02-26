package lk.ijse.cmjd.LibMgmt2025.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LendingDTO implements Serializable {
    private String lendingId;
    private String book;
    private String member;
    private String LendingDate;
    private String returnDate;
    private Boolean isActiveLending;
    private Long overdueDays;
    private String fineAmount;
}
