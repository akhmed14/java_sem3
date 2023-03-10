package seminar3.hw2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tovar {
    private String name;
    private String countryName;
    private Integer price;
    private Integer weight;
    private Integer variety;
}
