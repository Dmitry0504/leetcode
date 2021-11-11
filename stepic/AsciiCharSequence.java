package stepic;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int i) {
        return (char) array[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        byte[] newArr = new byte[i1 - i];
        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = array[i++];
        }
        return new AsciiCharSequence(newArr);
    }

    @Override
    public String toString() {
        return new String(array);
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }
}
