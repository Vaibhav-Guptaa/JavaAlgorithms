
import java.util.ArrayList;
import java.util.List;
class TrieNode {
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {

	private TrieNode root;
	public int count;

	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}





	/*..................... Palindrome Pair................... */


	static boolean isPalindrome(String str)
    {
        int len = str.length();
      
        // compare each character from starting
        // with its corresponding character from last
        for (int i = 0; i < len/2; i++ )
            if (str.charAt(i) != str.charAt(len-i-1))
                return false;
      
        return true;
    }
      
    // Function to check if a palindrome pair exists
    static boolean isPalindromePair(List<String> vect)
    {
        // Consider each pair one by one
        for (int i = 0; i< vect.size()-1; i++)
        {
            for (int j = i+1; j< vect.size() ; j++)
            {
                String check_str = "";
      
                // concatenate both strings
                check_str = check_str + vect.get(i) + vect.get(j);
      
                // check if the concatenated string is
                // palindrome
                if (isPalindrome(check_str))
                    return true;
 
                check_str = vect.get(j) + vect.get(i);
      
                // check if the concatenated string is
                // palindrome
                if (isPalindrome(check_str))
                    return true;
            }
        }
        return false;
    }


	
} 