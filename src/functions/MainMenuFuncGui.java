package functions;

import interfaces.IGuiFuntions;
import interfaces.IMainMenuFunc;
import services.SchoolServices;

public class MainMenuFuncGui implements IMainMenuFunc {
    IGuiFuntions functionsGui = new FunctionsGui();

    @Override
    public void mainMenu(SchoolServices schoolServices) {
        String response = "";
        do {
          functionsGui.whatDoYouWant();
          functionsGui.checkResponse(functionsGui.iWantTo(), schoolServices);
        } while (!response.equals("close"));
    }
}
