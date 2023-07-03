package ch19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Response<T> { // '< >' : 제네릭  //응답
    private int statusCode;
    //제네릭 타입 매개변수를 변수, 메서드 매개변수, 반환 타입 등으로 사용
    private T data;

    /*
    클래스 내부에 정의된 메서드에서도 제네릭 타입을 사용할 수 있다.
    메서드 이름 앞에 <T>와 같은 형식으로 제네릭 타입 매개변수를 선언.
     */



}
