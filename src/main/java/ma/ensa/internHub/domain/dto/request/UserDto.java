package ma.ensa.internHub.domain.dto.request;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private UUID id;
    private String email;
    private String role;
    private String phone;
    private String address;
    private String profileImage;
    private String infos;
}
