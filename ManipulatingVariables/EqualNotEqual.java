public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
        int songsB = 9;
        //To see if these are the same album, you’re going to compare the number of songs on each one, and the total length of the albums.
        boolean sameNumberOfSongs= songsA ==songsB;
        System.out.println(sameNumberOfSongs);

        int albumLengthA = 41;
        int albumLengthB = 53;
        //create a variable th that stores the result of checking whether the two album lengths are not the same.
        boolean differentLength = albumLengthA != albumLengthB;
        System.out.println(differentLength);
        }
}