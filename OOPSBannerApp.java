/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 * 
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-Pattern mappings. The application retrieves and displays thje "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 *
 * @author developer
 * @version 7.0
 */
 
 // Extend the User Story 6 to implement a CharacterpatternMap class to encapsulate
 // character-to-pattern mappings. This application retrieves and displays the "OOPS"
 // banner using these mappings. Thereby addressing the drawback of not having
 // centralized character pattern management system.
 
 public class OOPSBannerApp
 {
	 /**
	  * CharacterPatternMap -Inner class for storing character-to-pattern mappings
	  *
	  * Encapsulates a single character and its corresponding ASCII art pattern.
	  * Provides immutable access to character and pattern data through getters.
	 */
	 static class CharacterPatternMap {
		 Character character;
		 String[] pattern;
		 
		 public CharacterPatternMap(Character character, String[] pattern) {
			this.character = character;
			this.pattern = pattern;
		 }
		 
		 public Character getCharacter() {
			return character;
		 }
		 
		 public String[] getPattern() {
			return pattern;
		 }
	 }
	 
	 public static CharacterPatternMap[] createCharacterPatternMaps() {
		String[] O = {
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
		};

		String[] P = {
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
		};

		String[] S = {
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
		};

		return new CharacterPatternMap[] {
			new CharacterPatternMap('O', O),
			new CharacterPatternMap('P', P),
			new CharacterPatternMap('S', S)
		};
	 }
	 
	 public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
		for (CharacterPatternMap map : charMaps) {
			if (map.getCharacter() == ch) {
				return map.getPattern();
			}
		}
		return null;
	 }

	 public static void printMessage(String message, CharacterPatternMap[] charMaps) {
		int height = 19;
		for(int i =0; i<height; i++){
			StringBuilder sb = new StringBuilder();
			for (char ch : message.toCharArray()){
				String[] pattern = getCharacterPattern(ch, charMaps);
				if (pattern != null){
					sb.append(pattern[i]).append(" ");
				}
			}
			System.out.println(sb);
		}
	 }

	 // Main method to run the banner display
	 public static void main(String[] args){
		// Create CharacterPatternMap array
		CharacterPatternMap[] charMaps = createCharacterPatternMaps();
		//Define the message to be displayed
		String message = "OOPS";
		// Print the banner message
		printMessage(message, charMaps);
	 }
 }