package uz.pdp.flyway;

import lombok.*;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Task {
    private Integer id;
    private String title;
    private String description;
    private String label;
    private LocalDateTime createdAt;
}
