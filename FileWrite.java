package com.Testing;
import java.io.*;
public class FileWrite {
        public static void main(String arg[]) throws IOException {
            int ch;
            File ifi = new File("C:\\CapgJava\\CapgProject\\src\\com\\company\\input.txt");
            File ofi = new File("C:\\CapgJava\\CapgProject\\src\\com\\company\\output.txt");
                    FileReader fr = null;
                    FileWriter fw = null;
                    try {
                        fr = new FileReader(ifi);
                        fw = new FileWriter(ofi);
                        while ((ch = fr.read()) != -1)
                            fw.write(ch);
                    } catch (FileNotFoundException fe) {
                        fe.printStackTrace();
                        System.out.println("File not found");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try{
                        fr.close();
                        System.out.println("Writing successful");
                        fw.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();}

                }
            }

