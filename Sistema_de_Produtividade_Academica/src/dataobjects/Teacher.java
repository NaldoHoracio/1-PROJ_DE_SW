package dataobjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Researcher {
    private ArrayList<String> guidance = new ArrayList<>();

    public void addGuidance (String guidanceIn) {
        this.guidance.add(guidanceIn);
    }

    @Override
    public void addResearcher() {
        super.addResearcher();
    }

    @Override
    public boolean isTeacher() {
        return true;
    }

    @Override
    public boolean isMaxProjects() {
        return super.isMaxProjects();
    }

    @Override
    public void collaborador() {
        super.collaborator();
        System.out.println("Orientações do professor: ");
        for(String guiddanceCont: guidance) {
            System.out.println("	" + guiddanceCont);
        }
    }
}
