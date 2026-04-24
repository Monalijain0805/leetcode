class Solution {
    public void setZeroes(int[][] arr) {
// //         int m=arr.length;
// //         int n=arr[0].length;
// //         int[][] helping_array= new int[m][n];
// //         for(int i=0;i<m;i++){
// //             for(int j=0;j<n;j++){
// //                 helping_array[i][j]=arr[i][j];
// //             }
// //         }
// //         for(int i=0;i<m;i++){
// //             for(int j=0;j<n;j++){
// //                 if(helping_array[i][j]==0){
// //                     for(int a=0;a<n;a++){
// //                         arr[i][a]=0;
// //                     }
// //                     for(int b=0;b<m;b++){
// //                         arr[b][j]=0;
// //                     }
// //                 }
// //             }
// //         }
// //     }
// // }
// //TC IS M*N




// class Solution {
//     public void setZeroes(int[][] arr) {
//         int m=arr.length;
//         int n=arr[0].length;
//         int[][] helping_array= new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 helping_array[i][j]=arr[i][j];
//             }
//         }
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(helping_array[i][j]==0){
//                     for(int a=0;a<n;a++){
//                         arr[i][a]=0;
//                     }
//                     for(int b=0;b<m;b++){
//                         arr[b][j]=0;
//                     }
//                 }
//             }
//         }
//     }
// }

int m=arr.length;
int n=arr[0].length;
int[][]helperArray=new int[m][n];
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        helperArray[i][j]=arr[i][j];
    }
}
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(helperArray[i][j]==0){
            for(int b=0;b<m;b++){
                arr[b][j]=0;
            }
            for(int a=0;a<n;a++){
                arr[i][a]=0;
            }
        }
    }
}
 }
}
