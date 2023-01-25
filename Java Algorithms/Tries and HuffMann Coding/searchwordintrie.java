class TrieNode{

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

	public boolean search(String word ,TrieNode root){
          int ind  = word.charAt(0) - 'a' ;
          if(root.children[ind] == null){
             return false ;
         }
		if(word.length() == 0){
            return true ;
        }
        if(word.length() ==1){
            
            return (root.children[ind].data == word.charAt(0)) && root.children[ind].isTerminating == true  ;
        }
      
       
       if(root.children[ind].data == word.charAt(0)){
         //   System.out.println("**rue") ;
            return search(word.substring(1) ,root.children[ind]) ;
        }
        else{
            return false ;
        }
        
	}
	public boolean search(String word){
        return search(word, root) ;
    }

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));

	}

	public void add(String word){
		add(root, word);
	}
}