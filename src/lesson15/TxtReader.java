package lesson15;

import java.io.*;
import java.util.*;

public class TxtReader {
    private File file;
    private RandomAccessFile fileRandom;
    class TxtExpetion extends Exception {
        TxtExpetion(String message) {
            super (message);
        }
    }

    public TxtReader(File file) {
        if(file.getAbsolutePath ().contains (".txt") == true){
        this.file = file;
    }else{
            try {
                throw new TxtExpetion ("Неверное разрешение файла");
            } catch (TxtExpetion txtExpetion) {
                txtExpetion.printStackTrace ();
            }
        }
    }

    public int countCopyByte(){
        byte[] bytes = new byte[(int)file.length ()];
        try{
            RandomAccessFile fileR = new RandomAccessFile (file, "r");
            fileR.seek (0);
            fileR.read(bytes);
            fileR.close();
        }catch (IOException e){
            e.printStackTrace ();
        }
        return bytes.length;
    }

    public void breakApart(int from, int to, File writeInFile, File allRestFile){
        try(RandomAccessFile fileR = new RandomAccessFile (file, "rw");
            RandomAccessFile fileR1 = new RandomAccessFile (writeInFile, "rw");
            RandomAccessFile fileR2 = new RandomAccessFile (allRestFile, "rw");){
            fileR.seek (from);
            byte[] bytes = new byte[(int)file.length ()];
            fileR.read(bytes);
            fileR1.write (bytes,from,to);
            fileR2.write (bytes,to,(int)(file.length ()-to));
        }catch (IOException e){
            e.printStackTrace ();
        }
    }

    public void glueTwoFiles(File firstFile, File secondFile){
        try(RandomAccessFile fileR = new RandomAccessFile (file, "rw");
            RandomAccessFile fileR1 = new RandomAccessFile (firstFile, "rw");
            RandomAccessFile fileR2 = new RandomAccessFile (secondFile, "rw");){
            fileR1.seek (0);
            byte[] bytes = new byte[(int)firstFile.length ()+(int)secondFile.length ()];
            fileR1.read(bytes);
            fileR2.seek (0);
            fileR2.read(bytes,(int)firstFile.length (),(int)secondFile.length ());
            fileR.write (bytes);
        }catch (IOException e){
            e.printStackTrace ();
        }
    }

     public static void enDeCrypt(File file, String key, File anotherFile) {
         try (InputStream inputStream = new FileInputStream (file);
              ByteArrayOutputStream byteAOStream = new ByteArrayOutputStream ();
              OutputStream outputStream = new FileOutputStream (anotherFile);) {
             byte[] bytes = new byte[1024];
             int len;
             while((len = inputStream.read (bytes)) > 0){
                 byteAOStream.write (bytes,0, len);
             }
             byte[] bKey = key.getBytes ();
             for (int i = 0; i < bytes.length; i++) {
                 bytes[i] = (byte) (bytes[i] ^ bKey[i % bKey.length]);
             }
             outputStream.write (bytes, 0, bytes.length);

         } catch (Exception e) {
             e.printStackTrace ();
         }
     }
    public static void enDeCryptFile(File file, File fileKey, File anotherFile) {
        try (InputStream inputStream = new FileInputStream (file);
             ByteArrayOutputStream byteAOStream = new ByteArrayOutputStream ();
             InputStream inputStream1 = new FileInputStream (fileKey);
             ByteArrayOutputStream byteAOStream1 = new ByteArrayOutputStream ();
             OutputStream outputStream = new FileOutputStream (anotherFile);) {
            byte[] bytes = new byte[1024];
            int len;
            while((len = inputStream.read (bytes)) > 0){
                byteAOStream.write (bytes,0, len);
            }
            byte[] bKey = new byte[1024];
            int count;
            while((count = inputStream1.read (bKey)) > 0){
                byteAOStream1.write (bKey,0, count);
            }
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ bKey[i]);
            }
            outputStream.write (bytes, 0, bytes.length);

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
    public Set sortedByteSet(){
        Set<Byte> treeSet = new TreeSet<> ();
        try(InputStream inputStream = new FileInputStream(file)){
            while(inputStream.available () > 0){
                treeSet.add ((byte)inputStream.read ());
            }
        }catch (IOException e){
            e.printStackTrace ();
        }
        return treeSet;
    }
}


