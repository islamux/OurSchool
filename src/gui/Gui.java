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

        School school = setSchoolWelcomeGui.setSchoolWelcomeInfo(); // حسب مافهمت تم انشاء اوبجكت لمرة واحده ثم يتم تعبئته عند بد التطبيق وطالما واللوب يعمل ولم يخرج البرنامج
        SchoolServices schoolServices = new SchoolServices(school); // السكول سرفسس يتم تعبئتها عند بدا البرنامج وتستخدم في كل البرنامج وطالما ان اللوب يعمل  ^_^
        // حفظك الله ياباش مهندس محمد ورحم والديك
        // سيتم تمريرها الى جميع الفنكشنات المنفصله بحمد الله ومنه وفضله
        printSchoolWelcomeGui.printSchoolWelcomeInfo(school);
        mainMenuFuncGui.mainMenu(schoolServices);





}}

