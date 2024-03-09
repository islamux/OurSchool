package functions;

import interfaces.IPrintSchoolWelcomeFuncGui;
import model.School;

public class PrintSchoolWelcomeGuiGui implements IPrintSchoolWelcomeFuncGui {

    @Override
    public void printSchoolWelcomeInfo(School school) {
        System.out.println("Welcome to " + school.getName() +
                "\nin " + school.getAddress() +
                "\nNo Phone: " + school.getPhone());
    }
}
