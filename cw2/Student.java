package seminar3.cw2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Integer group;
    private Integer money;
    List<Integer> count;
}
