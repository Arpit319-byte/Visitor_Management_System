package io.bootify.visitor_management_system.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AddressDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String line1;

    @NotNull
    @Size(max = 255)
    private String line2;

    @NotNull
    @Size(max = 255)
    private String city;

    @NotNull
    @Size(max = 255)
    private String pincode;

    @NotNull
    @Size(max = 255)
    private String state;

}
