package ma.ensa.internHub.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.internHub.domain.entities.SalaryType;
import ma.ensa.internHub.domain.entities.WorkMode;
import ma.ensa.internHub.domain.entities.InternshipType;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InternshipDto {
    @NotBlank(message = "Created by is required")
    private String createdBy;

    @NotBlank(message = "Company is required")
    private String company;

    @NotBlank(message = "Description is required")
    @Size(min = 10, max = 500, message = "Description must be between 10 and 500 characters")
    private String description;

    private int duration;
    private double salary;
    private SalaryType salaryType;

    @NotBlank(message = "Domain is required")
    private String domain;

    @NotBlank(message = "Location is required")
    private String location;

    @NotBlank(message = "Title is required")
    private String title;

    private WorkMode workMode;
    private List<InternshipType> tags;
    private List<String> skills;
    private boolean negotiable;
    private boolean remunerated;
}