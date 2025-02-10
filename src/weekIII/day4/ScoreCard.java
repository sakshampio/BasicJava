package weekIII.day4;

public class ScoreCard implements Comparable {
    private  String name;
    private  int score;
     ScoreCard(String name , int score){
         this.name = name;
         this.score = score;
     }

    public void setName(String Name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
         return score;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "ScoreCard{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int compareTo(ScoreCard o) {
//
        return Integer.compare(this.getScore(), o.getScore());
    }

    @Override
    public int compareTo(Object o) {
        return score-((ScoreCard)o).score;
    }
}
