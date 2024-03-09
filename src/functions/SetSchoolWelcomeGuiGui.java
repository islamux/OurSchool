package functions;

import interfaces.ISetSchoolWelcomeInfoGui;
import model.School;

public class SetSchoolWelcomeGuiGui implements ISetSchoolWelcomeInfoGui {
    @Override
    public School setSchoolWelcomeInfo() {

                School school = new School();
        school.setName("Madrasa");
        school.setAddress("Taiz Gamal Street");
        school.setPhone("7777777");
        return school;
    }
}
