package bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = readFile("filenguon.txt");
        writeFile("filedich.txt", list,count(list));
    }
    public static ArrayList<String> readFile(String path) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        File file = null;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            file = new File(path);
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                stringArrayList.add(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return stringArrayList;
    }

    public static void writeFile(String path, ArrayList<String> list, String count) {
        File file = null;
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            file = new File(path);
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            for (String str : list) {
                bw.write(str);
                bw.flush();
                bw.newLine();
            }
            bw.write(count);
            bw.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (osw != null) {
                    osw.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
    public static String count(ArrayList<String> list) {
        int count = 0;
        for (String str : list) {
            count += str.length();
        }
        return "so ki tu"+ count;
    }
    }
