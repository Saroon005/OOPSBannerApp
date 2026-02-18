/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 * 
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improing modularity and reusability.
 *
 * @author developer
 * @version 4
 */
 
 // Extend the user story 3 to further develop the OOPS banner Application
 // by using String arrays to hold banner lines and printing them in a loop.
 // This use case improves upon UC3 by using a String array to store banner lines
 // and iterating through them with a for each loop, eliminating hardcoded print
 // statements and improving modularity and reusability.
 
 public class OOPSBannerApp
 {
	 // Main method to run the banner display
	 // Print each line of the OOPS banner to create the visual effect for the
	 // message "OOPS". Construct each line using string concatenation.
	 // Each line corresponds to a row in the banner for the letters O, O, P, S.
	 // Using for each loop to print the array.
	 public static void main(String[] args){
        String[] lines = new String[19];
		 lines[0]=String.join(" |||", "      * ***   ", "       * ***   ", "         ***** **   ", "       *******    ");
		 lines[1]=String.join(" |||", "    *  ****   ", "     *  ****   ", "      ******  ****  ", "     *       ***  ");
		 lines[2]=String.join(" |||", "   *  *  ***  ", "    *  *  ***  ", "     **   *  *  *** ", "    *         **  ");
		 lines[3]=String.join(" |||", "  *  **   *** ", "   *  **   *** ", "    *    *  *    ***", "    **        *   ");
		 lines[4]=String.join(" |||", " *  ***    ***", "  *  ***    ***", "        *  *      **", "     ***          ");
		 lines[5]=String.join(" |||", "**   **     **", " **   **     **", "       ** **      **", "    ** ***        ");
		 lines[6]=String.join(" |||", "**   **     **", " **   **     **", "       ** **      **", "     *** ***      ");
		 lines[7]=String.join(" |||", "**   **     **", " **   **     **", "     **** **      * ", "       *** ***    ");
		 lines[8]=String.join(" |||", "**   **     **", " **   **     **", "    * *** **     *  ", "         *** ***  ");
		 lines[9]=String.join(" |||", "**   **     **", " **   **     **", "       ** *******   ", "           ** *** ");
		 lines[10]=String.join(" |||", " **  **     **", "  **  **     **", "       ** ******    ", "            ** ** ");
		 lines[11]=String.join(" |||", "  ** *      * ", "   ** *      * ", "       ** **        ", "             * *  ");
		 lines[12]=String.join(" |||", "   ***     *  ", "    ***     *  ", "       ** **        ", "   ***        *   ");
		 lines[13]=String.join(" |||", "    *******   ", "     *******   ", "       ** **        ", "  *  *********    ");
		 lines[14]=String.join(" |||", "      ***     ", "       ***     ", "  **   ** **        ", " *     *****      ");
		 lines[15]=String.join(" |||", "              ", "               ", " ***   *  *         ", " *                ");
		 lines[16]=String.join(" |||", "              ", "               ", "  ***    *          ", "  **              ");
		 lines[17]=String.join(" |||", "              ", "               ", "   ******           ", "                  ");
		 lines[18]=String.join(" |||", "              ", "               ", "     ***            ", "                  ");
		 
		 for (String line : lines)
		 {
			 System.out.println(line);
		 }
	 }
 }