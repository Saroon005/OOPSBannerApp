/**
 * OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Function
 * 
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap there by enhancing code organization and modularity.
 * 
 * @author developer
 * @version 8.0
 */
 
 // Extend the User Story 7 to utilize advanced Object-Oriented Programming concepts
 // such as the Collections Framework to manage character patterns in a more flexible
 // and efficient manner. The application retrieves and displays the "OOPS" banner
 // using these mappings.

 import java.util.HashMap;
 
 public class OOPSBannerApp
 {
	 /**
	  * Creates a HashMap containing ASCII art patterns for supported characters.
	  * 
	  * <p> Each character is mapped to an array of strings where each string represents
	  * one line of the character's ASCII art pattern. All patterns are assumed to have 
	  * the same height.
	  * 
	  * @return a HashMap where keys are characters (char) and values are String arrays
	  *         representing the ASCII art pattern lines for each character.
	 */
	 
	 public static HashMap<Character, String[]> createCharacterMap() {
		HashMap<Character, String[]> charMaps = new HashMap<>();
		charMaps.put('O', new String[] {
		"      * ***   ", 
		"    *  ****   ", 
		"   *  *  ***  ", 
		"  *  **   *** ", 
		" *  ***    ***", 
		"**   **     **", 
		"**   **     **", 
		"**   **     **", 
		"**   **     **", 
		"**   **     **", 
		" **  **     **", 
		"  ** *      * ", 
		"   ***     *  ", 
		"    *******   ", 
		"      ***     ", 
		"              ", 
		"              ", 
		"              ", 
		"              "
		});

		charMaps.put('P', new String[] {
		 "         ***** **   ", 
		 "      ******  ****  ", 
		 "     **   *  *  *** ", 
		 "    *    *  *    ***", 
		 "        *  *      **", 
		 "       ** **      **", 
		 "       ** **      **", 
		 "     **** **      * ", 
		 "    * *** **     *  ", 
		 "       ** *******   ", 
		 "       ** ******    ", 
		 "       ** **        ", 
		 "       ** **        ", 
		 "       ** **        ", 
		 "  **   ** **        ", 
		 " ***   *  *         ", 
		 "  ***    *          ", 
		 "   ******           ", 
		 "     ***            "
		});

		charMaps.put('S', new String[] {
		 "       *******    ", 
		 "     *       ***  ", 
		 "    *         **  ", 
		 "    **        *   ", 
		 "     ***          ", 
		 "    ** ***        ", 
		 "     *** ***      ", 
		 "       *** ***    ", 
		 "         *** ***  ", 
		 "           ** *** ", 
		 "            ** ** ", 
		 "             * *  ", 
		 "   ***        *   ", 
		 "  *  *********    ", 
		 " *     *****      ", 
		 " *                ", 
		 "  **              ", 
		 "                  ", 
		 "                  "
		});

		return charMaps;
	 }

	 /**
	  * Displays a banner message using the provided character map.
	  */
	 public static void displayBanner(String message, HashMap<Character, String[]> charMaps) {
		int height = charMaps.get('O').length;
		for(int line =0; line < height; line++){
			System.out.println(charMaps.get('O')[line] + " " + charMaps.get('O')[line] + " " + charMaps.get('P')[line] + " " + charMaps.get('S')[line]);
		}
	 }

	 // Main method to run the banner display
	 public static void main(String[] args){
		HashMap<Character, String[]> charMaps = createCharacterMap();
		String message = "OOPS";
		displayBanner(message, charMaps);
	 }
 }