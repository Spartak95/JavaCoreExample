package reentrantreadwritelock.example;

public class ReadWriteLockTest {
    static final int READER_SIZE = 10;
    static final int WRITER_SIZE = 2;

    public static void main(String[] args) {
        Integer[] initialElements = {20, 30, 40, 50};

        ReadWriteList<Integer> sharedList = new ReadWriteList<>(initialElements);

        for (int i = 0; i < READER_SIZE; i++) {
            Reader reader = new Reader(sharedList);
            reader.start();
            try {
                reader.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < WRITER_SIZE; i++) {
            Writer writer = new Writer(sharedList);
            writer.start();
            try {
                writer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
