import java.util.Arrays;

public class CustomList {
    private int size;
    private static final int INIT_CAPACITY = 2;
    int[] elementData;

    public CustomList() {
        elementData = new int[INIT_CAPACITY];
    }
    
    public void add(int el) {
        if(size == elementData.length) {
            increaseCapacity();
        }
        increaseElements(el);
        elementData[size++] = el;
    }

    public int getByInd(int el) {
        if (el >= size || el < 0) {
            throw new IndexOutOfBoundsException("Index: " + el + ", Size " + el);
        }
        return elementData[el];
    }

    public boolean getByValue(int el) {
        for (int element: elementData) {
            if (element == el) return true;
        }
        return false;
    }

    public Double avg() {
        Double sum = 0.0;
        for (int element :
                elementData) {
            sum += element;
        }
        return sum/size();
    }

    public void remove(int idx) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException("Index not found");
        }
        int el = elementData[idx];
        int numEl = elementData.length - (idx +1);
        System.arraycopy(elementData, idx + 1, elementData, idx, numEl);
        size--;
        decreaseElements(el);
    }

    private void decreaseElements(int el) {
        if(size != 0) {
            int[] newCustList = new int[size()];
            for (int i = 0; i < size(); i++) {
                newCustList[i] = elementData[i] - el;
            }
            System.arraycopy(newCustList, 0, elementData, 0, size);
        }
    }

    private void increaseElements(int el) {
        if(size != 0) {
            int[] newCustList = new int[size()];
            for (int i = 0; i < size(); i++) {
                newCustList[i] = elementData[i] + el;
            }
            System.arraycopy(newCustList, 0, elementData, 0, size);
        }
    }

    private void increaseCapacity() {
        int newSize = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newSize);
    }

    public int size() {
        return this.size;
    }

    public int max() {
        if (size() == 0) {
            throw new IndexOutOfBoundsException("collection is empty");
        }
        int max = elementData[0];
        for (int i = 1; i < size; i++) {
            if (max < elementData[i]) {
                max = elementData[i];
            }
        }
        return max;
    }

    public int min() {
        if (size() == 0) {
            throw new IndexOutOfBoundsException("collection is empty");
        }
        int min = elementData[0];
        for (int i = 1; i < size; i++) {
            if (min > elementData[i]) {
                min = elementData[i];
            }
        }
        return min;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < size ;i++) {
            sb.append(elementData[i]);
            if(i<size-1){
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
