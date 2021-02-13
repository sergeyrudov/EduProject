package FileReaderExamples;

import java.io.*;

public class DataInputAndOutputStream {
    public static void main(String[] args) {
        try(DataOutputStream dataOutputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));

            DataInputStream dataInputStream = new DataInputStream(
                    new FileInputStream("my_test.bin"));
        )

        {
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeShort(120);
            dataOutputStream.writeInt(500);
            dataOutputStream.writeFloat(3.14F);
            dataOutputStream.writeDouble(123.345);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readDouble());

            System.out.println("DONE!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
