package functions;

import interfaces.IPrintSchoolWelcomeFunc;
import model.School;

public class PrintSchoolWelcomeGui implements IPrintSchoolWelcomeFunc {

    @Override
    public void printSchoolWelcomeInfo(School school) {
        System.out.println("Welcome to " + school.getName() +
                "\nin " + school.getAddress() +
                "\nNo Phone: " + school.getPhone());
    }
}
