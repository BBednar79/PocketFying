package desktopgui;

import javax.swing.JPanel;

public class ScreenController {
	public static void switchScreen(JPanel from, JPanel to){
		if (!(from.isVisible())){
			to.setVisible(true);
		}
	}
}
