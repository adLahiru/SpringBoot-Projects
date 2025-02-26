package lk.ijse.cmjd.LibMgmt2025.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StaffDTO {
    private  String staffId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String joinDate;
    private  String phone;
    private  Role role;

}
