package exp3student;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
    public static String id_str; 
    public static String grade_str;
    public static String name;
    public static void main(String[] args) throws IOException{
    	System.out.println("��ǰѧ����");
    	File file = new File("Student.txt"); 
    	ReadFile(file);
        System.out.print("������¼��ѧ��������");
        int stu_num = get_num();
        Student []stu = new Student[stu_num]; 
        for (int i = 0; i < stu_num; i++)
        {
            get_information();
            for (int j = 0; j < i; j++)
            {
                while (id_str.equals(stu[j].return_id()))
                {
                    System.out.println("ѧ���ظ������������룡");
                    get_information();
                }
            }
            Student s = new Student(id_str, name, grade_str);
            stu[i] = s;
        }

        WriteFile(file, stu);
        ReadFile(file);
    }
    
    public static int get_num() {
        try {
            Scanner sc = new Scanner(System.in);
            int stu_num = sc.nextInt();
            if (stu_num < 0) {
                System.out.println("��������������");
                return get_num();
            }
            return stu_num;
        } catch (InputMismatchException e) {
            System.out.println("������������");
            return get_num();
        }
    }
    
    public static void get_information() //��ȡ��Ϣ
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("������ѧ�ţ�");
            long id = sc.nextLong();
            System.out.print("�������꼶��");
            int grade = sc.nextInt();
            System.out.print("������������");
            name = sc.next();

            Pattern pattern = Pattern.compile(".*\\d+.*");
            id_str = String.valueOf(id); 
            grade_str = String.valueOf(grade);
            if (pattern.matcher(name).matches())
            {
                System.out.println("���ֲ���Ϊ���֣����������룡");
                get_information();
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("����Ƿ������������룡");
            get_information();
        }
    }

    public static void WriteFile(File file, Student []stu) throws IOException 
    {
        FileWriter fw = new FileWriter(file,true); 
        BufferedWriter bw = new BufferedWriter(fw);

        for (Student s : stu)
        {
            bw.write(s.return_information());
            bw.newLine(); 
        }
        bw.close(); 
        fw.close();
    }

    public static void ReadFile(File file) throws IOException
    {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null)
        {
            System.out.printf(s + '\n'); 
        }
        br.close();
        fr.close();
    }
}