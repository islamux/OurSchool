package functions;

import interfaces.ISetSchoolWelcomeInfo;
import model.School;

public class SetSchoolWelcomeGui implements ISetSchoolWelcomeInfo {
    @Override
    public School setSchoolWelcomeInfo() {

                School school = new School();
        school.setName("Madrasa");
        school.setAddress("Taiz Gamal Street");
        school.setPhone("7777777");
        return school;
    }
}
