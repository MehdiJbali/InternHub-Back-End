package ma.ensa.internHub.domain.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ma.ensa.internHub.validation.ValidImageUrl;
import ma.ensa.internHub.validation.ValidName;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("STUDENT")
public class Student extends User {
    @NotBlank(message = "First name is required")
    @ValidName
    private String firstName;

    @NotBlank(message = "Last name is required")
    @ValidName
    private String lastName;

    @ValidImageUrl
    private String profileImage;
  
    private String school;
    private String title;
    // private StudentSocialLinks links;
    // private Experience[] experiences;
    // private Formation[] formations;
    // private Project[] projects;
    // private Certificat[] certificats;

}

