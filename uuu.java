
public class uuu {
public static void main(String[] args) {
	
	String s="bvxqokorcxbivcnvdmcametgxvzftjkiyzatzatnapwttpxwqegvxllbtvxfnmwwbkicnaxmjxwgecexnndlgmwfsiusksumczuzfpajpmsboatncwzecbkxavloimnkllziuvaikvogykbcqizbqmdxyipclavzgvgonstdzpzskwvixgdfyblmmymtxwoxsoyqlqzbsyuatyebgkwznlnxqjefgkeluqcvtgmtvjsbaalxpqdmkptbqyefleiulcbsijglnawbwmbzuqybuqfmpewqnvnxqpawngtmuplfvlctyysbicubvnbjaayepapsotfzzfpdifsnpovufuuxsevipbbylkyoboqjatntvtqpbxjgposuleiqjnzbdecuzdjujweuztnwoggaoljoniwpkdbttjpnfomegodafcqpfjoxcpaiejdnnkvavjxgnbffuzkaozveqekvmdvwfnldlpzbkyioczsqnggspqgeyktlksupywxkgydwzovlndectcjwnxikuwcqdapqlvsdlboaesypkpujcdmwqmvfoqlsptkkzwsmauadiuqoygoucdzcgoodmdmwcaafwygzktolpqzvyovekgpobndncyzmpemzsxtzovjxzettonibczyyxdfvbealnzsoysminakkcwlmnnxnlultsnagfllmckenvbyimcmxsxkwfxcozjniayaydmausxgwntoxplvmnbqmgnbqibbksgxzjydswmdlmxdcjzszicsowtnntakaopldgywibqdbiapexeumwizozfdjzdjfevwkycctuoplypfvnlclilayfgntuaidctvxntujlaqzizoiueqgkydnzqfeaizobbniyswfaooxuzxfcuvsplksvgqnpitctdkymlytpxtzikveznmvzakpiecagzilefzluzfxexzwiwcfmwfgbvumcalixagmikxgdwjdblzlowyximkgwtwgkcycluaiuddfocelymvfccfb{-truncated-}";
	
	String h="hackerrank";
	String a="YES";
    String b="NO";
		int n=s.length();
		int i=0;
		int j=0;
		int o=0;
		int q=h.length();
		while(i<n) {
			if(!(s.charAt(i)==h.charAt(j))) {
				i++;
			}
			else if(s.charAt(i)==h.charAt(j)) {
			    
			    o++;
				i++;
				j++;
			}
			
		}
		 if(j==q){System.out.println(a);}
	        else{System.out.println(b);}	
}
}
