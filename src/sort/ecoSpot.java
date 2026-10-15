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

    public static void main(String[] args) {
        int[] trees = {20, 15, 10, 17};
        int m = 7;

        System.out.println(MaxHeight(trees, m));
    }
}
