package Compozitie;


import java.util.ArrayList;

public class FamilyMember {
    String name;
    int age;
    ArrayList<FamilyMember> familyMembers;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
        this.familyMembers=new ArrayList<>();
    }

    public static void main(String[] args) {
        FamilyMember pers1=new FamilyMember("Ion",20);
        FamilyMember pers2=new FamilyMember("Miron",30);
        pers1.addMember(pers2);
        pers1.printMyFamily();

        pers2.printMyFamily();
    }
    public void addMember(FamilyMember member){
        this.familyMembers.add(member);
        member.familyMembers.add(this);//pentru a face relatia dubla,adica daca un prieten1 are un priten 2 atunci si prieten 2 are un prieten1
    }
    public void printMyFamily(){
       for(FamilyMember membru:familyMembers ){
           System.out.println(membru);
       }

    }

    @Override
    public String toString() {
        return "FamilyMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
