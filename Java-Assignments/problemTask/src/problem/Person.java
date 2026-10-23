package problem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private ArrayList<Problem> problems = new ArrayList<Problem>();

    public void addProblem(Problem problem){
        problems.add(problem);
    }

    public void solveProblem(Problem problem){

    }

    public List<Problem> tellProblem(){
        return problems;
    }
}
