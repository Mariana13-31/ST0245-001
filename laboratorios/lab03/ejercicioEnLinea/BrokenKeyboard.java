/**
 * This class is in charge of implementing the algorithm that
 * solves the problem of the broken keyboard
 * 
 * @author Mariana Quintero, Isabella Pérez
 * @version 1
 */

import java.util.LinkedList;

public class BrokenKeyboard
{
    public static void main(String []args){
        System.out.println(brokenKeyboard("This_is_a_[Beiju]_text"));
        System.out.println(brokenKeyboard("[[]][][]Happy_Birthday_to_Tsinghua_University"));
        System.out.println(brokenKeyboard("asd[fgh[jkl"));
        System.out.println(brokenKeyboard("asd[fgh[jkl["));
        System.out.println(brokenKeyboard("[[a[[d[f[[g[g[h[h[dgd[fgsfa[f"));
        System.out.println(brokenKeyboard("asd[gfh[[dfh]hgh]fdfhd[dfg[d]g[d]dg"));

    }

    /**
     * The brokenKeyboard method returns the way the text would look
     * taking into account that: when the 'Start' key is pressed it 
     * sends it to the beginning of the line, and 'End' to the end of it.
     * 
     * @param string , string that is going to be organized
     * @return newstring , the string organized
     **/
    public static String brokenKeyboard(String string){
        LinkedList<String> arr=new LinkedList<>();

        StringBuilder newstring =new StringBuilder("");
        boolean fin=true;

        for(int i=0; i<string.length();i++){
            char c = string.charAt(i);
            if(c =='[' || c == ']'){

                if(fin==true){
                    arr.addLast(newstring.toString());
                }else{
                    arr.addFirst(newstring.toString()); 
                }

                if(c=='['){
                    fin=false;
                }else{
                    fin=true;
                }
                newstring=new StringBuilder("");            
            }
            else{
                newstring.append(c);

            }

        }

        if(fin==true){
            arr.addLast(newstring.toString()); 
        }else{
            arr.addFirst(newstring.toString()); 
        }

        String txt="";
        while(arr.size()>0){ 
            txt=txt+arr.pollFirst(); 

        }

        return txt;
    }
}
