package sort;

public class ecoSpot {
    public static int MaxHeight(int[] trees, int m){
        int s = 0;
        int e = -1;
        for(int i = 0; i < trees.length; i++){
            if(e <= trees[i]){
                e = trees[i];
            }
        }
        int ans = -1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(isValid(trees,m,mid)){
                ans = mid;
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isValid(int[] trees,int m,int mid){
        long woodCollected = 0;
        for (int tree : trees) {
            if (tree > mid) {
                int currentWoodCollection = tree - mid;
                woodCollected += currentWoodCollection;
            }
        }
        return woodCollected >= m;
    }

    public static int prathaTimes(int[] ranks, int pratha){
        int cook = ranks.length;
        int start = 0;
        int end = cook*((pratha*(pratha + 1))/2);
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(isChapti(ranks,pratha,mid)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isChapti(int[] ranks,int pratha, int mid ){
        int currentPratha = 0;
        for(int rank : ranks) {
            int timeTaken = 0;
            int j = 1;
            while (timeTaken + rank * j <= mid) {
                timeTaken += rank * j;
                currentPratha++;
                j++;

                if (currentPratha >= pratha) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] trees = {20, 15, 10, 17};
        int m = 7;

        int[] ranks = {1, 2, 3, 4};
        int pratha = 10;

        System.out.println(MaxHeight(trees,m));
        System.out.println(prathaTimes(ranks,pratha));
    }
}
