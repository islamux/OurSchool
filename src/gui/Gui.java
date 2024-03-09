package gui;

import functions.MainMenuFuncGuiGui;
import functions.PrintSchoolWelcomeGuiGui;
import functions.SetSchoolWelcomeGuiGui;
import services.SchoolServices;
import model.School;


public class  Gui {
    public static  void start() {
        // to git access to : setSchoolWelcomeInfo, printSchoolWelcomeInfo, mainMenu
       SetSchoolWelcomeGuiGui setSchoolWelcomeGui = new SetSchoolWelcomeGuiGui();
       PrintSchoolWelcomeGuiGui printSchoolWelcomeGui = new PrintSchoolWelcomeGuiGui();
       MainMenuFuncGuiGui mainMenuFuncGui = new MainMenuFuncGuiGui();

        School school = setSchoolWelcomeGui.setSchoolWelcomeInfo(); 
        SchoolServices schoolServices = new SchoolServices(school); 
        printSchoolWelcomeGui.printSchoolWelcomeInfo(school);
        mainMenuFuncGui.mainMenu(schoolServices);





}}

