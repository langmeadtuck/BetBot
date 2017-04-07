package csvReader;
/*
import java.nio.file.*;
import java.io.*;
public class CSV_Reader
{
   public static void main(String[] args)
   {
      Path file =
         Paths.get("D:/Tucker/Documents/Spring 2017/AI/Watson Agent/Data_QB.csv");
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         
         String s = reader.readLine();
         while(s != null)
         {
            System.out.println(s);
            s = reader.readLine();           
         }
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}

*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CSV_Reader {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws Exception {
                String splitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader("D:/Tucker/Documents/Spring 2017/AI/Watson Agent/Data_QB.csv"));
        String line = br.readLine();
        String[] b;
        int row = 1;
        
        
        ArrayList<String> name;
        name = new ArrayList<String>();
        
        ArrayList<Double> stats;
        stats = new ArrayList<Double>();
        
        //String[] name =new String[1] ;//=new String[row];// ={};
        //double[] stats =new double[1];
        while ((line = br.readLine()) !=null)
        {
        //	name=new String[row+1];// ={};
        	//stats=new double[row+1];// ={}
             b = line.split(splitBy);

             name.add(b[0]);    
             stats.add(Double.parseDouble(b[9]));
             
             
          //   name[row-1]=b[0];
            // stats[row-1]=Double.parseDouble(b[9]);
             
             //System.out.printf( "name: ", name[row] ); 
             
             //name (b[0]);
             //stats (b[9]);
  //           System.out.println(b[0]);
             
          //   System.out.printf( "stats: ", stats[row] );  
             
  //           System.out.println(b[9]);
             row ++;
        }
        br.close();
        for ( int row1 = 0; row1 < name.size()/*name.length*/; row1 ++ ) {
            System.out.println("Name: "+name.get(row1)+" Stats: "+stats.get(row1));
            //System.out.println("name: "+name[row1]+"stats: "+stats[row1]+"\n");    
        }
        Scanner getI=new Scanner(System.in);
        
        double compare[]={-1,-1};
        for(int n=0;n<2;n++){
	        	System.out.println("Enter an array value of a name to compare it to: ");
	        	double read=getI.nextInt();
	        	compare[n]=read;
	        	while(compare[n]>=stats.size()||compare[n]==-1){
	        		System.out.println("You entered a value out of bounds of the array size: ");
		        	read=getI.nextInt();
		        	compare[n]=read;
	        	}
        }
	        if(stats.get((int)compare[0])>stats.get((int)compare[1])){
	        	System.out.println("Name: "+name.get((int)compare[0])+"is the highest value with : "+stats.get((int)compare[0]));
	        	System.out.println("Name: "+name.get((int)compare[1])+"is the lowest value with : "+stats.get((int)compare[1]));
	        }
	        else if(stats.get((int)compare[0])<stats.get((int)compare[1])){
	        	System.out.println("Name: "+name.get((int)compare[0])+"is the lowest value with : "+stats.get((int)compare[0]));
	        	System.out.println("Name: "+name.get((int)compare[1])+"is the highest value with : "+stats.get((int)compare[1]));
	        }
	        else{
	        	System.out.println("Name: "+name.get((int)compare[0])+"is an equal value with : "+stats.get((int)compare[0]));
	        	System.out.println("Name: "+name.get((int)compare[1])+"is an equal value with : "+stats.get((int)compare[1]));
	        }
    }
}