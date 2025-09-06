// class Solution {
//     public static int pos(int n)
//     {
//         int pos=-1;
//         while(n!=0)
//         {
//             n=n>>1;
//             pos++;
//         }
//         return pos;
//     }

//     public int rangeBitwiseAnd(int left, int right) {

//         int res=0;

//         while(left>0 && right>0)
//         {
        
//             int l_pos=pos(left);
//             int r_pos=pos(right);
//             if(l_pos!=r_pos)
//             {
//                 break;
//             }
//             int msb_val=1<<l_pos;
//             res+=msb_val;

//             left-=msb_val;
//             right-=msb_val;
//         }
//         return res;
//     }
// }

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left >>= 1;   
            right >>= 1;
            shift++;      
        }

        return left << shift;
    }
}