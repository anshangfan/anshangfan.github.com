package test;

import java.io.*;


public class test02 {  
  
    public static void main(String[] args) throws Exception{  
        transStream();  
  
    }  
    public static void transStream(){  
        BufferedReader br = null;  
        BufferedWriter bw = null;  
        try {  
            //����¼��  
            br = new BufferedReader(new InputStreamReader(System.in));  
            //��Ļ��� 
            System.out.println("�������ַ�����");
            bw = new BufferedWriter(new OutputStreamWriter(System.out));  
            String line = null;  
            while((line=br.readLine())!=null){  
                if("over".equals(line))  
                    break;  
                bw.write(wordChange(line));  
                bw.newLine();  
                bw.flush();  
            }  
        } catch (Exception e) {  
            //�򵥴���  
            e.printStackTrace();  
        }finally{  
            try {  
                br.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
          
          
          
    }  
    //�ַ�ת����ֻ�Դ�Сд��ĸ����ת��  
    public static String wordChange(String line){  
        char[] ch = line.toCharArray();  
        //����StringBuilder����ĸ��������  
        StringBuilder sb = new StringBuilder();  
        for(int i =0;i<ch.length;i++){  
            //�����жϣ���Ϊ��д��ĸ+32����Сд��ĸ  
            if(ch[i]>='A'&&ch[i]<='Z'){  
                ch[i]+=32;  
                sb.append(ch[i]);  
            ////�����жϣ���ΪСд��ĸ-32���Ǵ�д��ĸ  
            }else if(ch[i]>='a'&&ch[i]<='z'){  
                ch[i]-=32;  
                sb.append(ch[i]);  
            }else{  
                //��������ĸ�������ж�  
                sb.append(ch[i]);  
            }  
        }  
        return sb.toString();  
    }  
  
}  