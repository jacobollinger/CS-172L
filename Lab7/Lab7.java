import java.util.Arrays;

class Lab7{

	static String shortestWord(String[] a){
		String w = a[0];
		for(int i = 1; i < a.length - 1; i++){
			if(a[i].length() < w.length()){
				w = a[i];
			}
		}
		return w;
	}

	static void sort(String[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j].compareTo(arr[j + 1]) > 0){
					exchange(arr, j, j + 1);
				}
			}
		}
	}
	static void exchange(String[] arr, int i, int j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static String[] nGram(String[] a, int n){
		String[] b = new String[a.length - n + 1];
		for(int i = 0; i < a.length - n + 1; i++){
			String temp = "";
			for(int j = 0; j < n; j++){
				temp += a[j + i];
				if(j < n - 1){
					temp += "/";
				}
			}
			b[i] = temp;
		}
		return b;
	}
	
	// charAt
	//indexOf
	static boolean allCommonLetter(String[] a){
		for(int i = 0; i < a[0].length(); i++){
			char ch = a[0].charAt(i);
			for(int j = 1; j < a.length; j++){
				if(a[j].indexOf(ch) >= 0){
					if(j == a.length - 1){
						return true;
					}	
				}else{
					break;
				}
			}
		}
		return false;
	}

	static boolean someCommonLetter(String[] a){
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length - i - 1; j++){
				for(int k = 0; k < a[i].length(); k++){
					char ch = a[i].charAt(k);
					if(a[j].indexOf(ch) >= 0){
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args){
		String[] a = {"do", "you", "want", "to", "play", "a", "game", "of", "chess", "?"};
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println("question 1:");
		System.out.println(shortestWord(a));
		System.out.println();
		System.out.println("question 2:");
		sort(a);
		System.out.println(Arrays.toString(a));
		a = new String[]{"do", "you", "want", "to", "play", "a", "game", "of", "chess", "?"};
		System.out.println();
		System.out.println("question 3:");
		System.out.println(Arrays.toString(nGram(a, 4)));
		System.out.println(Arrays.toString(nGram(a, 5)));
		System.out.println();
		System.out.println("question 4:");
		String[] b = {"do", "you", "want", "to"};
		String[] c = {"play", "a", "game", "of"};
		String[] d = {"do", "you", "to", "of"};
		String[] e = {"want", "to", "want"};
		String[] f = {"abcd", "efg", "hijk"};
		System.out.println(allCommonLetter(b) + " ");
		System.out.println(allCommonLetter(c) + " ");
		System.out.println(allCommonLetter(d) + " ");
		System.out.println(allCommonLetter(e) + " ");
		System.out.println("question 5:");
		System.out.println(someCommonLetter(b) + " ");
		System.out.println(someCommonLetter(c) + " ");
		System.out.println(someCommonLetter(d) + " ");
		System.out.println(someCommonLetter(e) + " ");
		System.out.println(someCommonLetter(f) + " ");
		System.out.println();
	}
}

// output:
// question 1:
// a

// question 2:
// [?, a, chess, do, game, of, play, to, want, you]

// question 3:
// [do/you/want/to, you/want/to/play, want/to/play/a, to/play/a/game, play/a/game/of, a/game/of/chess, game/of/chess/?]
// [do/you/want/to/play, you/want/to/play/a, want/to/play/a/game, to/play/a/game/of, play/a/game/of/chess, a/game/of/chess/?]

// question 4:
// false
// false
// true
// true

// question 5:
// true
// true
// true
// true
// false