package bai1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static void writeString(Scanner sc, String path) {
        File file = new File(path);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("file rong");
        }
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter bw =new BufferedWriter(osw);
        do {System.out.println("nhap doan van ban can dem");
            String str=sc.nextLine();
            try {
                bw.write(str);
                bw.flush();
                bw.newLine();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
            System.out.println("ban co muon dem doan van ban khac khong");

        }while (true);


    }
    public static int cntNumber(String str){
        int cnt=0;


        return  cnt;
    }
}