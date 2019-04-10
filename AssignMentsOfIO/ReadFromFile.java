package AssignMents;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("/home/mahdi/IdeaProjects/JavaIOWorks/src/AssignMents/iict.txt"));
        String str,token="";
        int count,max=0;
        ArrayList<String>tokens = new ArrayList<String>();
        ArrayList<String>Uniquetokens = new ArrayList<String>();
        while((str = br.readLine()) != null) {
            String string[] = str.split("([,.\\s;]+)");
            for(String s : string){
                if(s!=" ")
                tokens.add(s);
            }
        }
        int u=0;
        for(int i = 0; i < tokens.size(); i++){
            count = 1;
            //Count each token in the file and store it in variable count  
            for(int j = i+1; j < tokens.size(); j++){
                if(tokens.get(i).equals(tokens.get(j))){
                    count++;
                    tokens.remove(j);
                }
            }
            if(count==1) {
                Uniquetokens.add(tokens.get(i));
                u++;
            }
            //If max is less than count then store value of count in max   
            //and corresponding token to variable token  
           if(count > max){
                max = count;
                token = tokens.get(i);
            }
            System.out.println(tokens.get(i)+" = "+count);
        }
        System.out.println("WE are Unique");
        for(int i = 0; i < u; i++) {
            System.out.println(Uniquetokens.get(i));

        }
     //   br.close();
    }
}
