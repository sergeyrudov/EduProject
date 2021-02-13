package FileReaderExamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


// read from file to buffer via channel for 25 symbols
public class ChannelBufferExample1 {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel())
        {

            ByteBuffer byteBuffer = ByteBuffer.allocate(25);
            StringBuilder stringBuilder = new StringBuilder();

            int byteRead = channel.read(byteBuffer);
            while (byteRead > 0) {
                System.out.println("Read: " + byteRead);

                byteBuffer.flip();

                while (byteBuffer.hasRemaining()) {
                    stringBuilder.append((char)byteBuffer.get());
                }
                byteBuffer.clear();
                byteRead = channel.read(byteBuffer);
            }
            System.out.println(stringBuilder);

            // write text from string to file via buffer
            String text = "\nHello world, this is test message";
            /*ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
            buffer2.put(text.getBytes());
            buffer2.flip();
            channel.write(buffer2);*/

            // second variant to write text
            ByteBuffer buffer3 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer3);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
