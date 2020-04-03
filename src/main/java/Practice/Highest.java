package Practice;

public class Highest {
	
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        if (scores.length <=0 || scores.length >= 100000 || 
            lowerLimits.length <=0 || lowerLimits.length >= 100000 || 
            upperLimits.length <=0 || upperLimits.length >= 100000){
                return null;
        }
        if (lowerLimits.length != upperLimits.length){
            return null;
        }
        int value =0;
        int arr[] = new int[upperLimits.length];
        for (int i =0; i< lowerLimits.length;i++){
                for (int j =0;j<scores.length;j++){
                	
                    if (scores[j]>=lowerLimits[i] && scores[j] <= upperLimits[i]){
                        ++value;
                    }
                }
         arr[i]= value;
         value =0;
        }
    return arr;
    }

	public static void main(String[] args) {
		int scores[] = {4,8,7};
		int lowerLimits[] = {2,4};
		int upperLimits[] = {8,4};
	
		int arr[] = Highest.jobOffers(scores,lowerLimits, upperLimits);
		for (int i=0; i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
