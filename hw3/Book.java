package seminar3.hw3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private Integer price;
    private Integer year;
    private Integer countPg;
}
