package gui;

import services.SchoolServices;
import functions.FunctionsGui;
import interfaces.IFuntionsGui;
import model.School;


public class  Gui {
    public static  void start() {
       // to git access to : setSchoolWelcomeInfo, printSchoolWelcomeInfo, mainMenu
       
       IFuntionsGui funGui = new FunctionsGui();
       funGui.setSchoolWelcomeInfo();

       School school = funGui.setSchoolWelcomeInfo(); 
       funGui.printSchoolWelcomeInfo(school);
        
       // Start app
       SchoolServices schoolServices = new SchoolServices(school); 
       funGui.mainMenu(schoolServices);

}}

