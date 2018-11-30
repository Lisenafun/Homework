package lesson15;

import java.io.File;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println ("Введите путь к файлу:");
        File file1 = new File (in.nextLine ());//C:/Users/Андрей/Desktop/file1.txt
//        System.out.println ("Введите путь к файлу:");
//        File file2 = new File (in.nextLine ());
//        System.out.println ("Введите путь к файлу:");
//        File file3 = new File (in.nextLine ());
//        System.out.println ("Введите путь к файлу:");
//        File file4 = new File (in.nextLine ());
//        System.out.println ("Введите путь к файлу:");
//        File file5 = new File (in.nextLine ());
        TxtReader txtReader = new TxtReader (file1);
//        System.out.println (txtReader.countCopyByte ());//задача1
//        txtReader.breakApart (0,250,file2,file3);//задача2 разбить
//        txtReader.glueTwoFiles (file2,file3);//задача2 склеить
//        txtReader.enDeCrypt (file1,"hello",file4);//задача3 шифрование XOR
//        txtReader.enDeCrypt (file4,"hello",file5);//задача3 дешифрование XOR
//        txtReader.enDeCryptFile (file1,file2,file4);//задача3 шифрование файлом, если файл ключ меньше, шифрует только часть исходного файла. Как это исправить?
        System.out.println (txtReader.sortedByteSet ());//задача4
    }
}
