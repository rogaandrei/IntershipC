package Mostenire.Ex3;

import java.util.ArrayList;

public class TeamLeader extends Staff{
    public TeamLeader(String name, int salary) {
        super(name, salary);
        team=new ArrayList<>();
    }

    ArrayList<Programator> team;
    public void assignWork(){
for(Programator developer:team){
    developer.code();
}
    }
    public void addProgramators(Programator programator){
        team.add(programator);
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "team=" + team +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
