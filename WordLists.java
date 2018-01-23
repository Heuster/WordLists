
/**
 * Write a description of class WordLists here.
 *
 * @author Danny Heu
 * @version 1.22.2018
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;
public class WordLists
{
    ArrayList<String> myList;
    
    public WordLists(){
        myList = new ArrayList<String>();
        myList.add("car");
        myList.add("frog");
        myList.add("hike");
        myList.add("shoe");
        myList.add("dog");
        //System.out.println(myList.size());
    }
    
    
    public int numWordsOfLength(int len){
        int count = 0;
        for (String i : myList){
            if (i.length() == len){
                count++;
            }
        }
        return count;
    }
    
    public void removeWordsOfLength(int len){
        for (int i = myList.size()-1; i >= 0; i--){
            if (myList.get(i).length() == len){
                myList.remove(i);
            }
        }
            }
        }
    

