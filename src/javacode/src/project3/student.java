package javacode.src.project3;

public class student {
    String name;
    private int score[]=null;
    public  student(String name,int score[]){
        this.name=name;
        this.score=score;
    }

    public int getScore(){
        for(int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        return 0;
    }
    public double average(){
        int temp=0,average=0;
        for(int i = 0; i < score.length; i++) {
            temp+=score[i];
        }
        average=temp/score.length;
        return average;
    }
}
