/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.in.a.text.file;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Shahzaib
 */
public class SearchInATextFile {

   


    public static void main(String[] args) throws IOException {
         Scanner sc=new Scanner(System.in);
        BufferedReader bf= new BufferedReader(new FileReader("C:/Java/Names.txt"));
        int j=0;
        String s=bf.readLine();
    String a[]=new String [s.length()];
   while(s!=null)
   {
       System.out.println(s);
            a[j]=s;
       s=bf.readLine();
       j++;
    }
       System.out.println("Enter the first letter of a last name to search");
   String t=sc.next();
       for (int i=0;i<a.length;i++)
       {
        String p=a[i].substring(a[i].indexOf(" "), a[i].length());
        System.out.println(p);
        String h =p.trim();
        if(h.startsWith(t.toUpperCase()))
        {
           // System.out.println(h);
            BufferedWriter bw =new BufferedWriter(new FileWriter("C:/Java/NewNames.txt",true));         
         bw.write(a[i]);
         bw.newLine(); 
         bw.close();
        }
       }
}}
