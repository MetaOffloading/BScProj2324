package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireFlex;

public class Q_Sara3 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireFlex Sara3 = new QuestionnaireFlex();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		Sara3.name = "Sara3";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		Sara3.instructionText = "";

		//How many response options does the questionnaire have?
		Sara3.maxOptions = 6;

		//How many items (i.e. questions) does the questionnaire have?
		Sara3.nItems = 1;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		Sara3.itemsPerPage = 1;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		Sara3.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		Sara3.Init();
		
		for (int o=0;o<Sara3.nItems;o++) {
			for (int i=0;i<Sara3.maxOptions;i++) {
				Sara3.options[o][i]= "";
			}
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		Sara3.items[0] = "Please estimate how long you spend each day interacting "
				+ "with digital devices such as smartphones and computers.";
		Sara3.options[0][0] = "Less than 2 hours";
		Sara3.options[0][1] = "2-4 hours";
		Sara3.options[0][2] = "4-6 hours";
		Sara3.options[0][3] = "6-8 hours";
		Sara3.options[0][4] = "8-10 hours";
		Sara3.options[0][5] = "More than 10 hours";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		Sara3.Run();
	}
}
