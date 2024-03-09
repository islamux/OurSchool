package functions;

import interfaces.IFuntionsGui;
import interfaces.IMainMenuFuncGui;
import services.SchoolServices;

public class MainMenuFuncGuiGui implements IMainMenuFuncGui {
    IFuntionsGui functionsGui = new FunctionsGui();

    @Override
    public void mainMenu(SchoolServices schoolServices) {
        String response = "";
        do {
          functionsGui.whatDoYouWant();
          functionsGui.checkResponse(functionsGui.iWantTo(), schoolServices);
        } while (!response.equals("close"));
    }
}
