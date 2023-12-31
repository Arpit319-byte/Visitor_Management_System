package io.bootify.visitor_management_system.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VisitDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String status;

    @NotNull
    private LocalDateTime inTime;

    @NotNull
    private LocalDateTime outTime;

    @NotNull
    @Size(max = 255)
    private String purpose;

    @NotNull
    @Size(max = 255)
    private String imageUrl;

    @NotNull
    private Integer noOfPeople;

    @NotNull
    private Long visitor;

    @NotNull
    private Long flat;

}
