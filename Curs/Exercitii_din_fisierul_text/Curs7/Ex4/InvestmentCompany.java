package Exercitii_din_fisierul_text.Curs7.Ex4;

import java.util.ArrayList;

public class InvestmentCompany {
    public void addProject ( Project p ) {
        System.out.println("Am adaugat un nou proiect " + p);
    }

    public Project getBestInvestment () {

        return null;
    }

    public static void main ( String[] args ) {
InvestmentCompany investmentCompany=new InvestmentCompany();
investmentCompany.addProject(new Project("KJHGFD",",mnbvc",new ArrayList<>(12000)));
investmentCompany.getBestInvestment();

    }

}
