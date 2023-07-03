package ch20_컬렉션;

public class CustomArrayList {

    private String[] array;

    public CustomArrayList() {
        array = new String[0];
    }

    public void add(String str) {
        String[] newArray = new String[array.length + 1]; //기존 배열보다 하나 큰 공간
        for(int i = 0; i <array.length; i++) {
            newArray[i] = array[i]; // 기존 배열의 값을 옮기기
        }
        newArray[array.length] = str; // main메소드에서 입력된 값을 newArray 마지막에 넣는다
        array = newArray; //

    }

    public void add(int index, String str) {
        String[] newArray = new String[array.length + 1]; //기존 배열보다 하나 큰 공간

        for(int i = 0; i <index; i++) {
            newArray[i] = array[i]; // index 전까지 기존 배열의 값을 옮기기
        }

        newArray[index] = str; //index에 매개변수 값 옮기기

        for(int i = index; i< array.length; i ++) {
            newArray[i+1] = array[i];
        }
        /*
        for(int i = 0; i< array.length - index; i ++) {
            newArray[index + i + 1] = array[i + index];
        } */
        array = newArray;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(String str : array ) {
            builder.append(str + ",");
        /* 위의 for-each 문은 아래와 같다. (처음부터 끝까지 순회하며)
        for(int i = 0; i <array.length; i++) {
            builder.append(array[i] + ",");
         */
        }
        builder.delete(builder.lastIndexOf(","), builder.length());
        builder.append("]");

        return builder.toString();
    }

}
