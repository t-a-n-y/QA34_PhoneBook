package models;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString


public class Contact {
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String description;
}
