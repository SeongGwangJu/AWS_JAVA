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

    //오버로딩 -> index 위치에 str을 넣고 뒤로 민다.
    public void add(int index, String str) {
        String[] newArray = new String[array.length + 1]; //기존 배열보다 하나 큰 공간

        for(int i = 0; i <index; i++) {
            newArray[i] = array[i]; // index 전까지 기존 배열의 값을 옮기기
        }
        newArray[index] = str; //index에 매개변수 값 옮기기

        for(int i = index; i< array.length; i ++) {
            newArray[i+1] = array[i];
        }

        array = newArray;
    }
    //배열 맨 끝의 값을 지우는 메서드. 지운값은 리턴한다.
    public String remove() {
        String[] newArray = new String[array.length -1];
        String value = array[(array.length-1)];

        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        return value;

    }

    //해당 인덱스의 값을 지우고 뒤의 값들은 앞으로 당기는 메서드 지운값은 리턴한다.
    public  String remove (int index) {
        String[] newArray = new String[array.length - 1];
        String value = array[index];

        //반복을 2번 해도 되고, 반복 한번에 index를 기점으로 조건을 만들어줘도 된다.
        for(int i=0; i < index; i++) {
            newArray[i] = array[i];
        }
        for(int i = index; i < newArray.length; i++) {
            newArray[i] = array[i+1];
        }
        /* 이거보단 위에거가 나음.
        for(int i = 0; i<array.length; i++) {
            int tempIndex = i-1;
            if(i == index) {
                countinue;
            }
            if(i < index) {
                tempIndex = i;
            }
            newArray[tempINdex] = array[i];
         */
        array = newArray;
        return value;

    }

    public void set(int index, String str) {
        array[index] = str;
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
