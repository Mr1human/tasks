package task1;

import java.util.Arrays;

public class MyArrayList<T extends Comparable<? super T>> {
    private int count = 0;
    private Object array[] = new Object[2];

    public MyArrayList() {}
    public MyArrayList(MyArrayList<? extends T> massiv){
        this.addAll(0, (MyArrayList<T>) massiv);
    }

    public int length() {
        return count;
    }

    public void add(T x) {
        if (count < array.length) {
            array[count++] = x;
        } else {
            Object[] tmp = new Object[count * 2];
            System.arraycopy(array, 0, tmp, 0, count);
            tmp[count++] = x;
            array = tmp;
        }
    }

    public void addAll(int index, MyArrayList<? extends T> massiv) {
        Object[] tmp = new Object[this.length() + massiv.length()];
        System.arraycopy(array, 0, tmp, 0, index);
        for (int i = 0; i < massiv.length(); i++) {
            tmp[index + i] = massiv.get(i);
        }
        System.arraycopy(array, index, tmp, index + massiv.length(), this.length() - index);
        array = tmp;
        count += massiv.length();
    }

    public void remove(int index) {
        if (get(index)!=null){
            Object[] tmp = new Object[this.length() - 1];
            System.arraycopy(array, 0, tmp, 0, index);
            System.arraycopy(array, index + 1, tmp, index, this.length() - 1 - index);
            array = tmp;
            count--;
        }else{
            System.out.println("index was not found");
        }
    }

    public static <T extends Comparable<? super T>> void sortBubble(MyArrayList<T> massiv){
        boolean swap = false;

        for (int i = 0; i < massiv.length() - 1; i++) {
            for (int j = 0; j < massiv.length() - 1; j++)
                if (massiv.get(j).compareTo(massiv.get(j + 1)) > 0) {
                    T tmp = (T) massiv.get(j);
                    massiv.array[j] = massiv.array[j+1];
                    massiv.array[j+1] = tmp;
                    swap = true;
                }
            if (!swap) {
                System.out.println("sorting is done");
                break;
            }
        }
    }

    public void sortBubble() {
        boolean swap = false;

        for (int i = 0; i < this.length() - 1; i++) {
            for (int j = 0; j < this.length() - 1; j++)
                if (this.get(j).compareTo(this.get(j + 1)) > 0) {
                    T tmp = (T) array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swap = true;
                }
            if (!swap) {
                System.out.println("sorting is done");
                break;
            }
        }
    }
    public T get(int index) {
        if (index < count && index >=0){
            T tmp = (T) array[index];
            return tmp;
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
