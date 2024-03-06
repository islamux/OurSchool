package gui;

import functions.MainMenuFuncGui;
import functions.PrintSchoolWelcomeGui;
import functions.SetSchoolWelcomeGui;
import services.SchoolServices;
import model.School;


public class  Gui {
    public static  void start() {
        // to git access to : setSchoolWelcomeInfo, printSchoolWelcomeInfo, mainMenu
       SetSchoolWelcomeGui setSchoolWelcomeGui = new SetSchoolWelcomeGui();
       PrintSchoolWelcomeGui printSchoolWelcomeGui = new PrintSchoolWelcomeGui();
       MainMenuFuncGui mainMenuFuncGui = new MainMenuFuncGui();

        School school = setSchoolWelcomeGui.setSchoolWelcomeInfo(); 
        SchoolServices schoolServices = new SchoolServices(school); 
        printSchoolWelcomeGui.printSchoolWelcomeInfo(school);
        mainMenuFuncGui.mainMenu(schoolServices);





}}

