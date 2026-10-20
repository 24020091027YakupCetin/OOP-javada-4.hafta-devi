public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    // Varsayılan kapasiteli yapıcı metot
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    // Belirtilen kapasiteli yapıcı metot
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    // Yığına yeni eleman ekler
    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    // En üstteki elemanı çıkarır ve döndürür
    public int pop() {
        return elements[--size];
    }

    // En üstteki elemanı çıkarmadan döndürür
    public int peek() {
        return elements[size - 1];
    }

    // Yığın boş mu kontrol eder
    public boolean empty() {
        return size == 0;
    }

    // Yığındaki eleman sayısını döndürür
    public int getSize() {
        return size;
    }
}