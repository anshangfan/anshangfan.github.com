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
            //键盘录入  
            br = new BufferedReader(new InputStreamReader(System.in));  
            //屏幕输出 
            System.out.println("请输入字符串：");
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
            //简单处理  
            e.printStackTrace();  
        }finally{  
            try {  
                br.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
          
          
          
    }  
    //字符转换，只对大小写字母进行转化  
    public static String wordChange(String line){  
        char[] ch = line.toCharArray();  
        //加入StringBuilder对字母进行增加  
        StringBuilder sb = new StringBuilder();  
        for(int i =0;i<ch.length;i++){  
            //加入判断，因为大写字母+32就是小写字母  
            if(ch[i]>='A'&&ch[i]<='Z'){  
                ch[i]+=32;  
                sb.append(ch[i]);  
            ////加入判断，因为小写字母-32就是大写字母  
            }else if(ch[i]>='a'&&ch[i]<='z'){  
                ch[i]-=32;  
                sb.append(ch[i]);  
            }else{  
                //对其他字母不进行判断  
                sb.append(ch[i]);  
            }  
        }  
        return sb.toString();  
    }  
  
}  