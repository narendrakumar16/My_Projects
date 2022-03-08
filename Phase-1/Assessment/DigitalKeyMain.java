package com.assessment;

import com.assessment.DigitalKey.HandleOptions;
import com.assessment.DigitalKey.MainMenuOptions;

public class DigitalKeyMain 
{
	public static void main(String[] args) {
		MainMenuOptions.welcomeScreen();
		HandleOptions.WelcomeScreen();
		DigitalKey.viewFiles("/Phase1Assessment");
	}
	}
