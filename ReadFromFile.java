package AssignMents;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("/home/mahdi/IdeaProjects/JavaIOWorks/src/AssignMents/iict.txt"));
        String str;
        String[] token =null;
        int count=1;
        while ((str=br.readLine())!=null){
            token= str.split(" ");
            for(int i=0;i<token.length;i++)
            {
                if(token[i].equals(""))continue;
                for(int j=i+1;j<token.length;j++){
                    if (token[i].equals(token[j]))
                    {
                        token[j]="";
                        count++;
                    }
                }
                System.out.println("/'"+token[i]+"'/"+" = "+count+" times");
                token[i]="";
                count=1;

            }
        }
    }
}
