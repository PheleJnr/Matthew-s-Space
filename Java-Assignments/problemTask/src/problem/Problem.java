package problem;

public class Problem {
   private String name;
   private String description;
   private ProblemType type;
   private boolean status;

    public Problem(String name , ProblemType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
