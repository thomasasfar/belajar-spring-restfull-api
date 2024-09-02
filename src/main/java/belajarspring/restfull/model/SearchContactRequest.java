package belajarspring.restfull.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SearchContactRequest {

    private String name;

    private String phone;

    private String email;

    @NotNull
    private Integer page;

    @NotNull
    private Integer size;
}
