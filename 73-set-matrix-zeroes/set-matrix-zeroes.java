class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length, n =arr[0].length;
        boolean zerorow =false;
        boolean zerocol = false;
        for(int z =0;z<n;z++){
            if(arr[0][z]==0){
                zerorow = true;
            }
        }
          for(int x =0;x<m;x++){
            if(arr[x][0]==0){
                zerocol= true;
            }
        }
        for (int i =1;i<m;i++){
            for(int j =1;j<n;j++){
               if(arr[i][j]==0){
                arr[0][j]=0;
                arr[i][0]=0; 
            }
        }        
    }
    for(int a=1;a<n;a++){
                if(arr[0][a]==0){
                   for(int b=0;b<m;b++){
                    arr[b][a]=0;
                    
                   } 
                }
    }
                   for(int c=1;c<m;c++){
                if(arr[c][0]==0){
                   for(int d=0;d<n;d++){
                    arr[c][d]=0;
                    
                }
            }
        }
 if(zerorow==true){
    for(int j =0;j<n;j++){
        arr[0][j]=0;
    }
 }

    if(zerocol==true){
    for(int i =0;i<m;i++){
        arr[i][0]=0;
    }
 }
    }
}
