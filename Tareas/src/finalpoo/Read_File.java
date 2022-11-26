/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpoo;

/**
 *
 * @author Sammy
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class Read_File {
    public static ArrayList create_search_array(){
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        try{    
            Scanner s = new Scanner(new File("src/users.csv"));
            s.useDelimiter(";");
            while(s.hasNext()){
                ArrayList<String> stds = new ArrayList<String>();
                for(int i = 0; i <=2; i++){
                    if(s.hasNext()){
                        String curr = s.next();
                        stds.add(curr);
                    }
                }
                list.add(stds);
            }
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace(); 
        }
        list.remove(list.size()-1);
        return list;
    }
}
