package ch16_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

//@EqualsAndHashCode
//@ToString
//@Getter
//@Setter
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Slave {

    private final String name; //final은 RequiredArg~때문에. 달면 무조건 name포함된 생성자
    private int age;


}
