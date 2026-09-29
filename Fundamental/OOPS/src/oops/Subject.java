/**
 * @author Abdul Qadir
 * @date 23 Feb 2026
 * @time 5:18:32 am
 */
package oops;
public class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public Subject(String subId, String name, int maxMarks, int marksObtain){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }
    
    public String getSubId(){
        return subId;
    }
    
    public String getName(){
        return name;
    }
    
    public int getMaxMarksOptain(){
        return maxMarks;
    }
    
    public int getMaxMarks(){
        return maxMarks;
    }
    
    public void setMaxMarks(int m){
        maxMarks = m;
    }
    
    public void setMarksObtain(int m){
        marksObtain = m;
    }
    
    boolean isQualified(byte m){
        return m >= maxMarks;
    }
    
    public String toString(){
        return "\nSubjectID: " + subId + "\nNane: " + name + "\nMaximum Marks:" + maxMarks + "\nMarks Obtain: " + marksObtain; 
    }
}

class TestSub{
    public static void main(String[] args){
        Subject[] sub = new Subject[3];
        sub[0] = new Subject("S101", "Algorithm", 100, 45);
        sub[1] = new Subject("S102", "Python", 100, 77);
        sub[2] = new Subject("S103", "Ml", 100, 83);
        for(Subject s : sub){
            System.out.println(s);
        }
    }
}