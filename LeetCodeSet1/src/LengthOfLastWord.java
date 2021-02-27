
public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(new LengthOfLastWord().lengthOfLastWord(" "));
	}
	
	public int lengthOfLastWord(String s) {
        String strs[] = s.split(" ");
        if(strs.length==0) {
        	return 0;
        }
        return strs[strs.length-1].length();
    }

}
