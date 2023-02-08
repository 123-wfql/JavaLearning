package studentmanagesystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Input {
	ArrayList<student_info> arry=new ArrayList<student_info>();    
	
	
	public Input(student_info stu){
		String t=null;
		try{
			FileReader f1 = new FileReader("student.txt");
			BufferedReader br=new BufferedReader(f1);				
			arry.clear();//	清除原数组列表中的数据				
			while ((t= br.readLine())!= null)
				{
				  String [] s=t.split("\\s+");				 
				  student_info st=new student_info(s[0],s[1],s[2],s[3],s[4],s[5],s[6]);//注意若该文件每行没有七个字符串，则会出错
				   arry.add(st);
				}
			     f1.close();
			     br.close();				     		    
				} catch (IOException e) {
						// TODO 自动生成的 catch 块
				e.printStackTrace();			
			}		
        

		FileWriter fw=null;
		BufferedWriter out=null;
		try {
			 fw = new FileWriter("student.txt");
			 out = new BufferedWriter(fw);
			 //姓名学号等中间隔一个空格
			 for(int i=0;i<arry.size();i++){
					String s=arry.get(i).fileString();
			    	out.write(s);
			    	out.newLine();
			    }
			out.close();
			fw.close();			
		} catch (IOException e) {
			e.printStackTrace();
					
	    }
	}
}
	
